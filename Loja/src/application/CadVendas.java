package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

import entity.Bolsa;
import entity.Loja;
import entity.NotaFiscal;

	public class CadVendas {
		
		static Loja loja1 = new Loja("GERAÇÃO DE BOLSAS", "12345678911/0001");
		static List<Bolsa> estoque = new ArrayList<>();
		static List<NotaFiscal> historico = new ArrayList<>();
			
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			
			Scanner leia = new Scanner(System.in);
			
			char opcao1 = 0;
			char opcao2 = 0;
			boolean achou = false;
			double totalPagamento = 0.0;
			
			// Itens do Estoque******************************
			estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "BOLSA DE ALÇA", "BA144", 150.0, 3, "GUCCI"));
			estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "MOCH. SPORT", "ME342", 50.0, 4, "NIKE"));
			estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "ESCOLAR", "E0342", 30.0, 2, "ADIDAS"));
			estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "ACAMPAMENTO", "A0978", 200.0, 1, "OAKLEY"));
			estoque.add(new Bolsa(loja1.getNome(), loja1.getCnpj(), "BOLSA DE LUXO", "F0761", 100.0, 0, "L.V."));
			// **********************************************

			System.out.printf("LOJA %s \n", loja1.getNome());
			System.out.println("\n**LISTA DE PRODUTOS**\n");
			MostrarEstoque();

			do {
				System.out.println("Digite o código do que ira comprar: ");
				String codigo = leia.next();
				for (Bolsa prod : estoque) {

					// Verificando escolha *********
					for (NotaFiscal item : historico) {
						if (codigo.equals(item.getCodigo())) {
							achou = true;
						}
					}
					// Verificando escolha *********

					if (achou == true) {
						System.out.println("Produto já foi comprado");
						achou = false;
						break;
					} else if (codigo.equals(prod.getCodigo())) {
						System.out.println("Produto Escolhido: \n Descrição - " + prod.getDescricao() + "\n Código: "
								+ prod.getCodigo());
						System.out.println(" Valor unitario: " + prod.getValorUnitario());
						System.out.println(" Quantidade em estoque: " + prod.getQtdeEstoque() + " unidades");
						System.out.println("Quantos deseja comprar: ");
						int quant = leia.nextInt();
						
						System.out.println("Digite 1-Confirmar ou 2-Cancelar: ");
						opcao1 = leia.next().charAt(0);

						if (opcao1 == '1') {
							if((prod.getQtdeEstoque() - quant) >= 0 && prod.getQtdeEstoque() != 0) {
								historico.add(new NotaFiscal(
												  prod.getNome()
												, prod.getCnpj()
												, prod.getDescricao()
												, prod.getCodigo()
												, prod.getValorUnitario()
												, prod.getQtdeEstoque()
												, prod.getMarca()
												, quant));
							}
							prod.tirarEstoque(quant);
							break;
						}
					}
				}

				System.out.println("Deseja encerrar a compra ? 1-Sim ou 2-Não");
				opcao2 = leia.next().charAt(0);

				if (opcao2 == '2') {
					System.out.println("**PRODUTOS DISPONIVEIS**");
					MostrarEstoque();
				}
			} while (opcao2 != '1');
			
			for (Bolsa item : historico) {
				totalPagamento += item.getValorUnitario()*item.getQtdeEstoque();
			}
			
			System.out.println("Valor Total a ser pago: R$ " + totalPagamento);
			System.out.println("Forma de pagamento 1-À vista / 2-Débito / 3-Crédito: ");
			char tipoPagamento = leia.next().charAt(0);
			
			if(tipoPagamento == '1') {
				MostrarHistorico();
				totalPagamento = totalPagamento - (totalPagamento * 0.10);
				System.out.println("\nPAGAMENTO À VISTA NO DINHEIRO: ");
				System.out.println("\nValor a ser pago: R$ " + totalPagamento + " (Com 10% desconto)");
			} 
			else if(tipoPagamento == '2') {
				MostrarHistorico();
				System.out.println("\nPAGAMENTO NO DÉBITO: ");
				System.out.println("\nValor a ser pago: R$ " + totalPagamento + " (Sem desconto)");
			}
			else if(tipoPagamento == '3') {
				System.out.println("Digite 1-Parcelar 1x ou 2-Parcelar 2x:  ");
				char parcelas = leia.next().charAt(0);
				
				if(parcelas == '1') {
					MostrarHistorico();
					totalPagamento = totalPagamento * 1.10;
					System.out.println("\nPAGAMENTO PARCELADO: ");
					System.out.println("\nValor a do produto: 1 parcela de R$ " + totalPagamento + " (Com 10% Juros)");
				}
				else {
					MostrarHistorico();
					totalPagamento = (totalPagamento * 1.20) / 2;
					System.out.println("\nPAGAMENTO PARCELADO: ");
					System.out.println("Valor a ser pago será 2 parcelas de R$ " + totalPagamento + " (Com 20% Juros)");
				}
			}
		}

		public static void MostrarEstoque() {
			for (Bolsa prod : estoque) {			
				
				System.out.printf("CODIGO: " + prod.getCodigo() 
								+ "\tMARCA: " + prod.getMarca() 
								+ "\tDECRIÇÃO: " + prod.getDescricao() 
								+ "\t\tVALOR: " + prod.getValorUnitario()
								+ "\tJUROS: %.2f", prod.getValorUnitario() * 0.09);	
				if (prod.getQtdeEstoque() > 0) System.out.print("\tQUANTIDADE: " + prod.getQtdeEstoque());
				else System.out.print("\tQUANTIDADE: ESGOTADO!!");
				System.out.println();
				
			}
			System.out.println();
		}
		public static void MostrarHistorico() {
			Random aleatorio = new Random();
			
			System.out.println("\n***NOTA FISCAL*****\n");
			System.out.printf("Código Fiscal: G%d%dB%d%d\n", aleatorio.nextInt(9),aleatorio.nextInt(9),aleatorio.nextInt(9),aleatorio.nextInt(9));
			System.out.println("Nome da Loja: " + loja1.getNome());
			System.out.println("CNPJ: " + loja1.getCnpj());
			System.out.println();
			
			for (NotaFiscal prod : historico) {
				
				System.out.printf("CODIGO: " + prod.getCodigo() 
				+ "\tMARCA: " + prod.getMarca() 
				+ "\tDECRIÇÃO: " + prod.getDescricao() 
				+ "\t\tVALOR: " + prod.getValorUnitario()
				+ "\tJUROS: %.2f"
				+ "\tQuantidade: " + prod.getQuantComprada(), prod.getValorUnitario() * 0.09);	
				System.out.println();
			}
		}
	}
	
	

