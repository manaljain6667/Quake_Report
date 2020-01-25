package com.example.android.quakereport;
import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class EartquakeLoader extends AsyncTaskLoader<List<Earthquakectivity>>
{
    private static final String LOG_TAG = EartquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    public EartquakeLoader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }
    protected void onStartLoading() {
        forceLoad();
    }
    public List<Earthquakectivity> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Earthquakectivity> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
