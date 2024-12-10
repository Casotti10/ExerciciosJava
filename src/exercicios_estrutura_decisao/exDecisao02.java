package exercicios_estrutura_decisao;

import java.util.Scanner;

public class exDecisao02 {

	public static void main(String[] args) {

		//variaveis
		int numero;

		Scanner leia = new Scanner(System.in);

		// entrada de dados
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		if (numero % 2 == 0) {
			System.out.println("Numero PAR");
		} else {
			System.out.println("Numero Impar");
		}

		System.out.println("-----AGORA VERIFICANDO SE É POSITIVO OU NEGATIVO-----"); 
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();
		if (numero > 0) {
			System.out.println("Numero POSITIVO");
		}else if (numero < 0) {
			System.out.println("Numero NEGATIVO");
		}else 
			System.out.println("Numero ZERO");
		
		leia.close();
	}

}
