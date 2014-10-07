package com.github.fbdo.appengine.guice.services;

import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.inject.Provider;

/**
 * Created by fabio on 06/10/14.
 */
public class AsyncDatastoreServiceProvider implements Provider<AsyncDatastoreService> {

    @Override
    public AsyncDatastoreService get() {
        return DatastoreServiceFactory.getAsyncDatastoreService();
    }

}
