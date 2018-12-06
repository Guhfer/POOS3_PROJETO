package dao;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;



public class ClienteDao {
		
	private final int INITIAL_SIZE = 100;
	private static ClienteDao instance;
	private List<Cliente> clientes;
	
	
	private ClienteDao() {
		
		clientes = new ArrayList<>(INITIAL_SIZE);
	}
	
	public static ClienteDao getInstance() {
		
		if(instance == null) {
			instance = new ClienteDao();
		}
		return instance;
	}
	
	public boolean inserirCliente(Cliente c) {
		
		boolean ret = false;
		boolean rep = false;
		
		if(getSize() > 0) {
			
			for(int i = 0; i < getSize(); i++) {
				if(c.equals(clientes.get(i))) 
					rep = true;	
			}
		}
		
		if(!rep) {
			clientes.add(c);
			ret = true;
		}
		return ret;
	}
	
	public boolean removerCliente(Cliente c) {
		
		boolean ret = false;
		
		if(getSize() > 0) {
			
			ret =  clientes.remove(c);
		}
		
		return ret;
	}
	
	public int getSize() {
		
		return clientes.size();
	}
	
	
}
