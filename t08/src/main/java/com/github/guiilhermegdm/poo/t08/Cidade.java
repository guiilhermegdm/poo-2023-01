package com.github.guiilhermegdm.poo.t08;

public class Cidade {

    private String nome;
    private int populacao;


    public Pais pais;
    public Cidade(String nome, int populacao) {
        this nome = nome;
        this.populacao = populacao;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String ge nome() {
        return nome;
    }

    public void se nome(String nome) {
        this nome = nome;
    }
}
