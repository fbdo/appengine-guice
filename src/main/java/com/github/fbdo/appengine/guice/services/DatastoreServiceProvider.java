package com.github.fbdo.appengine.guice.services;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.inject.Provider;

/**
 * Created by fabio on 07/10/14.
 */
public class DatastoreServiceProvider implements Provider<DatastoreService> {

    @Override
    public DatastoreService get() {
        return DatastoreServiceFactory.getDatastoreService();
    }

}
