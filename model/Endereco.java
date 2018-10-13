package model;

public class Endereco {
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private int numero;
	private int cep;
	private String complemento;
	
	
	public Endereco(String rua, String bairro, String cidade, String estado, int numero, int cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
	}
	
	public Endereco(String rua, String bairro, String cidade, String estado, int numero, int cep, String complemento) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public int getNumero() {
		return numero;
	}

	public int getCep() {
		return cep;
	}

	public String getComplemento() {
		return complemento;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\nCEP: " + getCep());
		builder.append("\nEstado: " + getEstado());
		builder.append("\nCidade: " + getCidade());
		builder.append("\nBairro: " + getBairro());
		builder.append("\nRua: " + getRua());
		builder.append("\nNúmero: " + getNumero());
		builder.append("\nComplemento: " + getComplemento());
		
		return builder.toString();
		
	}
	
}


