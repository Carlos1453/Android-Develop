package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text_nome;
    private EditText edit_nome;
    private static final String ARQUIVO_PREFERENCE = "ArquivoPreferencia";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_nome = findViewById(R.id.text_nome);
        edit_nome = findViewById(R.id.edit_nome);
        recuperaDados();
    }

    public void salvarDados(View view){

        String nome = edit_nome.getText().toString();

        if(!nome.isEmpty()){

            SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCE, 0);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("meu_nome", nome);
            editor.apply();

        }else {
            edit_nome.setError("Informe seu nome");
        }

    }

    private void recuperaDados(){
        SharedPreferences sharedPreferences = getSharedPreferences(ARQUIVO_PREFERENCE, 0);

        String nomeRecuperado = sharedPreferences.getString("meu_nome", "");

        text_nome.setText(nomeRecuperado);


    }
}