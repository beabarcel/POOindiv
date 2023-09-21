package br.com.poo.menu;

import java.io.IOException;

import java.util.HashMap;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.delegacia.Denuncia;
import br.com.poo.delegacia.Vitima;
import br.com.poo.delegacia.io.LeituraEscrita;

public class Menu {

	public static void menu() throws IOException {

		boolean repete = true;
		Scanner ler = new Scanner(System.in);
		Logger logger = Logger.getLogger(Menu.class.getName());

		do {
			HashMap<String, Vitima> mapaVitima = new HashMap<>();
			HashMap<String, Denuncia> mapaDenuncia = new HashMap<>();

			logger.log(Level.INFO,
					"Escolha a opção desejada: \n********** MENU **********\n\n[1] Relatório impresso.\n[2] Relatório na tela.\n[3] Sair.");
			int opcao = ler.nextInt();

			switch (opcao) {
			case 1:
				LeituraEscrita.relatorioTela(mapaVitima, mapaDenuncia);
				
			case 2:
				LeituraEscrita.relatorioImpresso(mapaVitima, mapaDenuncia);
			}
			logger.log(Level.INFO, "Deseja fazer uma nova pesquisa?\n [1] Sim.\n [2] Não.\n");
			int opcao2 = ler.nextInt();
			if (opcao2 == 2) {
				logger.log(Level.INFO, "Fim da execucao.");
				repete = false;
			}
		} while (repete);
		ler.close();

	}

}

/*
 * static Scanner scanner = new Scanner(System.in);
 * 
 * public static void menu() throws IOException { while (true) {
 * System.out.println("******* MENU *******\n");
 * System.out.println("1. Listar vítimas.");
 * System.out.println("2. Listar denúncias.");
 * System.out.println("3. Listar denúncias de cada vítima");
 * System.out.println("4. Sair");
 * System.out.println("Digite a opção desejada: ");
 * 
 * int opcao = scanner.nextInt();
 * 
 * switch (opcao) {
 * 
 * case 1: System.out.println("\n\nLista de Vitimas: "); for (Vitima vitima :
 * Vitima.mapaVitima.values()) { System.out.println(vitima.getCpf()); }
 * System.out.println("\n\n"); menu(); break; case 2:
 * System.out.println("\n\nLista de Denuncias: "); for (Denuncia denuncia :
 * Denuncia.buscarDenuncia.values()) { System.out.println(denuncia.getId()); }
 * System.out.println("\n\n"); menu(); break; case 3: vitimaDenuncia(); break;
 * case 4: System.out.println("Você saiu do sistema.\n"); break; default:
 * System.out.println("Opção inválida! Digite um número novamente."); menu();
 * break; }
 * 
 * } }
 * 
 * @SuppressWarnings("unlikely-arg-type") public static void vitimaDenuncia()
 * throws IOException { List<Denuncia> listaDenuncia = new ArrayList<>(); Vitima
 * vitima = null;
 * System.out.println("Digite número da denúncia que você deseja visualizar.");
 * System.out.println("1. Assalto.\n"); System.out.println("2. Furto.\n");
 * System.out.println("3. Racismo.\n"); System.out.println("4. Agressão.\n");
 * System.out.println("5. Homofobia.\n");
 * System.out.println("0. Voltar ao menu anterior.");
 * 
 * int opcao = scanner.nextInt(); switch (opcao) { case 1: vitima =
 * Vitima.mapaVitima.get(1); listaDenuncia.clear(); for (Denuncia denuncia :
 * Denuncia.buscarDenuncia.values()) { if (denuncia.getId() == 1) {
 * System.out.println(denuncia.getDescricao()); listaDenuncia.add(denuncia); } }
 * LeituraEscrita.mapaVitima(vitima, listaDenuncia); vitimaDenuncia(); break;
 * 
 * case 2: vitima = Vitima.mapaVitima.get(2); listaDenuncia.clear(); for
 * (Denuncia denuncia : Denuncia.buscarDenuncia.values()) { if (denuncia.getId()
 * == 2) { System.out.println(denuncia.getDescricao());
 * listaDenuncia.add(denuncia); } } LeituraEscrita.inserirRegistro(vitima,
 * listaDenuncia); vitimaDenuncia(); break;
 * 
 * case 3: vitima = Vitima.buscarVitima.get(3); listaDenuncia.clear(); for
 * (Denuncia denuncia : Denuncia.buscarDenuncia.values()) { if (denuncia.getId()
 * == 3) { System.out.println(denuncia.getDescricao());
 * listaDenuncia.add(denuncia); } } LeituraEscrita.inserirRegistro(vitima,
 * listaDenuncia); vitimaDenuncia(); break;
 * 
 * case 4: vitima = Vitima.buscarVitima.get(4); listaDenuncia.clear(); for
 * (Denuncia denuncia : Denuncia.buscarDenuncia.values()) { if (denuncia.getId()
 * == 4) { System.out.println(denuncia.getDescricao());
 * listaDenuncia.add(denuncia); } } LeituraEscrita.inserirRegistro(vitima,
 * listaDenuncia); vitimaDenuncia(); break;
 * 
 * case 5: vitima = Vitima.buscarVitima.get(5); listaDenuncia.clear(); for
 * (Denuncia denuncia : Denuncia.buscarDenuncia.values()) { if (denuncia.getId()
 * == 5) { System.out.println(denuncia.getDescricao());
 * listaDenuncia.add(denuncia); } } LeituraEscrita.inserirRegistro(vitima,
 * listaDenuncia); vitimaDenuncia(); break;
 * 
 * case 0: menu(); break; default: System.out.println("Opção inválida!");
 * vitimaDenuncia(); break;
 * 
 * } }
 * 
 * }
 */
