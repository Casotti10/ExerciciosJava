package exercicio;

import java.util.Scanner;

public class PraticaSozinho {

	public static void main(String[] args) {

		// variaveis
		float num1, num2;
		int cod;
		Scanner leia = new Scanner(System.in);

		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAI");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");

		// entrada
		System.out.println("Digite um numero de 1 a 4: ");
		cod = leia.nextInt();

		System.out.println("Digite o Primeiro numero");
		num1 = leia.nextFloat();
		System.out.println("Digite o Segundo numero");
		num2 = leia.nextFloat();

		switch (cod) {
		case 1:
			System.out.println("Resultado da soma: " + (num1 + num2));
			break;
		case 2:
			System.out.println("Resultado da subtração:  " + (num1 - num2));
			break;
		case 3:
			System.out.println("Resultado da multiplicação: " + (num1 * num2));
			break;
		case 4:
			System.out.println("Resultado da multiplicação: " + (num1 / num2));
			break;
		default:
			System.out.println("Opcao Invalida! escolhe um numero de 1 a 4.");
		}

		leia.close();

	}

}
