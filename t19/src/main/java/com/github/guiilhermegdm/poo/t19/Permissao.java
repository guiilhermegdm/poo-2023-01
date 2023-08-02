package com.github.guiilhermegdm.poo.t19;

public class Permissao {

    private Boolean leitura;
    private Boolean escrita;
    private Boolean execuao;

    public Permissao(Boolean leitura, Boolean escrita, Boolean execuao) {
        this.leitura = leitura;
        this.escrita = escrita;
        this.execuao = execuao;
    }
}
