package model;

public class Insumo {
	private String nome;
	private Fornecedor f;
	
	public Insumo(String nome, Fornecedor f) {
		this.nome = nome;
		this.f = f;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fornecedor getF() {
		return f;
	}

	public void setF(Fornecedor f) {
		this.f = f;
	}
	
	@Override
	public String toString() {
		return "Insumo [nome=" + nome + ", f=" + f + "]";
	}
}
