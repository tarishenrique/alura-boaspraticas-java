package br.com.alura.domain;

public class Abrigo {
	
	private Long id;
	private String nome;
	private String telefone;
	private String email;
	private Pet[] pets;
	
	public Abrigo(String nome, String telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public Abrigo() {
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Pet[] getPets() {
		return pets;
	}

}
