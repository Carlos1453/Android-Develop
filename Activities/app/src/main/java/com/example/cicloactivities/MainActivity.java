package com.example.cicloactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button.findViewById(R.id.button);

        button.setOnClickListener(view -> {
            startActivity(new Intent(this, SegundaActivity.class));
        });
        Log.i("Info teste", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Info teste", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Info teste", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Info teste", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Info teste", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Info teste", "onDestroy: ");
    }
}