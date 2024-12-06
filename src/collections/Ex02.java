package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>(); // Nao tem ordenação e nao repete se tiver dados iguais

		System.out.println("Digite 10 números inteiros não repetidos:");
		for (int i = 0; i < 10; i++) {
			Integer num = leia.nextInt(); // ler o numero inserido
			numeros.add(num);
		}
		

		System.out.println("Listar dados no set: ");
		for (Integer numero : numeros) { // FOR EACH PARA ORDENAR
			System.out.println(numero);
		}

	}
}
