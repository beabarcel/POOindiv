package br.com.poo.delegacia;


import java.util.HashMap;
import java.util.Map;

public class Denuncia {
	private String id;
	private String local;
	private String descricao;
	private String data;
	private String fkCpfVitima;
	
	public static Map<String, Denuncia> buscarDenuncia = new HashMap<>();
	
	public Denuncia() {
	}

	public Denuncia(String id, String local, String descricao, String data, String fkCpfVitima) {
		this.id = id;
		this.local = local;
		this.descricao = descricao;
		this.data = data;
		this.fkCpfVitima = fkCpfVitima;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String data() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getFkCpfVitima() {
		return fkCpfVitima;
	}

	public void setFkCpfVitima(String fkCpfVitima) {
		this.fkCpfVitima = fkCpfVitima;
	}

	@Override
	public String toString() {
		return "\nDENUNCIA," + id + "," +  local + "," + descricao + "," + data;
	}
}
