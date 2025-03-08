package com.dias.aulacomponenteslistagemcolecoes.teste;

public class Pessoa {
    private String nome = "";
    private int idade = 0;

    //É quando fazermos a exibição
    public String getNome() {
        System.out.println("get: " + nome);
        return nome.toLowerCase();
    }

    //É quando eu uso pessoa.nome e atribuo um valor
    public void setNome(String nome) {
        System.out.println("set: " + nome);
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
