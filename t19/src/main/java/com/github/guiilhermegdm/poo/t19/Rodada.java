package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.List;

public class Rodada {

    private List<Jogador> jogares;
    private Monte monte;

    public Rodada(Monte monte) {
        this.jogares = new ArrayList<>();
        this.monte = monte;
    }
}
