package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ex01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 cores: ");
		for (int i = 0; i < 5; i++) {
			String cor = leia.nextLine(); // le a cor inserida
			cores.add(cor); // adiciona cor a lista
		}
		
		cores.sort(null);
		System.out.println("Cores ordenadas: ");
		for (String cor : cores) { // FOR EACH PARA ORDENAR
			System.out.println(cor); 
		}
		
		
	
	
	}
}