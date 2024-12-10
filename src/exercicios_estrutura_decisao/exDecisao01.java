package exercicios_estrutura_decisao;

import java.util.Scanner;

public class exDecisao01 {

	public static void main(String[] args) {

		// variaveis
		int numA;
		int numB;
		int numC;

		Scanner leia = new Scanner(System.in);

		// entrada
		System.out.println("Numero A: ");
		numA = leia.nextInt();

		System.out.println("Numero B: ");
		numB = leia.nextInt();

		System.out.println("Numero C");
		numC = leia.nextInt();

		// processamento
		if (numA + numB > numC) {
			System.out.println("A soma dos dois é MAIOR ");
		} else if (numA + numB < numC) {
			System.out.println("A soma dos dois é MENOR ");
		} else if(numA + numB == numC) {
			System.out.println("A soma dos dois é IGUAL ");

		
			leia.close();
		
		}
	}
}
