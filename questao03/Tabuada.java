package br.unipe.java.questao03;

//Faça um programa em Java que permita ao usuário escolher a tabuada que deseja
//ver. Mostrar a tabuada escolhida.

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int x, y;

        System.out.println("Digite o numero que deseja saber a tabuada : ");
        x = leitor.nextInt();

        for(int i = 0; i <= 10; i++){
            y = x * i;
            System.out.println(""+ x + " * "+ i +" = "+ y);
        }
        leitor.close();
    }
}
