package com.example.onactivityresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SegundaActivity extends AppCompatActivity {

   private EditText editNome;
   private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        editNome = findViewById(R.id.editNome);
        button = findViewById(R.id.button);



        button.setOnClickListener(view -> {
            String nome = editNome.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("meu_nome", nome);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}