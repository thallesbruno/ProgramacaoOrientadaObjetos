package edu.pucgoias.string_format;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("String Formatter");

        char sigla = 'z';
        // StringBuilder
        String nome = "THALLES"; //1 objeto String

        //nome = "Santos"; // 2 objeto String

        String nomeCompleto = nome + " Santos";
        System.out.println(nomeCompleto);

        if (nomeCompleto.equals("ASD")){
            System.out.println();
        } else {

        }

        if (true){

        } else if (false) {

        } else if (false) {

        } else {

        }

        System.out.println(nomeCompleto.toUpperCase());

        System.out.println(nomeCompleto.charAt(0));

        System.out.println(nomeCompleto.substring(0, 6));

        System.out.println(1); // conversão int para String

        String oito = String.valueOf(8); // vira String


        Scanner sc = new Scanner(System.in);
        String numero = sc.next();

        int numeroCalculado = Integer.parseInt(numero) + 10;
        // classe Estática - Integer

        System.out.println(numeroCalculado);

        DiasDaSemana hoje = DiasDaSemana.QUINTA;


    }
}
