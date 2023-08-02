package com.github.guiilhermegdm.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Garconete {

    private String nome;
    private List<Pedido> pedidos;

    public Garconete(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
