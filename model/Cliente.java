package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	
	private String nome;
	private String email;
	private String senha;
	private String usuario;
	private String telefone;
	private List<Endereco> listEnd;

	public Cliente(String nome, String email, String senha, String usuario, String telefone) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
		this.telefone = telefone;
	}
	
	public Cliente(String nome, String email, String senha, String usuario) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
	}
	
	public boolean addEndereco (String rua, String bairro, String cidade, String estado, int numero, int cep, String complemento) {
		
		listEnd = new ArrayList<>();
		Endereco end = new Endereco(rua, bairro, cidade, estado, numero, cep, complemento);
		
		return listEnd.add(end);
	}
	
	public boolean addEndereco (String rua, String bairro, String cidade, String estado, int numero, int cep) {
		
		listEnd = new ArrayList<>();
		Endereco end = new Endereco(rua, bairro, cidade, estado, numero, cep);
		
		return listEnd.add(end);
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getTelefone() {
		return telefone;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean iguais = false;
		
		if(obj != null && obj instanceof Cliente) {
			if(this.usuario.equalsIgnoreCase(((Cliente)obj).usuario))
				iguais = true;
		}
		return iguais;
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\nNome: " + getNome());
		builder.append("\nEmail: " + getEmail().toLowerCase());
		builder.append("\nUsuário: " + getUsuario());
		builder.append("\nTelefone: " + getTelefone());
		builder.append("\n\nEndereços cadastrados: \n");
		for(int i = 0; i < listEnd.size(); i++) {
			builder.append(listEnd.get(i).toString());
			builder.append("\n");
		}

		return builder.toString();
		
	}
}

