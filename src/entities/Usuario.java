package entities;

public class Usuario {
	
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome =nome; }
	
	public String getEmail() { return email;}
	public void setEmail(String email) { this.email = email; }
	
	public String getSenha() { return senha; }
	public void setSenha(String senha) { this.senha = senha; }
	
	@Override
	public String toString() {
		return id + " - " + nome + " (" + email + ")";
	}
	
	

}
