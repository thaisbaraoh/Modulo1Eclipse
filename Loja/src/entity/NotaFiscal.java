package entity;

	public class NotaFiscal extends Bolsa{

		private int quantComprada;
		
		public NotaFiscal(String nome, String cnpj, String descricao, String codigo, double valorUnitario, int qtdeEstoque,
				String marca, int quantComprada) {
			super(nome, cnpj, descricao, codigo, valorUnitario, qtdeEstoque, marca);
			this.quantComprada = quantComprada;
		}

		public int getQuantComprada() {
			return quantComprada;
		}
	}
	
	
