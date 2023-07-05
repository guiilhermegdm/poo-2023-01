package com.github.guiilhermegdm.poo.t09;

import java.util.Scanner;

public class Circulo {

    public int xAxis;
    public int yAxis;
    public int raio;

    public Circulo(int xAxis, int yAxis, int raio) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.raio = raio;
    }

    public void transladar(int newX, int newY){
        this.xAxis = newX;
        this.yAxis = newY;
    }
    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public int getRaio() {
        return raio;
    }

    public void translar(int dX, int dY){
        this.xAxis = dX;
        this.yAxis = dY;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Circulo circulo1 = new Circulo(3,5,2);

        System.out.println("Digite a nova coordenada x: ");
        int newX = teclado.nextInt();
        System.out.println("Digite a nova coordenada y: ");
        int newY = teclado.nextInt();

        circulo1.transladar(newX, newY);
    }
}