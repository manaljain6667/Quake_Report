package com.example.android.quakereport;

public class Earthquakectivity {
    private double magnitude;
    private long mTimeInMilliseconds;
    private String location;
    private String url;

    public Earthquakectivity(double mag, String location, long timeInMilliseconds,String url) {
        this.magnitude = mag;
        this.location = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

