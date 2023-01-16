package com.example.controledeprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FormProdutoActivity extends AppCompatActivity {

    private EditText edit_addproduto;
    private EditText edit_addestoque;
    private EditText edit_addvalor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_produto);

        edit_addproduto = findViewById(R.id.edt_addproduto);
        edit_addestoque = findViewById(R.id.edt_addestoque);
        edit_addvalor = findViewById(R.id.edt_addvalor);
    }

    public void salvarProduto(View view){

        String nome = edit_addproduto.getText().toString();
        String quantidade = edit_addestoque.getText().toString();
        String valor = edit_addvalor.getText().toString();

        if(!nome.isEmpty()){
            if(!quantidade.isEmpty()){
                int qtd = Integer.parseInt(quantidade);

                if(qtd >= 1){

                }else {

                }

            }else {
                edit_addestoque.requestFocus();
                edit_addestoque.setError("Informe a quantidade");
            }

        }else {
            edit_addproduto.requestFocus();
            edit_addproduto.setError("Informe o nome do produto");
        }

    }

}