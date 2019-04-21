package com.example.simpleweather01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView txtPlace = findViewById(R.id.textPlace);
        TextView txtTemperatureValue = findViewById(R.id.textTemperatureValue);
        TextView txtPressureValue = findViewById(R.id.textPressureValue);
        TextView txtHumidityValue = findViewById(R.id.textHumidityValue);
        TextView txtWindDirection = findViewById(R.id.textWindDirection);
        TextView txtWindValue = findViewById(R.id.textWindValue);
        TextView txtPrecipitation = findViewById(R.id.textPrecipitation);

        WeatherInformer weatherInformer = WeatherInformer.getInstance();

        txtPlace.setText(weatherInformer.getPlace());
        txtTemperatureValue.setText(weatherInformer.getTemperature());
        txtPressureValue.setText(weatherInformer.getPressure());
        txtHumidityValue.setText(weatherInformer.getHumidity());
        txtWindValue.setText(weatherInformer.getWindForce());
        switch (weatherInformer.getWindDirection()) {
            case "0":
                txtWindDirection.setText(R.string.txt_wind_0);
                break;
            case "45":
                txtWindDirection.setText(R.string.txt_wind45);
                break;
            case "90":
                txtWindDirection.setText(R.string.txt_wind90);
                break;
            case "135":
                txtWindDirection.setText(R.string.txt_wind135);
                break;
            case "180":
                txtWindDirection.setText(R.string.txt_wind180);
                break;
            case "225":
                txtWindDirection.setText(R.string.txt_wind225);
                break;
            case "270":
                txtWindDirection.setText(R.string.txt_wind270);
                break;
            case "315":
                txtWindDirection.setText(R.string.txt_wind315);
                break;
        }
        switch (weatherInformer.getPrecipitation()) {
            case "0":
                txtPrecipitation.setText(R.string.txt_precipitation_0);
                break;
            case "1":
                txtPrecipitation.setText(R.string.txt_precipitation_1);
                break;
            case "2":
                txtPrecipitation.setText(R.string.txt_precipitation_2);
                break;
            case "3":
                txtPrecipitation.setText(R.string.txt_precipitation_3);
                break;
            case "4":
                txtPrecipitation.setText(R.string.txt_precipitation_4);
                break;
            case "5":
                txtPrecipitation.setText(R.string.txt_precipitation_5);
                break;
        }

        if (weatherInformer.isShowHumidity()) {
            txtHumidityValue.setVisibility(View.VISIBLE);
            findViewById(R.id.textHumidity).setVisibility(View.VISIBLE);
            findViewById(R.id.textHumidityUnits).setVisibility(View.VISIBLE);
        } else {
            txtHumidityValue.setVisibility(View.GONE);
            findViewById(R.id.textHumidity).setVisibility(View.GONE);
            findViewById(R.id.textHumidityUnits).setVisibility(View.GONE);
        }

        if (weatherInformer.isShowWind()) {
            txtWindDirection.setVisibility(View.VISIBLE);
            txtWindValue.setVisibility(View.VISIBLE);
            findViewById(R.id.textWind).setVisibility(View.VISIBLE);
            findViewById(R.id.textWindUnits).setVisibility(View.VISIBLE);
        } else {
            txtWindDirection.setVisibility(View.GONE);
            txtWindValue.setVisibility(View.GONE);
            findViewById(R.id.textWind).setVisibility(View.GONE);
            findViewById(R.id.textWindUnits).setVisibility(View.GONE);
        }

        if (weatherInformer.isShowPressure()){
            txtPressureValue.setVisibility(View.VISIBLE);
            findViewById(R.id.textPressure).setVisibility(View.VISIBLE);
            findViewById(R.id.textPressureUnits).setVisibility(View.VISIBLE);
        } else {
            txtPressureValue.setVisibility(View.GONE);
            findViewById(R.id.textPressure).setVisibility(View.GONE);
            findViewById(R.id.textPressureUnits).setVisibility(View.GONE);
        }

        if (weatherInformer.isShowPrecipitation()){
            txtPrecipitation.setVisibility(View.VISIBLE);
        } else {
            txtPrecipitation.setVisibility(View.GONE);
        }
    }
}
