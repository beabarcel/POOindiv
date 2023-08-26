package br.com.poo.lista1;

// biblioteca util
import java.util.Scanner;

public class Exercicio1 {

	// função inicio.
	public static void main(String[] args) {

		String nome;
		String sobrenome;

		// comando para importar biblioteca de leitura
		Scanner sc = new Scanner(System.in); // (se chama instância)

		// comando para escrever.
		System.out.println("Por favor, informe seu nome: ");
		nome = sc.nextLine();


		System.out.println("Por favor, informe seu sobrenome: ");
		sobrenome = sc.next();

		sc.close();

		System.out.println("Seja bem-vindo(a), " + nome + " " + sobrenome);
	
		limpa();
	}

	//função para limpar a tela
	public static void limpa() {
		for (int i = 0; i < 20; i++) {
			System.out.println();
	}
}
}
