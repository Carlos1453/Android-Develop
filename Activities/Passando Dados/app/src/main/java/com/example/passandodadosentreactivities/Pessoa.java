package com.example.passandodadosentreactivities;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private int idade;
    private double altura;
    private String nome;

    public Pessoa() {
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
