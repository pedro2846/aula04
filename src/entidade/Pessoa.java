package entidade;

public abstract class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	
	// ctrl + espaço
	public Pessoa() {
		
	}
	
	
	// alt + shift + S + O
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\t\tEmail: " + email + "\tTelefone: "+ telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
