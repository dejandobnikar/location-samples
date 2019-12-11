package com.google.android.gms.location.sample.locationupdates;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    public static final int MODE_CALLBACK = 1;
    public static final int MODE_PENDING_INTENT = 2;
    public int mode;

    @Override public void onCreate() {
        super.onCreate();
        mode = MODE_CALLBACK;
    }

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }
}
