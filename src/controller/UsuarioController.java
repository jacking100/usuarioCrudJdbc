package controller;

import java.util.List;

import entities.Usuario;
import repository.UsuarioRepository;

public class UsuarioController {
	private UsuarioRepository repo = new UsuarioRepository();
	
	public void cadastrar(String nome, String email, String senha) {
		Usuario u = new Usuario(null, nome, email, senha);
		repo.inserir(u);
	}
	
	public void listar() {
		List<Usuario> usuarios = repo.listar();
		if (usuarios.isEmpty()) {
		   System.out.println("Nenhum usuário cadastrado!");
		} else {
			usuarios.forEach(System.out::println);
			
		}
	}
	
	public void atualizar(int id, String nome, String email, String senha) {
		Usuario u = new Usuario(id, nome, email, senha);
		repo.atualizar(u);
	}
	
	public void deletar(int id) {
		repo.deletar(id);
		
	}

}
