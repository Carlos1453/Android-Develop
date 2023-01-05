package com.example.passandodadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView textName;
    private TextView textIdade;
    private TextView textAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textName = findViewById(R.id.text_nome);
        textIdade = findViewById(R.id.text_idade);
        textAltura  = findViewById(R.id.text_altura);

       Pessoa pessoa = (Pessoa) getIntent().getSerializableExtra("pessoa");

        textName.setText(pessoa.getNome());
        textIdade.setText(String.valueOf(pessoa.getIdade() +" anos"));
        textAltura.setText(String.valueOf(pessoa.getAltura() + " Cm"));
    }
}