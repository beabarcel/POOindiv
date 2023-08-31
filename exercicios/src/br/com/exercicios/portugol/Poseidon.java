package br.com.poo.portugol_lista1;

import java.util.Scanner;

public class Poseidon {

	public static void main(String[] args) {
	
		String nome;
		String sobrenome;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Qual seu nome? ");
		nome = sc.nextLine();
		
		System.out.println("Qual seu sobrenome? ");
		sobrenome = sc.next();
		
		sc.close();
		
		System.out.println("Ola, " + nome + " " + sobrenome + " ");
	}

}
