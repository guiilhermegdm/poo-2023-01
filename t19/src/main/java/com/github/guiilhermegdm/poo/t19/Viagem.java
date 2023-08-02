package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.List;

public class Viagem {

    private Cidade destino;
    private Cidade origem;
    private Onibus onibus;
    private List<Passageiro> passageiros;
    private Motorista motorista;

    public Viagem(Cidade destino, Cidade origem, Onibus onibus, Motorista motorista) {
        this.destino = destino;
        this.origem = origem;
        this.onibus = onibus;
        this.passageiros = new ArrayList<>();
        this.motorista = motorista;
    }
}
