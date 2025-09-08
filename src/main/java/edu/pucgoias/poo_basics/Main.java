package edu.pucgoias.poo_basics;

public class Main {
    public static void main(String[] args) {
        System.out.println("ok");

        Aluno alunoBruno = new Aluno();
        Aluno alunoPedro = new Aluno();

        Professor profThalles = new Professor();

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nomeCompleto = "Thalles";
        pessoa1.idade = 30;
        pessoa1.cpf = "99988877711";
        pessoa1.alunoAtivo = false;

        pessoa1.apresentacao("Thalles");

        System.out.println(pessoa1); // toString()
        System.out.println(pessoa1.toString()); // toString()
    }
}
