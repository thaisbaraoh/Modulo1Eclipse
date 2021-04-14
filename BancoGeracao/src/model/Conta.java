package model;

public class Conta {
	public static final String NOME_BANCO = "GERAÇÃO";
	public static final String SLOGAN = "UM BANCO PARA TODES";
	private String tipoConta;
	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativa;

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public String getNOME_BANCO() {
		return NOME_BANCO;
	}

	public String getSLOGAN() {
		return SLOGAN;
	}

	public Conta() {
	}

	public void debito(double valor) {
		this.saldo -= valor;
	}

	public void credito(double valor) {
		this.saldo += valor;
	}
}