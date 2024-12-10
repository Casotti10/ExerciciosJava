package estrutura_repeticao;

import java.util.Scanner;

public class ExDoWhile01 {

	public static void main(String[] args) {

		// variaveis
		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);
		// Início do loop do-while
		do {
			System.out.println("Digite um numero: ");
			numero = leia.nextInt();
			// Verifica se o número digitado é maior que 0 (positivo)
			if (numero  > 0)
				soma = soma + numero; // Se o número for positivo, adiciona esse número à variável "soma".
			
		} while (numero == 0);  // O loop continua enquanto o número digitado não for igual a 0.
		System.out.println("A soma dos numeros positivos é: "+ soma); // Exibe a soma dos números positivos após o loop terminar (quando o número 0 é digitado)
	}
}
