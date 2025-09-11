package edu.pucgoias.construtores;

public class Main {
    public static void main(String[] args) {


        // Criando carro usando o construtor com parâmetros
        CarroDepois meuCarro = new CarroDepois("Ford", "Focus", 2021);
        meuCarro.exibirDetalhes(); // Saída: Marca: Ford, Modelo: Focus, Ano: 2021

        // Criando carro usando o construtor padrão
        CarroDepois outroCarro = new CarroDepois();
        outroCarro.exibirDetalhes(); // Saída: Marca: null, Modelo: null, Ano: 0
    }
}
