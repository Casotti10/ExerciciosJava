package exercicios_estrutura_decisao;

import java.util.Scanner;

public class exSwitchCase02 {

	public static void main(String[] args) {
		// variaveis
		int cod;
		int qtde;
		double valor = 0;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Digite um numero de 1 a 6: ");
		cod = leia.nextInt();
		System.out.println("Digite a quantidade");
		qtde = leia.nextInt();

		// saida
		switch (cod) {
		case 1:
			System.out.println("Cachorro Quente");
			valor = 10.0;
			break;
		case 2:
			System.out.println("X-salada");
			valor = 15.00;
			break;
		case 3:
			System.out.println("X-Bacon");
			valor = 18.00;
			break;
		case 4:
			System.out.println("Bauru");
			valor = 12.00;
			break;
		case 5:
			System.out.println("Refri");
			valor = 8.00;
			break;
		case 6:
			System.out.println("Suco de laranja");
			valor = 13.00;
		default:
			System.out.println("Codigo Invalido"); 
			
		}
		// Processamento
		System.out.printf("Valor total = R$%.2f ", (qtde * valor));
		leia.close();
	}

}
