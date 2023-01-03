package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CheckBox cbNotifica = findViewById(R.id.cbNotifica);
        TextView textNotifica = findViewById(R.id.textNotifica);

        cbNotifica.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            if (isChecked){
            textNotifica.setText("ON");
            }else{
            textNotifica.setText("OFF");
            }

        });

    }
}