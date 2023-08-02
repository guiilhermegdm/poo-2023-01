package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.List;

public class Linha {

    private Ponto p1;
    private Ponto p2;
    private List<Ponto> pontos;

    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.pontos = new ArrayList<>();
    }
}
