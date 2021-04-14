package AtividadesAula;

import java.util.Locale;
import java.util.Scanner;

public class LacoPara {

	public static void main(String[] args) {
	/*PARA
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando 
dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.
	 */
	// [para - enquanto] - faça enquanto - final
	//inicio
	// entradas
	//processamentos
	//fim
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		final double HABITANTES =20; //neste momento é uma constante, não muda valor.
		double salario =0.00;
		double numeroFilhos=0;
		double mediaSalario=0.00;
		double totalSalario=0.00;//dentro laço
		double mediaFilhos=0.00;
		double totalFilhos=0.00;
		double maiorSalario=0.00;
		double percentualPessoaSalarioAte100=0.00;
		double contadorPessoasSalario100=0.00;
		//x++ = x = x +1
		
		for (int x=1;x<=HABITANTES;x++) {
			//dentro laço
			System.out.printf("Informe o salário do habitante %d R$ :",x); 
			salario = leia.nextDouble();
			System.out.print("Infome a quantidade de filhos: ");
			numeroFilhos = leia.nextDouble();
			System.out.println(); //pula linha de um para outro.
			totalSalario = totalSalario + salario; // totalSalario += Salario
            totalFilhos += numeroFilhos; 
            if(maiorSalario < salario)
            {
            	maiorSalario = salario;
            }
            
            if(salario <= 100)
            {
            	contadorPessoasSalario100++;
            }

        }
        //fora do laço
        mediaSalario = totalSalario /  HABITANTES ;
        mediaFilhos = totalFilhos / HABITANTES;
        percentualPessoaSalarioAte100 = contadorPessoasSalario100 *100/HABITANTES;
        
        
        
        //entradas
        //processamentos
        //saidas
        System.out.printf("\nTotal dos salarios R$ %.2f",totalSalario);
        System.out.printf("\nMédia salarios: R$ %.2f", mediaSalario);
        System.out.printf("\n Maior salario: %.2f",maiorSalario);
        System.out.printf("\n Média de filhos: %.2f",mediaFilhos);
        System.out.printf("\n Porcentagem de pessoas com salario até R$100: %.2f%%",percentualPessoaSalarioAte100);
        //fim
	}

}
