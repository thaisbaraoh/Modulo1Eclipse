package Lista1;

import java.util.Scanner;

public class Ex1 {
	

	public static void main(String[] args) {

		     Scanner leia = new Scanner (System.in);

		        int numero1; 
		        int numero2; 
		        int numero3;

		        System.out.println("Digite tr�s numeros: ");
		        System.out.println("N�mero 1");
		        numero1 = leia.nextInt();
		        System.out.println("N�mero 2");
		        numero2 = leia.nextInt();
		        System.out.println("N�mero 3");
		        numero3 = leia.nextInt();

		        if (numero1 > numero2 && numero1 > numero3)
		        {
		            System.out.println("O maior n�mero � o primeiro: " + numero1);

		        }

		        else if (numero2 > numero3)
		        {
		            System.out.println("O maior n�mero � o segundo: " + numero2);

		        }
		        else {
		            System.out.println("O maior n�mero � o terceiro: " + numero3);
		        }

		    }
	}

