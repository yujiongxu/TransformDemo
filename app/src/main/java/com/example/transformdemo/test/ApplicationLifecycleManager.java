package com.example.transformdemo.test;

import android.util.Log;

public class ApplicationLifecycleManager {

    private static final String TAG = "ApplicationLifecycleMan";
    public static void init() {

    }

    public static void registerApplicationLifecycleCallbacks(String appLifecycleClassName) {
        Log.d(TAG, "registerApplicationLifecycleCallbacks: >>>" + appLifecycleClassName);
    }

}
