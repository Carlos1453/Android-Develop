package com.example.navegaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {

    private Button btnTerceiroActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        btnTerceiroActivity = findViewById(R.id.btn_terceiro_activity);

        btnTerceiroActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, TerceiroActivity.class));
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}