package com.github.fbdo.appengine.guice.services;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.*;

public class URLRequestBuilder implements Serializable, RequestBuilder {

    /**
     *
     */
    private static final long serialVersionUID = -4308144287948448331L;
    private URL url;
    private StringBuilder parameters;

    /*
     * (non-Javadoc)
     *
     * @see
     * br.com.architecteam.imobee.model.RequestBuilder#withURL(java.lang.String)
     */
    @Override
    public RequestBuilder withURL(String urlStr) throws MalformedURLException {
        this.url = new URL(urlStr);
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * br.com.architecteam.imobee.model.RequestBuilder#post(java.lang.String)
     */
    @Override
    public URLConnection post(String data) throws IOException {
        if (url == null) {
            throw new IllegalArgumentException();
        }
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setDoInput(true);
        conn.setRequestMethod("POST");
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        wr.flush();
        wr.close();
        return conn;
    }

    @Override
    public RequestBuilder param(String name, String value) {
        try {
            if (parameters == null) {
                parameters = new StringBuilder();
                parameters.append(URLEncoder.encode(name, "UTF-8")).append("=")
                        .append(URLEncoder.encode(value, "UTF-8"));
            } else {
                parameters.append("&").append(URLEncoder.encode(name, "UTF-8"))
                        .append("=").append(URLEncoder.encode(value, "UTF-8"));
            }
            return this;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public URLConnection post() throws IOException {
        return post(parameters.toString());
    }

    @Override
    public RequestBuilder clear() {
        parameters = null;
        return this;
    }
}
