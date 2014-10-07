package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class OpeningHour {

    @JsonProperty("open_now")
    private boolean openNow;

    public boolean isOpenNow() {
        return openNow;
    }

}
