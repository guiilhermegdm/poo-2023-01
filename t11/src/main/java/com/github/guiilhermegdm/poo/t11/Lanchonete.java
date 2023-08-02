package com.github.guiilhermegdm.poo.t11;

import java.util.ArrayList;

public class Lanchonete {

    private ArrayList<Funcionario> funcionarios;

    public Lanchonete() {
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
