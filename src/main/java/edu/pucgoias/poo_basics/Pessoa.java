package edu.pucgoias.poo_basics;

public class Pessoa {
    // atributos
    String nomeCompleto;
    int idade;
    String cpf;
    String rua;
    boolean alunoAtivo;

    // métodos/ações
    void apresentacao(String nome){
        System.out.println("Olá, sou: " + nome);
    }
}
