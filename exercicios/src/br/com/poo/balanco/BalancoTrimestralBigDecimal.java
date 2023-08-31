package br.com.poo.balanco;

import java.math.BigDecimal;

public class BalancoTrimestralBigDecimal {
    
	public static void main(String[] args) {
        
		BigDecimal gastosJaneiro = new BigDecimal(15000);
        BigDecimal gastosFevereiro = new BigDecimal(23000);
        BigDecimal gastosMarco = new BigDecimal(17000);

        BigDecimal gastosTrimestre = gastosJaneiro.add(gastosFevereiro).add(gastosMarco); // add para somar.
        System.out.printf("Os gastos do trimestre foram de: %.2f", gastosTrimestre);
    }
}