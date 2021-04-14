package AtividadesAula;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[3]; // nomes[0], nomes[1], nomes[2]
		String apostolos[] = {"LUCAS", "MATEUS", "JUDAS", "MARCOS", "PEDRO", "FELIPE", "THIAGO", "JOÃO", "ANDRE"}; 
		
		nomes[0] = "PAULO";
		nomes[1] = "MADELENA";
		nomes[2] = "RITA";
		
		for (int x = 0; x < apostolos.length; x++) {
			System.out.println(apostolos[x]);
		}
		
		System.out.println("");
		// 4 pessoas - nome - vetor
		// 4 nota [inteiro entre 1-10] - vetor
		//nome - nota - ate 5 > ainda não/ acima de 5 > muito bem
		
		leia.close();
	}
}