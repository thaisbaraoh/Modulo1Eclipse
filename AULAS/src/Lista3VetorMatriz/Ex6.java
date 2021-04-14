package Lista3VetorMatriz;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0, media = 0, x = 0;
		
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				soma += numero;
				x++;
			}
			
		} while (numero != 0);
		
		media = soma / (x - 1);
		System.out.println("A média dos multiplos de 3 é: " + media);

	} 

}

