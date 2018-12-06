package view;

import java.util.Scanner;

import model.Cliente;
import model.ClientePFisica;
import model.ClientePJuridica;
import DAO.ClienteDao;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int selecao;
		
		do {
			System.out.println("----------------------------");
			System.out.println("-----Saldão Vende Tudo!-----");
			System.out.println("----------------------------");
			System.out.println("----------------------------");
			System.out.println("1- Cadastrar pessoa física");
			System.out.println("2- Cadastrar pessoa Jurídica");
			System.out.println("3- Sair");
			System.out.println("----------------------------");
			System.out.print("Opção:");
			selecao = scan.nextInt();
			
			switch(selecao) {
				case 1: cadastrarPFisica();
						break;
				
				case 2: cadastrarPJuridica();
						break;
				
				case 3: System.out.println("Saindo...");
						break;
				
				default: System.out.println("Opção inválida!!");
			}
			
		}while(selecao != 3);
		
	}

	private static void cadastrarPJuridica() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("----------Dados gerais---------");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Razão Social: ");
		String razao = input.nextLine();
		
		System.out.print("CNPJ: ");
		String cnpj = input.nextLine();
		
		System.out.print("Email: ");
		String mail = input.nextLine();
		
		System.out.print("Senha: ");
		String senha = input.nextLine();
		
		System.out.print("Usuário: ");
		String user = input.nextLine();
		
		System.out.print("Telefone: ");
		String tel = input.nextLine();
		
		ClientePJuridica pj = new ClientePJuridica(nome, razao, cnpj, mail, senha, user, tel);
		
		System.out.println("-------------------------------");
		System.out.println("------------Endereço-----------");
		System.out.println("-------------------------------");
		
		System.out.print("Estado: ");
		String stado = input.nextLine();
		
		System.out.print("Cidade: ");
		String cid = input.nextLine();
		
		System.out.print("Bairro: ");
		String bairro = input.nextLine();
		
		System.out.print("Rua: ");
		String rua = input.nextLine();
		
		System.out.print("CEP: ");
		int cep = input.nextInt();
		input.nextLine();
		
		System.out.print("Número: ");
		int nro = input.nextInt();
		input.nextLine();
				
		pj.addEndereco(rua, bairro, cid, stado, nro, cep);
		DAO.ClienteDao.getInstance().inserirCliente(pj);
	}

	private static void cadastrarPFisica() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("----------Dados gerais---------");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Sobrenome: ");
		String sobre = input.nextLine();
		
		System.out.print("CPF: ");
		String cpf = input.nextLine();
		
		System.out.print("Email: ");
		String mail = input.nextLine();
		
		System.out.print("Senha: ");
		String senha = input.nextLine();
		
		System.out.print("Usuário: ");
		String user = input.nextLine();
		
		System.out.print("Telefone: ");
		String tel = input.nextLine();
		
		ClientePFisica pf = new ClientePFisica(nome, sobre, cpf, mail, senha, user, tel);
		
		System.out.println("-------------------------------");
		System.out.println("------------Endereço-----------");
		System.out.println("-------------------------------");
		
		System.out.print("Estado: ");
		String stado = input.nextLine();
		
		System.out.print("Cidade: ");
		String cid = input.nextLine();
		
		System.out.print("Bairro: ");
		String bairro = input.nextLine();
		
		System.out.print("Rua: ");
		String rua = input.nextLine();
		
		System.out.print("CEP: ");
		int cep = input.nextInt();
		input.nextLine();
		
		System.out.print("Número: ");
		int nro = input.nextInt();
		input.nextLine();
				
		pf.addEndereco(rua, bairro, cid, stado, nro, cep);
		
		System.out.println("-------------------------------");
		System.out.println("------------Cartões------------");
		System.out.println("-------------------------------");
		
		System.out.print("Titular: ");
		String titular = input.nextLine();
		
		System.out.print("Número: ");
		String numCart = input.nextLine();
		
		System.out.print("CPF do titular: ");
		String cpfTit = input.nextLine();
		
		System.out.print("Mes de vencimento: ");
		int mesV = input.nextInt();
		input.nextLine();
		
		System.out.print("Ano de vencimento: ");
		int anoV = input.nextInt();
		input.nextLine();
		
		System.out.print("Código: ");
		int codAcess = input.nextInt();
		input.nextLine();
		
		pf.addCartaoCredito(titular, numCart, mesV, anoV, cpfTit, codAcess);
		DAO.ClienteDao.getInstance().inserirCliente(pf);
	}
}


/*

MAIN ANTIGO

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
*/