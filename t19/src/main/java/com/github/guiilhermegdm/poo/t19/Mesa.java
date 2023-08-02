package com.github.guiilhermegdm.poo.t19;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private List<Pessoa> pessoas;
    private Data data;

    public Mesa(Data data) {
        this.pessoas = new ArrayList<>();
        this.data = data;
    }
}
