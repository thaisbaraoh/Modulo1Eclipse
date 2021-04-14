package ListaPOO;

public class Ex1Classe {

	public String nome;
	public int anoNascimento;
	public String cpf;
	
	public int calcularIdade(int anoAtual) {
		return anoAtual -anoNascimento;
	}
}
