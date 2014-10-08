package com.github.fbdo.appengine.guice.services;


import com.google.appengine.api.blobstore.BlobstoreService;
import com.google.appengine.api.datastore.AsyncDatastoreService;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.memcache.MemcacheService;
import com.google.inject.AbstractModule;

/**
 * Created by fabio on 07/10/14.
 */
public class AbstractServiceModule extends AbstractModule {


    @Override
    protected void configure() {
        bind(TimeService.class).to(ClockTimeService.class);
        bind(BlobstoreService.class).toProvider(BlobstoreServiceProvider.class);
        bind(ImagesService.class).toProvider(ImagesServiceProvider.class);
        bind(MemcacheService.class).toProvider(CacheServiceProvider.class);
        bind(RequestBuilder.class).to(URLRequestBuilder.class);
        bind(DatastoreService.class).toProvider(DatastoreServiceProvider.class);
        bind(AsyncDatastoreService.class).toProvider(AsyncDatastoreServiceProvider.class);
    }
}
