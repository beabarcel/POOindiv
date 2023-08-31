package br.com.poo.exercicios.aulas;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		String nome;
		String sobrenome;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ola, mundo!");
		System.out.println("\t");

		System.out.println("Escreva seu nome");
		nome = sc.nextLine();

		System.out.println("Escreva seu sobrenome");
		sobrenome = sc.next();

		sc.close();

		System.out.println("Meu nome é " + nome + " " + sobrenome);
	}

}
