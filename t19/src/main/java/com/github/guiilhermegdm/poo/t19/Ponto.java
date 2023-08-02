package com.github.guiilhermegdm.poo.t19;

public class Ponto {

    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mover(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
