package dao;

import java.util.ArrayList;
import java.util.List;


import model.Produto;

public class ProdutoDao {
	
	private final int INITIAL_SIZE = 100;
	private static ProdutoDao instance;
	private List<Produto> produtos;
	
	
	private ProdutoDao() {
		
		produtos = new ArrayList<>(INITIAL_SIZE);
	}
	
	public static ProdutoDao getInstance() {
		
		if(instance == null) {
			instance = new ProdutoDao();
		}
		return instance;
	}
	
	public int getSize() {
		
		return produtos.size();
	}
	
	public boolean inserirProduto(Produto p) {
		
		boolean ret = false;
		boolean rep = false;
		
		if(getSize() > 0) {
			
			for(int i = 0; i < getSize(); i++) {
				if(p.equals(produtos.get(i))) 
					rep = true;	
			}
		}
		if(!rep) {
			produtos.add(p);
			ret = true;
		}
		return ret;
	}
	
	
	public boolean removerProduto(Produto p) {
		
		boolean ret = false;
		
		if(getSize() > 0) {
			
			ret =  produtos.remove(p);
		}
		
		return ret;
	}
	
	//EU PRECISO DESSA FUNÇÃO
	//Ela tá chamada lá no main
	public void gerarRelatorio() {
		System.out.print("Produtos inseridos: \n");
		for(int i = 0; i<getSize(); i++) {
			System.out.print(produtos.get(i).toString());
			System.out.print("\n");
			System.out.print("----------------------------\n");
		}
	}
}


