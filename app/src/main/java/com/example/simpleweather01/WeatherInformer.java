package com.example.simpleweather01;

import android.util.Log;

public class WeatherInformer {
    private static WeatherInformer wiInstance;
    private String place;
    private String temperature = "+15";
    private String pressure = "780";
    private String humidity = "85";
    private String windForce = "6-8";
    private String windDirection = "45";
    private String precipitation = "0";


    private WeatherInformer() {
    }

    public static WeatherInformer getInstance() {
        if (wiInstance == null) {
            wiInstance = new WeatherInformer();
        }
        return wiInstance;
    }

    public String getTemperature() {
        return "+15";
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public String getPressure() {
        return pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWindForce() {
        return windForce;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public String getPrecipitation() {
        return precipitation;
    }
}
