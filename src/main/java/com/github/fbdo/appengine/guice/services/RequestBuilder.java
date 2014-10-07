package com.github.fbdo.appengine.guice.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLConnection;

public interface RequestBuilder {

    RequestBuilder withURL(String urlStr)
            throws MalformedURLException;

    RequestBuilder param(String name, String value);

    RequestBuilder clear();

    URLConnection post() throws IOException;

    URLConnection post(String data) throws IOException;

}