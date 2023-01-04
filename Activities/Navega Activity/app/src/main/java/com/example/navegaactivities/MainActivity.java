package com.example.navegaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSegundoActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegundoActivity = findViewById(R.id.btn_segundo_activity);

        btnSegundoActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SegundoActivity.class));
        });
    }
}