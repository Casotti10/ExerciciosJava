package estrutura_repeticao;

import java.util.Scanner;

public class Exfor02 {

	public static void main(String[] args) {

		// variaveis
		int numero, cont;
		int par = 0;
		int impar = 0;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Digite 10 numeros inteiros.");

		for (cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "º numero: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;

			}
			System.out.println("Quantidade de par: " + par);
			System.out.println("Quantidade de impar: " + impar);
		}
		
	}
}
