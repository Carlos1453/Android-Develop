package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rgOptions = findViewById(R.id.rgOptions);

        rgOptions.setOnCheckedChangeListener((radioGroup, i) -> {
            if (i == R.id.rbOp){
                Toast.makeText(this, "Opção 1", Toast.LENGTH_SHORT).show();
            }else if(i == R.id.rbOp2){
                Toast.makeText(this, "Opção 2", Toast.LENGTH_SHORT).show();
            }else if(i == R.id.rbOp3){
            Toast.makeText(this, "Opção 3", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Opção 4", Toast.LENGTH_SHORT).show();
        }
        });
    }
}