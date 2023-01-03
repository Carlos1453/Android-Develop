package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSend = findViewById(R.id.btnSend);
        EditText edtNome =findViewById(R.id.edtNome);

        btnSend.setOnClickListener(view -> {
            Toast.makeText(this, edtNome.getText().toString(), Toast.LENGTH_SHORT).show();
        });
    }
}