package com.example.navegaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TerceiroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiro);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}