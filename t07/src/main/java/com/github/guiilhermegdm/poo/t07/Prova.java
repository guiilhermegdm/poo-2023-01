package com.github.guiilhermegdm.poo.t07;

public abstract class Prova implements Identificacao{

    private byte numQuestoes;

    public byte getNumQuestoes(){
        return numQuestoes;
    }

    public void setNumQuestoes(byte n) {
        if (n > 0){
            numQuestoes = n;
        }
    }
}
