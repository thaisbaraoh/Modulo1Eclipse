package entity;

	public class Produto extends Loja{

		//atributos
		private String descricao;
		private String codigo;
		private double valorUnitario;
		protected int qtdeEstoque;
			
		//construtores
		public Produto(String nome, String cnpj, String descricao, String codigo, double valorUnitario, int qtdeEstoque) {
			super(nome, cnpj);
			this.descricao = descricao;
			this.codigo = codigo;
			this.valorUnitario = valorUnitario;
			this.qtdeEstoque = qtdeEstoque;
		}
		
		//encapsulamento - gettes and setters
		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getCodigo() {
			return codigo;
		}
		
		public double getValorUnitario() {
			return valorUnitario;
		}

		public int getQtdeEstoque() {
			return qtdeEstoque;
		}
		
		//metodos
		public void incluirEstoque(int valorSerIncluido) {
			this.qtdeEstoque += valorSerIncluido;
		}
		
		public void tirarEstoque(int valorSerExcluido) {
			if(valorSerExcluido <= 0) System.out.println("PEDIDO INVALIDO !\nCOMPRA NÃO REALIZADA");
			else if(this.qtdeEstoque >= valorSerExcluido) {
				this.qtdeEstoque -= valorSerExcluido;
			}else {
				System.out.println("PEDIDO INVALIDO !\nCOMPRA NÃO REALIZADA");
			}
		}	
	}
	

