package model;

public class ClientePJuridica extends Cliente {
	
	private String razaosocial;
	String cnpj;
	
	public ClientePJuridica(String nome, String razaosocial, String cnpj, String email, String senha, String usuario, String telefone) {
		
		super(nome, email, senha, usuario, telefone);
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;

	}
	
	public ClientePJuridica(String nome, String razaosocial, String cnpj, String email, String senha, String usuario) {
		
		super(nome, email, senha, usuario);
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;

	}
	
	public String getRazaosocial() {
		return razaosocial;
	}

	public String getCnpj() {
		return cnpj;
	}
	
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("\nRazão social: " + getRazaosocial());
		builder.append("\nCNPJ: " + getCnpj());
		builder.append(super.toString());

		return builder.toString();
		
	}
	
}
