package Application;

import java.util.Scanner;

import Classes.Pessoa;

public class CadFuncao {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //instanciou teclado
		
		Pessoa func1 = new Pessoa();//instanciou pessoa
		Pessoa func2 = new Pessoa();
		int idade1;
		int idade2;
		
		
		System.out.println("Digite o nome do funcionario 1: ");
		func1.nome = leia.next();
		System.out.println("Digite o nome do funcionario 2: ");
		func2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do func1: ");
		func1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do func2: ");
		func2.anoNascimento = leia.nextInt();
		System.out.println("Func 1 você é 1 fem, 2-masc, ou 3-outre: ");
		func1.genero = leia.next().charAt(0);
		
		
		
		System.out.printf("Idade pessoa 1 %d anos \n",func1.calcularIdade());
		System.out.printf("Idade pessoa 2 %d anos \n",func2.calcularIdade());
		
		if(func1.calcularIdade() < func2.calcularIdade()) {
			System.out.printf("O %s %s é a pessoa mais velha", func2.tratamento(),func2.nome);
		}
		else
		{
			System.out.printf("O %s %s é a pessoa mais velha", func1.tratamento(),func1.nome);
		}
	}

}

	

