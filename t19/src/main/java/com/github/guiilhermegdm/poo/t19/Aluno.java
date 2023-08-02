package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Cargo {

    private List<Computador> computadores;
    private Computador computador;

    public Aluno(Computador computador) {
        this.computadores = new ArrayList<>();
        this.computador = computador;
    }
}
