package br.unipe.java.questao02;

//Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
//se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar

import java.util.Scanner;

public class Imparpar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        for(int i = 0; i <= 10; i++){
            int x;


            System.out.println("Digite um numero que eu lhe informarei se e impar ou par: \nTentativas Restantes: "+(10 - i));
            x = leitor.nextInt();

            if (x%2 == 0){
                System.out.println("Numero e par.");
            }
            else {
                System.out.println("Numero e impar.");
            }
        }
        leitor.close();

    }
}
