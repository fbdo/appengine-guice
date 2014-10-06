package com.github.fbdo.appengine.guice;

import com.google.appengine.api.memcache.MemcacheService;
import com.google.appengine.api.memcache.MemcacheServiceFactory;
import com.google.inject.Provider;

/**
 * Created by fabio on 06/10/14.
 */
public class CacheServiceProvider implements Provider<MemcacheService> {

    @Override
    public MemcacheService get() {
        return MemcacheServiceFactory.getMemcacheService();
    }

}
