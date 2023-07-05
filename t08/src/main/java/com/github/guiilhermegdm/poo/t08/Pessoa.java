package com.github.guiilhermegdm.poo.t08;

import java.util.ArrayList;

public class Pessoa {

    public String nome;

    public ArrayList<Projeto> projetos;

    public ArrayList<Emprego> empregos;

    public ArrayList<Permissao> permissoes;

    public Pessoa(String nome) {
        this.nome = nome;
        this.projetos = new ArrayList<>();
        this.empregos = new ArrayList<>();
        this.permissoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProjeto(Projeto projeto){
        projetos.add(projeto);
    }

    public void removerProjeto(Projeto projeto){
        projetos.remove(projeto);
    }

    public void adicionarEmprego(Emprego emprego){
        empregos.add(emprego);
    }

    public void removerEmprego(Emprego emprego){
        empregos.remove(emprego);
    }

    public void adicionarPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public void removerPermissao(Permissao permissao){
        permissoes.add(permissao);
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public ArrayList<Emprego> getEmpregos() {
        return empregos;
    }

    public ArrayList<Permissao> getPermissoes() {
        return permissoes;
    }
}
