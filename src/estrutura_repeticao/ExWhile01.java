package estrutura_repeticao;

import java.util.Scanner;

public class ExWhile01 {

	public static void main(String[] args) {

		// variaveis
		int idade = 0, menor21 = 0, maior50 = 0;
		

		Scanner leia = new Scanner(System.in);

														// entrada
		while (idade >= 0) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
													//condicoes e processamentos
			if (idade < 0) {
				break;
			}if (idade < 21) {
				menor21++;
			} else if (idade >= 50) {
				maior50++;
			}
		}

		System.out.println("Menor de 21 anos:  " + menor21);
		System.out.println("Maior de 50 anos: " + maior50);
	}
}


