package br.com.poo.balanco;

public class BalancoTrimestral {

    public static void main(String[] args) {
        
    	
        BalancoTrimestralInteger bti = new BalancoTrimestralInteger();
        bti.gastos();
        bti.gastos(15000, 23000, 17000);
        System.out.println(bti.gastos());
    }
}
