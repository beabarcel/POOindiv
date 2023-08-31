package br.com.poo.balanco;

public class BalancoTrimestralDouble {
	   
		public static void main(String[] args) {

	        Double gastosJaneiro = 15000.00;
	        Double gastosFevereiro = 23000.00;
	        Double gastosMarco = 17000.00;

	        Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	        System.out.printf("Os gastos do trimestre foram de: %.2f", gastosTrimestre);
	    }
	}
