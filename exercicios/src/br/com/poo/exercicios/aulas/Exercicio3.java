package br.com.poo.exercicios.aulas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		int num1;
        int num2;
        int soma;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Digite outro numero: ");
        num2 = sc.nextInt();
        
        sc.close();
        
        soma = num1 + num2;
        System.out.println("O resultado da soma eh: " + soma);
        
        double conversor = (double) num1 / num2;
        System.out.println("O resultado da divisao eh: " + conversor);
    }
}




