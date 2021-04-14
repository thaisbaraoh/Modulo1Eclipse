package view;

import java.util.Scanner;

import model.Conta;

public class Menu extends Conta {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int opcoes;
		do {
			try {
				System.out.println(descricaoMenu());
				opcoes = leia.nextInt();
			} catch (Exception e) {
				opcoes = 0;
			}
			switch (opcoes) {
			case 1:
				System.out.println("Escolheu a op��o 1");
				break;
			case 2:
				System.out.println("Escolheu a op��o 2");
				break;
			case 3:
				System.out.println("Escolheu a op��o 3");
				break;
			case 4:
				System.out.println("Escolheu a op��o 4");
				break;
			case 5:
				ContaEstudantil.ContaEstudantil();
				opcoes = 6;
				break;
			case 6:
				System.out.println("Escolheu a op��o 6");
				break;
			default:
				System.out.println("\nVoc� n�o escolheu uma op��o entre 1 e 6.\n");
				// Delay ********************************
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// Final Delay **************************
			}
		} while (opcoes < 1 || opcoes > 6);
	}

	private static String descricaoMenu() {
		String texto = "Bem vinde ao Banco " 
						+ NOME_BANCO + "\n" 
						+ SLOGAN + "\n" 
						+ "\n1 - CONTA POUPAN�A"
						+ "\n2 - CONTA CORRENTE" 
						+ "\n3 - CONTA ESPECIAL" 
						+ "\n4 - CONTA EMPRESA" 
						+ "\n5 - CONTA ESTUDANTIL"
						+ "\n6 - SAIR" 
						+ "\n\nDigite o c�digo da op��o selecionada: ";
		return texto;
	}
}