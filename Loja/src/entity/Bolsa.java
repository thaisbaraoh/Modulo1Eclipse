package entity;

public class Bolsa extends Produto{
	private String marca;

	public Bolsa(String nome, String cnpj, String descricao, String codigo, double valorUnitario, int qtdeEstoque,
			String marca) {
		super(nome, cnpj, descricao, codigo, valorUnitario, qtdeEstoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
}