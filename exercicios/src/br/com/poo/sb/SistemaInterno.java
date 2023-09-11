package br.com.poo.sb;

import br.com.poo.contas.Conta;

public class SistemaInterno {

	public static void main(String[] args) {
		Conta c1 = new Conta(123, "Beatriz", 1000.0);
		
		c1.getTitular();
		c1.getSaldo();
		c1.sacar(0.0);
		
		System.out.println(c1);
	}
	
}
