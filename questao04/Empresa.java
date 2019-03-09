package br.unipe.java.questao04;
//        Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são
//        inferiores a 500 reais. Escreva um programa que leia o salário de vários
//        funcionários se mostre o valor do salário reajustado ou uma mensagem caso o
//        funcionário não tenha direito ao aumento. O programa será encerrado quando se
//        digitar “fim” para o nome do funcionário.

import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {

        int x = 1;
        int salario;
        float novoSalario;
        String nome;

        while (x == 1){
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite seu salario atual : ");
            salario = leitor.nextInt();

            if(salario <= 500){
                novoSalario = (float) (salario * 1.20);

                System.out.println("Novo salario = "+ novoSalario);

            }
            else{
                System.out.println("Voce nao tem direito a um aumento");
            }
            System.out.println("Digite FIM para finalizar o programa : ");
            nome = leitor.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                leitor.close();
                x = 0;

            }

        }

    }
}
