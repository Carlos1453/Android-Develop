package com.example.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToggleButton tButton = findViewById(R.id.tButton);
        ProgressBar progressBar = findViewById(R.id.progressBar);

        tButton.setOnCheckedChangeListener((compoundButton, b) -> {
        if(b){
            progressBar.setVisibility(View. VISIBLE);
        } else {
        progressBar.setVisibility(View. GONE);
        }
        });
    }
}