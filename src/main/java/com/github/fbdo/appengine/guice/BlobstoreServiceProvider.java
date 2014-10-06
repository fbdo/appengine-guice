package com.github.fbdo.appengine.guice;

import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.blobstore.BlobstoreServiceFactory;
import com.google.inject.Provider;

/**
 * Created by fabio on 06/10/14.
 */
public class BlobstoreServiceProvider implements Provider<BlobstoreService> {

    @Override
    public BlobstoreService get() {
        return BlobstoreServiceFactory.getBlobstoreService();
    }

}