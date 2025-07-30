package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String URL = "jdbc:postgresql://localhost:5432/usuariosdb";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(URL, USER, PASSWORD);
			
		}catch (Exception e) {
			throw new RuntimeException("Erro ao conectar ao banco: " + e.getMessage());
		}
	}

}
