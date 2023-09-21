package br.com.poo.delegacia.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.poo.delegacia.Denuncia;
import br.com.poo.delegacia.Vitima;
import br.com.poo.menu.Menu;

public class LeituraEscrita {

	public static final String PATH_BASICO = "./temp/";
	static final String NOME = "delegacia";
	public static final String EXTENSAO = ".txt";

	public static void relatorioImpresso(HashMap<String, Vitima> mapaVitima, HashMap<String, Denuncia> mapaDenuncia)
			throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + "relatorio impresso.txt", true));

		for (Vitima vitima : mapaVitima.values()) {
			String cpfVitima = vitima.getCpf();

			buffWrite.append("** VÍTIMA **\n");
			buffWrite.append("CPF: " + cpfVitima + "\n");
			buffWrite.append("Nome: " + vitima.getNome() + "\n");

			buffWrite.append("** FIM VÍTIMA **\n");
		}

		for (Denuncia denuncia : mapaDenuncia.values()) {
			String idDenuncia = denuncia.getId();

			buffWrite.append("** DENÚNCIA **\n");
			buffWrite.append("ID: " + idDenuncia + "\n");
			buffWrite.append("Descrição: " + denuncia.getDescricao() + "\n");

			buffWrite.append("** FIM DENÚNCIA **\n");
		}

		buffWrite.close();
	}

	public static void relatorioTela(HashMap<String, Vitima> mapaVitima, HashMap<String, Denuncia> mapaDenuncia) {
		Logger logger = Logger.getLogger(Menu.class.getName());
		try (BufferedReader v = new BufferedReader(new FileReader("temp\\delegacia.txt"))) {
			String linha;
			while ((linha = v.readLine()) != null) {
				String[] dados = linha.split(";");
				String cpf = dados[3];
				if (dados.length >= 6) {
					Vitima vitima = new Vitima(dados[1], dados[2], cpf, dados[3], dados[4], dados[5]);
					mapaVitima.put(vitima.getCpf(), vitima);

					logger.log(Level.INFO, "Registro da vítima portadora do CPF " + vitima.getCpf() + ":"
							+ vitima.toString() + "\n\n");
				} else {
					logger.log(Level.INFO, "Dados incompletos para criar nova vítima");
				}
			}
		} catch (IOException e) {
			logger.log(Level.INFO, "Erro! A leitura não pede ser executada.");
		}
		try {
			BufferedReader d = new BufferedReader(new FileReader("temp\\delegacia2.txt"));
			String linha;
			while ((linha = d.readLine()) != null) {
				String[] dados = linha.split(";");
				String cpf = dados[5];
				Denuncia denuncia = new Denuncia(dados[1], dados[2], dados[3], dados[4], cpf);
				mapaDenuncia.put(denuncia.getId(), denuncia);

				logger.log(Level.INFO, "Registro de denúncia do(a) portador(a) do CPF " + denuncia.getFkCpfVitima()
						+ ": " + denuncia.toString() + "\n\n");
			}
			d.close();
		} catch (IOException e) {
			logger.log(Level.INFO, "Erro, A leitura não pede ser executada.");
		}
	}

}