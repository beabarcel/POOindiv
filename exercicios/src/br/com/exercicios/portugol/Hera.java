package br.com.poo.portugol_lista1;

import java.util.Scanner;

public class Hera {

    public static void main(String[] args) {

        int soma = 0;
        int minhaIdade;
        int idade;
        int i;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            System.out.println("Qual a idade do seu colega? ");
            idade = sc.nextInt();
            soma = soma + idade;
        }

        System.out.println("Qual é a minha idade? ");
        minhaIdade = sc.nextInt();

        sc.close();

        soma = soma + minhaIdade;

        System.out.println("O tempo de vida meu e dos meus colegas eh " + soma);
    }

}
