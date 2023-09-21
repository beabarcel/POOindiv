package br.com.poo.delegacia;
import java.util.HashMap;
import java.util.Map;


public class Vitima {

	private String id;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endereco;
	private String telefone;
	
	public static Map<String, Vitima> mapaVitima = new HashMap<>();
	
	public Vitima() {
	}

	public Vitima(String id, String nome, String cpf, String dataNascimento, String endereco, String telefone) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "\nVITIMA," + id + ";" + nome + ";" +  cpf + ";" + dataNascimento + "," + endereco + "," + telefone;
	}
}

