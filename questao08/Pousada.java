package br.unipe.java.questao08;
//        Uma pousada estipulou o preço da diária em R$ 40,00 e mais uma taxa de
//        serviços diários de:
//        • R$ 15,00, se o número de dias for menor que 10;
//        • R$ 8,00, se o número de dias for maior ou igual a 10.
//        Criar um programa em Java que informe o nome, o valor da conta de cada cliente e
//        ao final o total arrecadado pela pousada. (Comando while)

import java.util.Scanner;

public class Pousada {
    public static void main(String[] args) {


        String nome;
        int dias, diaria = 40, taxa, total, apurado = 0;
        Scanner leitor = new Scanner(System.in);


        while (true) {


            System.out.println("Informe seu nome : ");
            nome = leitor.nextLine();

            System.out.println("Informe a quantos dias voce ficou em estadia : ");
            dias = leitor.nextInt();

            if (dias < 10) {
                taxa = 15;
                total = (taxa * dias) + (dias * diaria);
                System.out.println("Cliente: " + nome);
                System.out.println("Total: " + total);


            } else {
                taxa = 8;
                total = (taxa * dias) + (dias * diaria);
                System.out.println("Cliente: " + nome);
                System.out.println("Total: " + total);

            }



            apurado += total;

            System.out.println("Valor apurado: " + apurado);




        }

    }
}
