package model;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String nome;
	private double preco;
	//private double precoF; -> preçof é uma característica de cada vendedor
	private List<Fornecedor> listFornecedor;
	private List<Insumo> listInsumos;
	
	//Utilizado pelo main:
	public Produto( String nome, double preco, Fornecedor... fornecedores) {
		listFornecedor = new ArrayList<>(); //ADICIONEI ISSO - PRO MAIN FUNCIONAR
		
		this.nome = nome;
		this.preco = preco;
		adicionarFornecedores(fornecedores);
	}
	
	//Inutilizado:
	public Produto( String nome, double preco, double precoF, Fornecedor... fornecedores) {
		listFornecedor = new ArrayList<>(); //ADICIONEI ISSO - PRO MAIN FUNCIONAR
		
		this.nome = nome;
		this.preco = preco;
		//this.precoF = precoF;
		adicionarFornecedores(fornecedores);
	}
	
	//Utilizado pelo main:
	public Produto(String nome, double preco, Insumo...insumos) {
		listInsumos = new ArrayList<>(); //ADICIONEI ISSO - PRO MAIN FUNCIONAR
		
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
	
	/*Inutilizada:
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	*/
	
	//Utilizada pelo main:
	@Override
	public String toString(){
		System.out.println("Aqui foi");
		StringBuffer sb = new StringBuffer();
		double menor = listFornecedor.get(0).getPrecof();

		
		sb.append("-------------------------------\n");
		sb.append("Nome: ");
		sb.append(nome);
		sb.append("\n");
		sb.append("Preço: ");
		sb.append(preco);
		sb.append("\n");
		
		sb.append("Fornecedores: \n");
		
		for(int i=0; i<listFornecedor.size(); i++) {
			sb.append(listFornecedor.get(i).toString());
			sb.append("\n");
		}
		
		sb.append("Menor preço por: ");
		
		for(int i=0; i<listFornecedor.size(); i++) {			
			
			if(listFornecedor.get(i).getPrecof() < menor) {
				menor = listFornecedor.get(i).getPrecof();
				String getMenorPreco = listFornecedor.get(i).getNome();
				sb.append(getMenorPreco);
			}
		
		}
		
		
		sb.append("\n-------------------------------\n");
		
		return sb.toString();
	}
}
