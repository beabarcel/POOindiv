package br.com.poo.exercicios.aulas;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int num1;
		int num2;
		int resultado;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o 1º numero: ");
		num1 = sc.nextInt();

		System.out.println("Digite o 2º numero: ");
		num2 = sc.nextInt();

		/*
		 * System.out.println("A soma dos numeros eh: " + num1 + num2); não funcionou
		 */
		resultado = num1 + num2;

		sc.close();

		System.out.println("A soma dos numeros eh " + resultado);
	}

}
