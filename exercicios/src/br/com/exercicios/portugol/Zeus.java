package br.com.poo.portugol_lista1;

import java.util.Scanner;

public class Zeus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1;
		int num2;
		int soma;
		int divisao;
		int multip;
		int subtrac;

		System.out.println("Bem vindo ao Programa Zeus!");
		System.out.println();

		System.out.println("Digite um numero: ");
		num1 = sc.nextInt();

		System.out.println("Digite outro numero: ");
		num2 = sc.nextInt();

		soma = num1 + num2;
		System.out.println("Soma: " + soma);

		subtrac = num1 - num2;
		System.out.println("Subtracao: " + subtrac);

		multip = num1 * num2;
		System.out.println("Multiplicacao: " + multip);

		if (num2 != 0) {
			divisao = num1 / num2;
			System.out.println("Divisao: " + divisao);
		} else {
			System.out.println("Erro, divisao por zero nao eh permitida.");
		}

		sc.close();
	}
}
