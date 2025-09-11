package edu.pucgoias.construtores;

public class CarroDepois {
    String marca;
    String modelo;
    int ano;

    // Construtor padrão (sem parâmetros)
    public CarroDepois() {
        System.out.println("Um novo objeto Carro foi criado!");
    }

    // Construtor com parâmetros para inicializar os atributos
    public CarroDepois(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    @Override
    public String toString() {
        return String.format("Modelo: %s - Marca: %s - Ano: %d", this.modelo, this.marca, this.ano);
    }
}
