package com.github.fbdo.appengine.guice.places;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonAutoDetect
public class PlaceResponse {

    @JsonProperty("html_attributions")
    private String[] htmlAttributions;

    @JsonProperty("next_page_token")
    private String nextPageToken;

    @JsonProperty("results")
    private Place[] results;

    @JsonProperty("status")
    private Status status;

    public String[] getHtmlAttributions() {
        return htmlAttributions;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public Place[] getResults() {
        return results;
    }

    public Status getStatus() {
        return status;
    }

}
