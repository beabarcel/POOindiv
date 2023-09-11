package br.com.poo.contas;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;
	
	public Conta() {
	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public boolean sacar(double valor) {
		if(this.saldo < valor) {
			return false;		
		} else if (valor <= 0.0) {
			System.out.println("Valor invalido!");
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Numero da conta: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo;
	}
	
	public int getNumero(){
		return numero;
	}
	
		public String getTitular() {
	
	return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
}

