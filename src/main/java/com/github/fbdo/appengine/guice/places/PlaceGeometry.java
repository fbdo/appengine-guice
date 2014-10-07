package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.fbdo.appengine.guice.geocoder.BoundingBox;
import com.github.fbdo.appengine.guice.geocoder.GeoCoordinate;

@JsonAutoDetect
public class PlaceGeometry {

    @JsonProperty("location")

    private GeoCoordinate location;

    @JsonProperty("viewport")
    private BoundingBox viewport;

    public GeoCoordinate getLocation() {
        return location;
    }

    public BoundingBox getViewport() {
        return viewport;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((location == null) ? 0 : location.hashCode());
        result = prime * result
                + ((viewport == null) ? 0 : viewport.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PlaceGeometry other = (PlaceGeometry) obj;
        if (location == null) {
            if (other.location != null) {
                return false;
            }
        } else if (!location.equals(other.location)) {
            return false;
        }
        if (viewport == null) {
            if (other.viewport != null) {
                return false;
            }
        } else if (!viewport.equals(other.viewport)) {
            return false;
        }
        return true;
    }


}
