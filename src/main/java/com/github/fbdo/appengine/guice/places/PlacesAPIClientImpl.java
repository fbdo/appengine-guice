package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fbdo.appengine.guice.geocoder.GeoCoordinate;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author fbdo
 */
public class PlacesAPIClientImpl implements PlacesAPIClient {

    private final String placesURL;

    private static final Logger LOG = Logger.getLogger(PlacesAPIClient.class
            .getName());

    public PlacesAPIClientImpl(String key) {
        placesURL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?key=" + key + "&sensor=false";
    }

    @Override
    public PlaceResponse getResults(GeoCoordinate geo, int radiusInMeters) {
        try {
            URL url = new URL(new StringBuffer(placesURL).append("&location=")
                    .append(geo.getLatitude().toString()).append(",")
                    .append(geo.getLongitude().toString()).append("&radius=")
                    .append(radiusInMeters).toString());

            return getResults(url);
        } catch (MalformedURLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private PlaceResponse getResults(URL url) {
        try {
            LOG.fine("Searching places " + url);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(url.openStream(), PlaceResponse.class);
        } catch (MalformedURLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        } catch (IOException ioe) {
            LOG.log(Level.SEVERE, null, ioe);
        }
        return null;
    }

    @Override
    public PlaceResponse getResults(String nextPageToken) {
        try {
            URL url = new URL(new StringBuffer(placesURL)
                    .append("&pagetoken=").append(nextPageToken).toString());

            return getResults(url);
        } catch (MalformedURLException ex) {
            LOG.log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
