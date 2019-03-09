package br.unipe.java.questao05;

//Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu
//o seu carro com gasolina. Leia a quantidade de litros de gasolina foram
//necessários para abastecer o veículo e informe o valor total da conta desse cliente,
//sabendo-se que cada refrigerante custou R$3,00 e o litro de gasolina está
//custando R$2,50.

import java.util.Scanner;

public class Motorista {
    public static void main(String[] args) {
        double gasolina = 2.5;
        double refri = 3.0;
        double litro;
        double total;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Quantos litros voce abastaceu ? ");
        litro = leitor.nextDouble();

        total = (refri * 2) + (gasolina * litro);

        System.out.println("Sua conta foi de : "+ total);

        leitor.close();



    }
}
