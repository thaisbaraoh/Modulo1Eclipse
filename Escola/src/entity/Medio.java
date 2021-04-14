package entity;

public class Medio extends Estudante {
	 
	private int contadorBoletim;

	public Medio(int matricula, String cpf, int contadorBoletim) {
		super(matricula, cpf);
		this.contadorBoletim = contadorBoletim;
	}

	public int getContadorBoletim() {
		return contadorBoletim;
	}

	public void setContadorBoletim(int contadorBoletim) {
		this.contadorBoletim = contadorBoletim;
	}
	
	public void imprimirBoletim() {
		
		System.out.println("Boletim");
		System.out.println("Pontos Atuais: "+super.getPontos());
		
		
	}
}
