package model;

import java.util.ArrayList;
import java.util.List;

public class ClientePFisica extends Cliente {
	

	private String sobrenome;
	String cpf;
	private List<CartaoCredito> listCartao;
	
	public ClientePFisica(String nome, String sobrenome, String cpf, String email, String senha, String usuario, String telefone) {
		
		super(nome, email, senha, usuario, telefone);
		this.sobrenome = sobrenome;
		this.cpf = cpf;

	}
	
	public ClientePFisica(String nome, String sobrenome, String cpf, String email, String senha, String usuario) {
		
		super(nome, email, senha, usuario);

		this.sobrenome = sobrenome;
		this.cpf = cpf;

	}
	
	public boolean addCartaoCredito (String nomeTitular, String numeroCartao, int mesV, int anoV, String cpfTitular, int codAcesso) {
		
		listCartao = new ArrayList<>();
		CartaoCredito card = new CartaoCredito(nomeTitular, numeroCartao, mesV, anoV, cpfTitular, codAcesso);
		
		return listCartao.add(card);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\nSobrenome: " + getSobrenome());
		builder.append("\nCPF: " + getCpf());
		builder.append(super.toString());
		builder.append("\n\nCartões cadastrados: \n");
		
		for(CartaoCredito cc : listCartao) {
			builder.append(cc.toString());
			builder.append("\n");
		}

		return builder.toString();
		
	}
	
	
	
	
}
