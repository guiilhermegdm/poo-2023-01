package com.github.guiilhermegdm.poo.t09;
import java.util.ArrayList;

    public class CaixeiroTest {
        public static void main(String[] args) {
            CaixeiroViajante caixeiro = new CaixeiroViajante();

            // Viagem 1
            ArrayList<String> viagem1Cidades = new ArrayList<>();
            viagem1Cidades.add("Cidade A");
            viagem1Cidades.add("Cidade B");
            Viagem viagem1 = new Viagem(viagem1Cidades);

            // Armazém 1
            Armazem armazem1 = new Armazem("Armazém 1");

            // Pedido 1
            Pedido pedido1 = new Pedido("Pedido 1");
            viagem1.adicionarPedido(pedido1, armazem1);

            caixeiro.adicionarViagem(viagem1);

            // Imprimir informações
            ArrayList<Viagem> todasViagens = caixeiro.getViagens();
            for (Viagem viagem : todasViagens) {
                System.out.println("Viagem:");
                for (String cidade : viagem.getCidades()) {
                    System.out.println(cidade);
                }
                System.out.println("Pedidos:");
                for (Pedido pedido : viagem.getPedidos()) {
                    System.out.println("  - Pedido: " + pedido.getDescricao());
                    System.out.println("    Armazém: " + pedido.getArmazem().getNome());
                }
                System.out.println();
            }
        }
    }
