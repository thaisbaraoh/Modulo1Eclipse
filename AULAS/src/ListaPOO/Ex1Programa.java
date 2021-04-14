package ListaPOO;

import java.util.Scanner;

public class Ex1Programa {

	public static void main(String [] args) {
			
			Scanner leia = new Scanner (System.in);
			
			Ex1Classe cliente1 = new Ex1Classe();
			Ex1Classe cliente2 = new Ex1Classe();
			
			System.out.println("Digite seu nome: ");
			cliente1.nome = leia.next();
			System.out.println("Digite seu nome: ");
			cliente2.nome = leia.next();
			System.out.println("Digite seu cpf: ");
			cliente1.cpf = leia.next();
			System.out.println("Digite seu cpf: ");
			cliente2.cpf = leia.next();
			System.out.println("Digite seu Ano de Nascimento: ");
			cliente1.anoNascimento = leia.nextInt();
			System.out.println("Digite seu Ano de Nascimento: ");
			cliente2.anoNascimento = leia.nextInt();
			
			System.out.printf("Cliente 1 se chama: %s, tem o cpf: %s e %d anos",cliente1.nome,cliente1.cpf,cliente1.calcularIdade(2021));
			System.out.printf("\nCliente 2 se chama: %s, tem o cpf: %s e %d anos",cliente2.nome,cliente2.cpf,cliente2.calcularIdade(2021));
			
		}
	}

