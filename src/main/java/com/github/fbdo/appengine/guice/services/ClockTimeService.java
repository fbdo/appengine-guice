package com.github.fbdo.appengine.guice.services;


import org.joda.time.DateTime;

/**
 * Created by fabio on 07/10/14.
 */
public class ClockTimeService implements TimeService {


    public long currentTimeInMillis() {
        return System.currentTimeMillis();
    }


    public DateTime currentTime() {
        return DateTime.now();
    }


}