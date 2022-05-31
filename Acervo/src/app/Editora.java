package app;

import java.util.ArrayList;

public class Editora {

	private long id;
	private String nome, email;
	public ArrayList<Livro> lista = new ArrayList<Livro>();
	
	public Editora() {
		
	}
	public Editora(long id, String nome, String email, ArrayList<Livro> lista) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.lista = lista;
	}
	public ArrayList<Livro> getLista() {
		return lista;
	}
	public void adicionar(Livro l) {
		lista.add(l);
	}
	
	private long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
