package com.example.simpleweather01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        TextView txtPlace=findViewById(R.id.textPlace);
        TextView txtTemperatureValue=findViewById(R.id.textTemperatureValue);
        TextView txtPressureValue=findViewById(R.id.textPressureValue);
        TextView txtHumidityValue=findViewById(R.id.textHumidityValue);

        WeatherInformer weatherInformer = WeatherInformer.getInstance();

        txtPlace.setText(weatherInformer.getPlace());
        txtTemperatureValue.setText(weatherInformer.getTemperature());
        txtPressureValue.setText(weatherInformer.getPressure());
        txtHumidityValue.setText(weatherInformer.getHumidity());

    }
}
