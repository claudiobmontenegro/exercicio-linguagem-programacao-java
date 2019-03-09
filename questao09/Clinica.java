package br.unipe.java.questao09;

import java.util.Scanner;

public class Clinica {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String nome, sexo;

        int pacientes = 0, mediaIdadeHomens= 0, jovens= 0, mulheres= 0, idade= 0, homens= 0, ideal= 0;

        double peso;
        float altura;



        while (true) {
            System.out.println("Qual o seu nome? ");
            nome = leitor.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite M para Masculino e F para Feminino:  ");
            sexo = leitor.nextLine();

            System.out.println("Qual o seu peso? ");
            peso = leitor.nextDouble();

            System.out.println("Qual a sua idade? ");
            idade = leitor.nextInt();

            System.out.println("Qual a sua altura? ");
            altura = leitor.nextFloat();


            pacientes++;

            if (sexo.equalsIgnoreCase("m")) {
                homens++;
                mediaIdadeHomens += idade;
            }
            if (sexo.equalsIgnoreCase("f")) {
                mulheres++;
            }

            if (sexo.equalsIgnoreCase("f") && altura > 1.60 && altura <= 1.70 && peso > 70) {
                ideal++;
            }
            if (idade >= 18 && idade <= 25) {
                jovens++;
            }

            System.out.println("Pacientes :" + pacientes);
            System.out.println("Media idade homens: " + mediaIdadeHomens / homens);
            System.out.println("Mulher ideal: " + ideal);
            System.out.println("Jovens: " + jovens);


        }
    }
}
