package principal;

import java.util.Scanner;

import controller.UsuarioController;

public class App {
	public static void main(String[] args) {
		UsuarioController controller = new UsuarioController();
		Scanner sc = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n==== MENU USUÁRIO ====");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("0 - Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1 -> {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Email: ");
				String email = sc.nextLine();
				
				System.out.print("Senha: ");
				String senha = sc.nextLine();
				
				controller.cadastrar(nome, email, senha);
			}
			case 2 -> controller.listar();
			case 3 -> {
				System.out.print("ID: ");
				int id = sc.nextInt(); sc.nextLine();
				
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				
				System.out.print("Email: ");
				String email = sc.nextLine();
				
				System.out.print("Senha: ");
				String senha = sc.nextLine();
				controller.atualizar(id, nome, email, senha);
					
			}
			case 4 -> {
				System.out.print("ID: ");
				int id = sc.nextInt();
				controller.deletar(id);
			}
			case 0 -> System.out.println("Saido...");
			default -> System.out.println("Opção inválida!");
			
			}
		} while (opcao != 0);
		
		sc.close();
	}

}
