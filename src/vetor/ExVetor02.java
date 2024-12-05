package vetor;

import java.util.Scanner;

public class ExVetor02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double media = 0;
		int i = 0, soma = 0;
		int numero[] = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			numero[i] = leia.nextInt();
			soma = soma + numero[i];

		}
		media = (float) soma / 10;
		// impar
		System.out.println("\nElementos de numeros impares: ");
		for (i = 0; i < 10; i++) {
			if (i % 2 != 0)
				System.out.print(" " + numero[i]);
		}
		// pares
		System.out.println("\nElementos de numeros pares: ");
		for (i = 0; i < 10; i++) {
			if (numero[i] % 2 == 0)
				System.out.print(" " + numero[i]);
		}
		System.out.println("A soma de todos os numeros do vetor foi de: " + soma);
		System.out.printf("A media de todos os elementos do vetor foi: %.2f", media);
	}
}
