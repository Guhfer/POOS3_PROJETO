package model;

public class Fornecedor extends Cliente{
	String cnpj;
	String nomeContato;
	double precof;
	
	//utilizado pelo main:
	public Fornecedor(double precof, String nome, String telefone, String email, String cnpj, String nomeContato, String usuario, String senha)
	{
		super(nome, email, senha, usuario, telefone);
		this.cnpj = cnpj;
		this.nomeContato = nomeContato;
		this.precof = precof;
	}
	
	//inutilizado:
	public Fornecedor(String nome, String telefone, String email, String cnpj, String nomeContato, String usuario, String senha)
	{
		super(nome, email, senha, usuario, telefone);
		this.cnpj = cnpj;
		this.nomeContato = nomeContato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	//Necessária ao main:
	public double getPrecof() {
		return precof;
	}
	
	public String toString()
	{
		return "CNPJ: "+getCnpj()+"\n"+
			   "Nome contato: "+getNomeContato();
	}
}
