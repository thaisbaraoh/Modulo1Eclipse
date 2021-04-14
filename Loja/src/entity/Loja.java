package entity;

public class Loja {
	//atributos
		private String nome;
		private String cnpj;
		
		//construtor
		public Loja(String nome, String cnpj) {
			super();
			this.nome = nome;
			this.cnpj = cnpj;
		}

		//encapsulamento
		public String getNome() {
			return nome;
		}	

		public String getCnpj() {
			return cnpj;
		}
		
		//metodos
		
		
	}
