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
    private boolean showPressure;
    private boolean showHumidity;
    private boolean showWind;
    private boolean showPrecipitation;

    private WeatherInformer() {
    }

    public static WeatherInformer getInstance() {
        if (wiInstance == null) {
            wiInstance = new WeatherInformer();
        }
        return wiInstance;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setPlace(String place) {
        this.place = place.toUpperCase();
        switch (this.place){
            case "МОСКВА":
                temperature="+10";
                pressure="750";
                humidity="80";
                windForce="3-5";
                windDirection="135";
                precipitation="1";
                break;
            case "MOSCOW":
                temperature="+10";
                pressure="750";
                humidity="80";
                windForce="3-5";
                windDirection="135";
                precipitation="1";
                break;
            case "УФА":
                temperature="+15";
                pressure="760";
                humidity="75";
                windForce="6-8";
                windDirection="315";
                precipitation="0";
                break;
            case "UFA":
                temperature="+15";
                pressure="760";
                humidity="75";
                windForce="6-8";
                windDirection="315";
                precipitation="0";
                break;
            case "САНКТ-ПЕТЕРБУРГ":
                temperature="+8";
                pressure="740";
                humidity="95";
                windForce="8-12";
                windDirection="180";
                precipitation="2";
                break;
            case "SAINT PETERSBURG":
                temperature="+8";
                pressure="740";
                humidity="95";
                windForce="8-12";
                windDirection="180";
                precipitation="2";
                break;
            default:
                break;
        }

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

    public boolean isShowPressure() {
        return showPressure;
    }

    public void setShowPressure(boolean showPressure) {
        this.showPressure = showPressure;
    }

    public boolean isShowHumidity() {
        return showHumidity;
    }

    public void setShowHumidity(boolean showHumidity) {
        this.showHumidity = showHumidity;
    }

    public boolean isShowWind() {
        return showWind;
    }

    public void setShowWind(boolean showWind) {
        this.showWind = showWind;
    }

    public boolean isShowPrecipitation() {
        return showPrecipitation;
    }

    public void setShowPrecipitation(boolean showPrecipitation) {
        this.showPrecipitation = showPrecipitation;
    }
}
