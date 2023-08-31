package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralInteger {

        private Integer gastosJaneiro = 15000;
        private Integer gastosFevereiro = 23000;
        private Integer gastosMarco = 17000;

        private Integer gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        private static Logger logger = Logger.getLogger(BalancoTrimestralInteger.class.getName());
        
        public int gastos() {
        	logger.log(Level.INFO, "O gasto trimestral eh de: R$ ");
        	return gastosTrimestre;
        }

        public int gastos(int janeiro, int fevereiro, int marco) {
        	int gastosTri = janeiro + fevereiro + marco;
        	System.out.printf("O gasto do primiro trimestre foi de: R$ %d\n", gastosTri);
        	return gastosTri;
        }
}

