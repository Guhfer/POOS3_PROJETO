package view;

import model.ClientePFisica;
import model.ClientePJuridica;
import model.ListaCliente;

public class Main {
	
	
	public static void main(String[] args) {
		
		ListaCliente lista = new ListaCliente();
		
		ClientePFisica cf1 = new ClientePFisica("Gustavo", "Fernandes", "55486525153" , "fernandes.guga@hotmail.com",
				"123456", "guhfer", "16912345678");
		
		ClientePJuridica cp1 = new ClientePJuridica("Kaique", "KVassouras", "56958423651258", "kaique@kvassouras.com",
				"kvassouras2018", "kvassouras", "16992558459");
		
		lista.clientes.add(cf1);
		lista.clientes.add(cp1);
		
		cf1.addEndereco("Gonçalves Dias", "Centro", "Araraquara", "São Paulo", 777, 14854585);
		cp1.addEndereco("Mariano Dultra", "Pinheiros", "Araraquara", "SP", 1458, 14852524, "Andar 5, apt 25");
		
		cf1.addCartaoCredito("Renan Junior", "1548562659854563", 5, 2023, "65936582965", 123);
		
		System.out.println(lista.toString());
	
	}
}
