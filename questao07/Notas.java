package br.unipe.java.questao07;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        int aprovados = 0, reprovados = 0, provaFinal = 0;
        double nota1, nota2, media, mediaG = 0;


        Scanner leitor = new Scanner(System.in);

        System.out.println("Media maior que 7 = APROVADO.");
        System.out.println("Media menor que 7 e maior que 3 = FINAL.");
        System.out.println("Media menor que 3 = REPROVADO.");


        for(int i = 0; i <= 6; i++){

            System.out.println("Digite a primeira nota: ");
            nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = leitor.nextDouble();

            media = (nota1 + nota2)/2;

            if(media >= 7.0){
                aprovados++;
            }
            else if(media < 3.0){
                reprovados++;
            }
            else if(media >= 3.0 && media < 7.0){
                provaFinal++;
            }
            mediaG += media;
        }
        System.out.println("Alunos aprovados : "+aprovados);
        System.out.println("Alunos reprovados : "+reprovados);
        System.out.println("Alunos para final : "+provaFinal);
        System.out.println("Media geral : "+ mediaG/6);

    }
}
