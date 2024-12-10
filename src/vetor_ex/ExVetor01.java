package vetor_ex;

import java.util.Scanner;

public class ExVetor01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int cont = 0;
		
		
		int lista[] = { 6, 4, 9, 2, 5, 1, 7, 8, 3, 10 }; // vetor com dados
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt(); // ler o numero digitado
		
		
		for (int i = 0; i < 10; i++) { 
			if (numero == lista[i]) { //verficiar se o numero esta na lista
				System.out.println("O numero "+ numero + " foi encontrado na posiçao " + i); 
			}else{
				cont++;
			}
			if (cont > 9) {
				System.out.println("Nao foi encontrado");
			}
		
		}
		
	}
}
