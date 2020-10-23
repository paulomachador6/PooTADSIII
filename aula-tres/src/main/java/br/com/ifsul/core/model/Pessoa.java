package br.com.ifsul.core.model;


public class Pessoa {

    private String nome;
    private String nascimento;
    private String cidade;
    private String estado;
    private String pais;


    public Pessoa(){}

    public Pessoa(String nome, String nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome(String nome) {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return this.nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
 }