package model;

public class ListaCliente {
	public ArrayGeneric<Cliente> clientes;
	
	
	public ListaCliente() {
		clientes = new ArrayGeneric<>();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < clientes.size(); i++) {
			builder.append(clientes.get(i).toString());
			builder.append("\n");
			builder.append("\n");
			builder.append("-----------------------------------------------------------------------------------------");
		}
		return builder.toString();
	}
	
	
}
