package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.material.switchmaterial.SwitchMaterial;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwitchMaterial swNotifica = findViewById(R.id.swNotifica);

        TextView textNotifica = findViewById(R.id.textNotifica);

        swNotifica.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked){
                textNotifica.setText("On");

            }else {
                textNotifica.setText("Off");
            }

        });


    }
}