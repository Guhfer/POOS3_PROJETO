package model;

import java.util.List;

public class Produto {
	private String nome;
	private double preco;
	private double precoF;
	private List<Fornecedor> listFornecedor;
	private List<Insumo> listInsumos;
	
	public Produto( String nome, double preco, double precoF, Fornecedor...fornecedores) {
		this.nome = nome;
		this.preco = preco;
		this.precoF = precoF;
		adicionarFornecedores(fornecedores);
	}
	
	public Produto(String nome, double preco, Insumo...insumos) {
		this.nome = nome;
		this.preco = preco;
		adicionarInsumos(insumos);
	}
	
	public boolean adicionarInsumos(Insumo... insumos){
		
		boolean ret = false;
		
		for (Insumo i : insumos)  {
			ret = listInsumos.add(i);
		}
		
		return ret;
	}
	
	public boolean adicionarFornecedores(Fornecedor...fornecedores){
		
		boolean ret = false;
		
		for (Fornecedor f : fornecedores)  {
			ret = listFornecedor.add(f);
		}
		
		return ret;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguais = false;
		
		if(obj != null && obj instanceof Cliente) {
			if(this.nome.equalsIgnoreCase(((Produto)obj).nome))
				iguais = true;
		}
		return iguais;
	}
	
	
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
