package com.github.guiilhermegdm.poo.t09;

import java.util.ArrayList;

public class Pessoa {

    public String nome;
    public int idade;
    public ArrayList<Habito> habitos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.habitos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionarHabitos(Habito habito){
        habitos.add(habito);
    }

    public void removerHabitos(Habito habito){
        habitos.remove(habito);
    }

    public ArrayList<Habito> getHabitos() {
        return habitos;
    }
}
