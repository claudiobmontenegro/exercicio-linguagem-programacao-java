package br.unipe.java.questao01;

//Faça um programa que receba o valor do salário de um funcionário e o percentual
//de aumento, calcule e mostre o valor do aumento e o novo salário.

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        int salario, percentual, aumento, novoSalario;

        System.out.println("Digite seu salario atual : ");

        Scanner leitor = new Scanner(System.in);

        salario = leitor.nextInt();

        System.out.println("\nDigite o percentual de aumento : ");

        percentual = leitor.nextInt();

        novoSalario =  salario + (salario * percentual/100 );

        aumento = novoSalario - salario;

        System.out.println("\nSeu novo salario e de : "+ novoSalario);
        System.out.println("\nSeu aumento foi de : "+ aumento);


        leitor.close();

    }
}
