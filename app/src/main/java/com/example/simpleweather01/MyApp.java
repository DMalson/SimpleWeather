package com.example.simpleweather01;

import android.app.Application;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WeatherInformer wi = WeatherInformer.getInstance();
    }
}
