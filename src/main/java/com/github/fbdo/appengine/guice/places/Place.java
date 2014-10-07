package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Collection;

/**
 * @author fbdo
 */
@JsonAutoDetect
public class Place implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4695416295369916896L;

    @JsonProperty("id")
    private String id;

    @JsonProperty("vicinity")
    private String formattedAddress;

    @JsonProperty("geometry")
    private PlaceGeometry placeGeometry;

    @JsonProperty("icon")
    private String icon;

    @JsonProperty("name")
    private String name;
    @JsonProperty("rating")
    private float rating;

    @JsonProperty("reference")
    private String reference;

    @JsonProperty("types")
    private Collection<PlaceType> types;

    @JsonProperty("photos")
    private Collection<PlacePhoto> photos;

    @JsonProperty("opening_hours")
    private OpeningHour openingHour;

    @JsonProperty("price_level")
    private float priceLevel;

    public String getId() {
        return id;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public PlaceGeometry getPlaceGeometry() {
        return placeGeometry;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    public String getReference() {
        return reference;
    }

    public Collection<PlaceType> getTypes() {
        return types;
    }

    public Collection<PlacePhoto> getPhotos() {
        return photos;
    }

    public OpeningHour getOpeningHour() {
        return openingHour;
    }

    public float getPriceLevel() {
        return priceLevel;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Place other = (Place) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }


}
