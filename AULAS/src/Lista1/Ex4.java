package Lista1;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numero, raiz, quad;
		
		System.out.print("Digite um número: ");
		numero = leia.nextDouble();
		
		if(numero%2 == 0) {
			System.out.print("Número é par\n");
			raiz = Math.sqrt(numero);
			System.out.printf("Raiz quadrada de %.2f é igual à %.2f", numero, raiz);
		}
		else if(numero%2 != 0) {
			System.out.print("Número é ímpar\n");
			quad = Math.pow(numero, 2);
			System.out.printf("%.2f ao quadrado é %.2f", numero, quad);
		}
	}
	
	
}

