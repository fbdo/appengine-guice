package com.github.fbdo.appengine.guice.services;

import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.inject.Provider;

/**
 * Created by fabio on 07/10/14.
 */
public class ImagesServiceProvider implements Provider<ImagesService> {

    @Override
    public ImagesService get() {
        return ImagesServiceFactory.getImagesService();
    }

}
