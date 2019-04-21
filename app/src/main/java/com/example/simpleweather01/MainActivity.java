package com.example.simpleweather01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeatherInformer weatherInformer = WeatherInformer.getInstance();
                EditText txt = findViewById(R.id.editTextPlace);
                Switch swHumidity = findViewById(R.id.switchHumidity);
                Switch swWind = findViewById(R.id.switchWind);
                Switch swPressure = findViewById(R.id.switchPressure);
                Switch swPrecipitation = findViewById(R.id.switchPrecipitation);

                if (txt.getText().toString().length() > 0) {
                    weatherInformer.setPlace(txt.getText().toString());
                    weatherInformer.setShowHumidity(swHumidity.isChecked());
                    weatherInformer.setShowWind(swWind.isChecked());
                    weatherInformer.setShowPressure(swPressure.isChecked());
                    weatherInformer.setShowPrecipitation(swPrecipitation.isChecked());
                    Intent intent = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
