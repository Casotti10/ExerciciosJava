package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Media: ");
		media = leia.nextFloat();

		// processamento
		if (media >= 6 && media <= 10) {
			System.out.println("Aprovado");
		}else if (media >= 5) {
			System.out.println("Aluno de exame");
		}else if (media > 10) {
			System.out.println("Media nao existente"); 
		} 
		else {
			System.out.println("Reprovado");
		}
		
		
		
		leia.close();
	}
}
