package com.github.guiilhermegdm.poo.t09;

import java.util.ArrayList;

public class Fornecedor {

    private String nome;
    private ArrayList<Transacao> transacoes;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
    }
}
