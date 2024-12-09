package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>(); // Nao tem ordenação e nao repete se tiver dados iguais

		Scanner leia = new Scanner(System.in);


		// Adiciona algumas frutas na Colection Set
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(10);
		setNumeros.add(6);
		setNumeros.add(8);

		System.out.println("\n Digite um numero que voce quer encontrar: ");
		Integer num = leia.nextInt();
		
		if (setNumeros.contains(num)) {
			System.out.println("Numero "+ num + " encontrado");
		} else {
			System.out.println("Numero " + num + " nao encontrado");
		}
		

	}

}
