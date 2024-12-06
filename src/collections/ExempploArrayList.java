package collections;

import java.util.ArrayList;

import java.util.Scanner;

public class ExempploArrayList {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// Cria a Collection ArrayList, do tipo Double, chamada notas -(lista)
		ArrayList<Double> notas = new ArrayList<Double>();

		// Cria um Objeto da Classe Wrapper Double
		Double y = Double.valueOf(12);

		String controle;
		
		do {
		System.out.println("Digite um valor: ");
		Double valor = leia.nextDouble(); 
		notas.add(valor);
		
		System.out.print("Deseja adicionar outra nota? (s/n): ");
        controle = leia.next();
		} while(controle.equalsIgnoreCase ("s")); 
			/**
		 * Adiciona algumas Notas. Observe que a primeira nota é o Objeto Wrapper
		 * Double.
		 */

		/**
		 * Mostra na tela todas as notas adicionadas. Observe que a nota duplicada foi
		 * adicionada duas vezes.
		 */
		System.out.println("\nNotas cadastradas: " + notas);

		/**
		 * Mostra na tela todas as notas através do laço For...Each.
		 */
		System.out.println("\nNotas cadastradas - Laço For...Each");

		for (Double nota : notas) {
			System.out.println(nota);
		}
	}

	}


