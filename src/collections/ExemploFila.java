package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {

		// criando a collection fila(Queue)
		Queue<Integer> fila = new LinkedList<Integer>(); // int-> Integer (Classes Wrapper)

		for (int i = 0; i <= 10; i++)
			fila.add(i);

		System.out.println("\nElementos na fila: " + fila);

		System.out.println("\nRemover Elemento: " + fila.remove(2));

		System.out.println("\nFila atualizada: " + fila);

		System.out.println("\nAdicionar Elemento 11: " + fila.add(11));

		System.out.println("\nExibir a Fila atualizada: " + fila);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());

		System.out.println("\nExibir o Tamanho da fila: " + fila.size());

		System.out.println("\nChecar se o Elemento 4 existe na fila? " + fila.contains(4));

		System.out.println("\nExibe e Retira da fila o 1º Elemento (HEAD): " + fila.poll());

		Iterator<Integer> x = fila.iterator();

		
		while (x.hasNext()) {  //exibir os dados da lista um baixo do outro 
			//o hasNext verifica se existe um proximo dado para exibir
			System.out.println(x.next()); // Exibe o próximo elemento da fila no console 
		}

		
	}

}

