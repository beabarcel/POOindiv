package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralDouble {

        private Double gastosJaneiro = 15000.00;
        private Double gastosFevereiro = 23000.00;
        private Double gastosMarco = 17000.00;

        private Double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        private static Logger logger = Logger.getLogger(BalancoTrimestralInteger.class.getName());
        
        public Double gastos() {
        	logger.log(Level.INFO, "O balanco trimestral eh de: R$" + gastosTrimestre);
        	return gastosTrimestre;
        }
}

