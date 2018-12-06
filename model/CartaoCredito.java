package model;

public class CartaoCredito {
	
	private String nomeTitular;
	private String numeroCartao;
	private int mesV;
	private int anoV;
	private String cpfTitular;
	private int codAcesso;
	
	public CartaoCredito(String nomeTitular, String numeroCartao, int mesV, int anoV, String cpfTitular, int codAcesso) {
		this.nomeTitular = nomeTitular;
		this.numeroCartao = numeroCartao;
		this.mesV = mesV;
		this.anoV = anoV;
		this.cpfTitular = cpfTitular;
		this.codAcesso = codAcesso;
		
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public int getMesV() {
		return mesV;
	}

	public int getAnoV() {
		return anoV;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public int getCodAcesso() {
		return codAcesso;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Nome titular: " + getNomeTitular());
		builder.append("\nNumero cartão: " + getNumeroCartao());
		builder.append("\nCPF titular: " + getCpfTitular());
		builder.append("\nData de vencimento: " + getMesV() + "/"+ getAnoV());
		builder.append("\nCódigo do cartão: " + getCodAcesso());

		return builder.toString();
		
	}
	
	
}
