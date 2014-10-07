package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class PlacePhoto {

    @JsonProperty("html_attributions")
    private String[] htmlAttribution;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    @JsonProperty("photo_reference")
    private String photoReference;

    public String[] getHtmlAttribution() {
        return htmlAttribution;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getPhotoReference() {
        return photoReference;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + height;
        result = prime * result
                + ((photoReference == null) ? 0 : photoReference.hashCode());
        result = prime * result + width;
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
        PlacePhoto other = (PlacePhoto) obj;
        if (height != other.height) {
            return false;
        }
        if (photoReference == null) {
            if (other.photoReference != null) {
                return false;
            }
        } else if (!photoReference.equals(other.photoReference)) {
            return false;
        }
        if (width != other.width) {
            return false;
        }
        return true;
    }


}
