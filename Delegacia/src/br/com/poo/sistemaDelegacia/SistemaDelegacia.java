package br.com.poo.sistemaDelegacia;

import java.io.IOException;

import br.com.poo.menu.Menu;

public class SistemaDelegacia {

	public static void main(String[] args) throws IOException {
		try {
			Menu.menu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
