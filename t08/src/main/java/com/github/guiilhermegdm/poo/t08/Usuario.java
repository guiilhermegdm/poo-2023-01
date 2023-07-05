package com.github.guiilhermegdm.poo.t08;

import java.util.ArrayList;

public class Usuario {

    private String nome;
    private Grupo grupo;

    private ArrayList<Diretorio> diretorios;

    public Usuario(String nome, Grupo grupo) {
        this.nome = nome;
        this.grupo = grupo;
        this.diretorios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void adicionarDiretorio(Diretorio diretorio){
        diretorios.add(diretorio);
    }

    public void removerDiretorio(Diretorio diretorio){
        diretorios.remove(diretorio);
    }

    public ArrayList<Diretorio> getDiretorios() {
        return diretorios;
    }
}
