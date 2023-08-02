package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Calendario {

    private Date ano;
    private List<Dia> feriados;
    private List<Evento> eventos;

    public Calendario(Date ano) {
        this.ano = ano;
        this.feriados = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }
}
