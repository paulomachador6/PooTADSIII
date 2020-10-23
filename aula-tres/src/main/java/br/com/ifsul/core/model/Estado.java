package br.com.ifsul.core.model;

import java.util.Set;

public class Estado {

    private String nome;
    private String sigla;
    private Pais pais;

    public Estado(){}

    public Estado(String nome, String sigla){
        this.setNome(nome);
        this.setSigla(sigla);
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setSigla (String sigla){
        this.sigla = sigla;
    }
    public String getSigla(){
        return this.sigla;
    }

    public Estado(Pais pais) {
        this.pais = pais;
    }
}