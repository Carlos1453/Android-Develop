package com.example.passandodadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editIdade;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = findViewById(R.id.edit_nome);
        editAltura = findViewById(R.id.edit_altura);
        editIdade =findViewById(R.id.edit_idade);

        findViewById(R.id.btn_enviar).setOnClickListener(view -> {
            String nome = editNome.getText().toString();
            int idade = Integer.parseInt(editIdade.getText().toString());
            double altura = Double.parseDouble(editAltura.getText().toString());

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.setAltura(altura);

            Intent intent = new Intent(this, SegundaActivity.class);
            intent.putExtra("pessoa", pessoa);
            startActivity(intent);
        });
    }
}