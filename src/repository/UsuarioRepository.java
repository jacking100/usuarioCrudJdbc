package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Usuario;
import factory.ConnectionFactory;

public class UsuarioRepository {

	public void inserir(Usuario usuario) {
		String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
		try (Connection conn = ConnectionFactory.getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.executeUpdate();
			System.out.println("Usuário cadastrado!");

		} catch (SQLException e) {
			System.out.println("Erro ao inserir: " + e.getMessage());
		}
	}

	public List<Usuario> listar() {
		List<Usuario> lista = new ArrayList<>();
		String sql = "SELECT * FROM usuarios";
		try (Connection conn = ConnectionFactory.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Usuario u = new Usuario(
						rs.getInt("id"), 
						rs.getString("nome"), 
						rs.getString("email"),
						rs.getString("senha")
						);
				lista.add(u);
			}
			

		} catch (SQLException e) {
			System.out.println("Erro ao listar: " + e.getMessage());
		}
		return lista;
	}
	
	public void atualizar(Usuario usuario) {
		String sql = "UPDATE usuarios SET nome =?, email=?, senha=? WHERE id=?";
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setInt(4, usuario.getId());
			int linhas = stmt.executeUpdate();
			if (linhas > 0)
				System.out.println("Usuário atualizado!");
			else
				System.out.println("Usuário não encontrado!");
			
			
		}catch (SQLException e) {
			System.out.println("Erro ao atualizar: " + e.getMessage());
		}
	}
	
	public void deletar(int id) {
		String sql = "DELETE FROM usuarios WHERE id=?";
		try (Connection conn = ConnectionFactory.getConnection();
			 PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setInt(1, id);
			int linhas = stmt.executeUpdate();
			if(linhas > 0)
				System.out.println("Usuário removido!");
			else
				System.out.println("Usuário não encontado!");
			
			
		} catch (SQLException e) {
			System.out.println("Erro ao deletar: " + e.getMessage());
		}
	}

}
