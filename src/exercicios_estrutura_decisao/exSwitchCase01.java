package exercicios_estrutura_decisao;

import java.util.Scanner;

public class exSwitchCase01 {

	public static void main(String[] args) {

		// variaveis
		int cod;
		String nome;
		float salario;
		Scanner leia = new Scanner(System.in);

		// opcoes
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Tecnico de TI");

		// entrada
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.println("Digite seu cod: ");
		cod = leia.nextInt();
		System.out.println("Salario: ");
		salario = leia.nextFloat();

		// saida

		switch (cod) {
		case 1:
			System.out.println("Ola Gerente: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.1);
			break;
		case 2:
			System.out.println("Ola Vendedor: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.07);
			break;
		case 3:
			System.out.println("Ola Supervisor: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.09);
			break;
		case 4:
			System.out.println("Ola Motorista: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.06);
			break;
		case 5:
			System.out.println("Ola Estoquista: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.05);
			break;
		case 6:
			System.out.println("Ola Tecnico TI: " + nome);
			System.out.printf("Reajuste Salarial %.2f", salario * 1.08);
			break;
		default:
		    System.out.println("Código inválido. Por favor, tente novamente.");
		    break;	
		}
		
		leia.close();
	}

}
