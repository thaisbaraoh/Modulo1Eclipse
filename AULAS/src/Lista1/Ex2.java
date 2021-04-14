package Lista1;

import java.util.Scanner;

public class Ex2 {

	public void main(String[] args) {

        Scanner leia = new Scanner (System.in);

        int numero1; 
        int numero2; 
        int numero3;

        System.out.println("Digite três numeros: ");
        System.out.println("Número 1");
        numero1 = leia.nextInt();
        System.out.println("Número 2");
        numero2 = leia.nextInt();
        System.out.println("Número 3");
        numero3 = leia.nextInt();

        if (numero1 < numero2)
        {
            if (numero2 < numero3) {
                System.out.println(numero1+ " " +numero2+ " " +numero3);
            }
            else if (numero1 < numero3) {
                System.out.println(numero1+ " " +numero3+ " " + numero2);
            }
            else {
                System.out.println(numero3+ " " +numero1+ " " +numero2);
            }
        }
            else if (numero2 < numero3) {
                if (numero1 < numero3) {
                    System.out.println(numero2+ " " +numero1+ " " +numero3);
                }
                else {
                    System.out.println(numero2+ " " +numero3+ " " +numero1);
                }

            }
            else {
                System.out.println(numero3+ " " +numero2+ " " +numero1);
            }

	}
}