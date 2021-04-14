package Entities;

public class Animal {

	private int idade;
	private String nome;
	
	public Animal(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void emitirSom () {
		System.out.println(nome+"emitir som");
	}
	
	

}

