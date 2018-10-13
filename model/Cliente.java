package model;

public abstract class Cliente {
	
	private String nome;
	private String email;
	private String senha;
	private String usuario;
	private String telefone;
	private ArrayGeneric<Endereco> listEnd;

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
		
		listEnd = new ArrayGeneric<>();
		Endereco end = new Endereco(rua, bairro, cidade, estado, numero, cep, complemento);
		
		return listEnd.add(end);
	}
	
	public boolean addEndereco (String rua, String bairro, String cidade, String estado, int numero, int cep) {
		
		listEnd = new ArrayGeneric<>();
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

