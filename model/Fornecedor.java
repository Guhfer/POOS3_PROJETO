package model;

public class Fornecedor extends Cliente{
	String cnpj;
	String nomeContato;
	
	public Fornecedor(String codigo, String nome, String telefone, String email, String cnpj, String nomeContato)
	{
		super(codigo, nome, telefone, email);
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
	
	public String toString()
	{
		return "CNPJ: "+getCnpj()+"\n"+
			   "Nome contato: "+getNomeContato();
	}
}
