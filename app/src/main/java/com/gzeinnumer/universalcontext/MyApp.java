package com.gzeinnumer.universalcontext;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

@SuppressLint({"StaticFieldLeak", "Registered"})
public class MyApp extends Application {
    private static MyApp instance = null;

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
    }

    public static Context getContext() {
        return instance;
    }
}
