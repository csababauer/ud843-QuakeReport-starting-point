package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake (double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public Long getTimeInMilliseconds(){
        return mTimeInMilliseconds;
    }

    public String getUrl (){
        return mUrl;
    }
}
