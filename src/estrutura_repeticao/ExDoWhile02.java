package estrutura_repeticao;

import java.util.Scanner;

public class ExDoWhile02 {

	public static void main(String[] args) {

		int numero, soma = 0,  contador = 0;
		double media = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma = soma + numero;
				contador++;
			}
		} while (numero != 0);
		media = soma / contador;
		System.out.println("A media dos multiplos de 3 é: " + media);

	}
}