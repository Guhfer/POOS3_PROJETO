package view;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import model.ClientePFisica;
import model.ClientePJuridica;
import model.Fornecedor;
import model.Insumo;
import model.Produto;

public class Main {
	final static int MAXFORN = 2;
	final static int MAXINS = 2;
	
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
			System.out.println("3- Cadastrar produto/Fornecedor");
			System.out.println("4- Cadastrar produto/Insumo");
			System.out.println("5- Relatório");
			System.out.println("6- Sair");
			System.out.println("----------------------------");
			System.out.print("Opção:");
			try {
				selecao = scan.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("Oops! Caractere não aceito!");
				selecao = 100;
				scan.nextLine();
			}
			
			switch(selecao) {
				case 1: Main.cadastrarPFisica();
						break;
				
				case 2: cadastrarPJuridica();
						break;
				
				case 3: cadastrarProdutoForn();
						break;
				
				case 4: cadastrarProdutoIns();
						break;
				
				case 5: geraRelatorio();
						break;
				
				case 6: System.out.println("Saindo...");
						break;
				
				default: System.out.println("Opção inválida!!");
			}
			
		}while(selecao != 6);
		
	}

	private static void geraRelatorio() {
		dao.ProdutoDao.getInstance().gerarRelatorio();
	}

	private static void cadastrarProdutoIns() {
		Scanner input = new Scanner(System.in);
		Insumo[] insumos = new Insumo[MAXINS];
		int count = 0;
		char desejo = 'N';
		
		System.out.println("-------------------------------");
		System.out.println("--------Sobre o Produto--------");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nomeProd = input.nextLine();
		
		System.out.print("Preço: ");
		Double preco = input.nextDouble();
		
		input.nextLine();
		System.out.println("-------------------------------");
		System.out.println("-------Sobre o Fornecedor------");
		System.out.println("-------------------------------");
		
		System.out.print("Preço sugerido pelo produto: ");
		double precof = input.nextDouble();
		
		System.out.print("Nome: ");
		String nome = input.nextLine();
		
		System.out.print("Telefone: ");
		String tel = input.nextLine();
		
		System.out.print("Email: ");
		String mail = input.nextLine();
		
		System.out.print("CNPJ: ");
		String cnpj = input.nextLine();
		
		System.out.print("Nome de contato: ");
		String nomeContato = input.nextLine();
		
		System.out.print("Usuário: ");
		String user = input.nextLine();
		
		System.out.print("Senha: ");
		String senha = input.nextLine();
		
		Fornecedor sup = new Fornecedor(precof, nome, tel, mail, cnpj, nomeContato, user, senha);
		
		do {
		System.out.println("-------------------------------");
		System.out.println("---------Sobre o Insumo--------");
		System.out.println("-------------------------------");
		
		System.out.print("Nome do Insumo: ");
		String nomeIns = input.nextLine();
		
		insumos[count] = new Insumo(nomeIns, sup);
		
		System.out.print("Deseja inserir mais insumos? S/N: ");
		desejo = input.next().charAt(0);
		input.nextLine();
		count++;
		}while(desejo == 'S' || desejo == 's');
				
		Produto prod = new Produto(nomeProd, preco, insumos);
		
		dao.ProdutoDao.getInstance().inserirProduto(prod);
	}

	private static void cadastrarProdutoForn() {
		Scanner input = new Scanner(System.in);
		Fornecedor[] fornecedores = new Fornecedor[MAXFORN];
		int count = 0;
		char desejo = 'N';
		
		do {
			System.out.println("-------------------------------");
			System.out.println("-----Sobre os Fornecedores-----");
			System.out.println("-------------------------------");
			
			System.out.print("Preço sugerido pelo produto: ");
			double precof = input.nextDouble();
			
			input.nextLine();
			System.out.print("Nome: ");
			String nome = input.nextLine();
			
			System.out.print("Telefone: ");
			String tel = input.nextLine();
			
			System.out.print("Email: ");
			String mail = input.nextLine();
			
			System.out.print("CNPJ: ");
			String cnpj = input.nextLine();
			
			System.out.print("Nome de contato: ");
			String nomeContato = input.nextLine();
			
			System.out.print("Usuário: ");
			String user = input.nextLine();
			
			System.out.print("Senha: ");
			String senha = input.nextLine();
			
			fornecedores[count] = new Fornecedor(nome, tel, mail, cnpj, nomeContato, user, senha);
			 
			System.out.print("Deseja inserir mais fornecedores? S/N: ");
			desejo = input.next().charAt(0);
			input.nextLine();
			count++;
			
		}while(desejo == 'S' || desejo == 's');
		
		System.out.println("-------------------------------");
		System.out.println("--------Sobre o Produto--------");
		System.out.println("-------------------------------");
		
		System.out.print("Nome: ");
		String nomeProd = input.nextLine();
		
		System.out.print("Preço: ");
		Double preco = input.nextDouble();
				
		Produto prod = new Produto(nomeProd, preco, fornecedores);
		
		dao.ProdutoDao.getInstance().inserirProduto(prod);
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
		dao.ClienteDao.getInstance().inserirCliente(pj);
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
		dao.ClienteDao.getInstance().inserirCliente(pf);
	}
}

