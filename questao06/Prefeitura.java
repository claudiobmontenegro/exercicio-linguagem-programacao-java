package br.unipe.java.questao06;

//        A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
//        municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
//        bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
//        prestação e informar se o empréstimo pode ou não ser concedido.

import java.util.Scanner;

public class Prefeitura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double salario, limite, prestacao;




        System.out.println("Digite seu salario bruto : ");
        salario = leitor.nextDouble();
        System.out.println("Digite o valor da prestacao :");
        prestacao = leitor.nextDouble();

        limite =  salario * 0.3;



        if (limite >= prestacao){
            System.out.println("O credito foi aprovado. ");

        }
        else{
            System.out.println("O credito foi recusado. ");
        }

        leitor.close();
    }
}
