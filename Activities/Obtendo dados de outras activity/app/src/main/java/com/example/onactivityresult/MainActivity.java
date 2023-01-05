package com.example.onactivityresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 1000;

    private TextView textNome;
    private Button button_segunda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textNome = findViewById(R.id.text_nome);
        button_segunda = findViewById(R.id.btn_segunda_activity);

        button_segunda.setOnClickListener(view -> {
            Intent intent = new Intent(this, SegundaActivity.class);
            startActivityForResult(intent, REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK){
            if(requestCode == REQUEST_CODE){
                String nome = (String) data.getSerializableExtra("meu_nome");
                textNome.setText(nome);
            }
        }
    }
}