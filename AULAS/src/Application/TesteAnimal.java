package Application;

import java.util.Locale;

import Entities.Cachorro;
import Entities.Cavalo;
import Entities.Pregui�a;

public class TesteAnimal {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cachorro animal1 = new Cachorro(5,"Amora");
		Cavalo animal2 = new Cavalo(5,"Cavalo");
		Pregui�a animal3 = new Pregui�a(6,"Pregui�a");
		
		System.out.println(animal1.getNome() + " idade " +animal1.getIdade() + " anos " );
		System.out.println(animal2.getNome() + " idade " +animal2.getIdade() + " anos " );
		System.out.println(animal3.getNome() + " idade " +animal3.getIdade() + " anos " );
				
		
	}
	
	
	
}

