package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio01Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);

		int opcao = -1;

		do {
			System.out.println("1 - Adicionar cliente na fila ");
			System.out.println("2 - Listar todos os clientes: ");
			System.out.println("3 - Retirar cliente da fila ");
			System.out.println("0 - Sair do programa");
			System.out.println("\nDigite um numero para escolher uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do cliente: ");
				String cliente = leia.nextLine();
				fila.add(cliente);
				System.out.println("\nCliente Adicionado! ");
				break;

			case 2:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					Iterator<String> iterator = fila.iterator();
					System.out.println("\n Lista de clientes na fila: ");
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteSaiu = fila.poll();
					System.out.println(clienteSaiu + "foi chamado!");

					Iterator<String> iterator = fila.iterator();
					System.out.println("\nFila atualizada: ");
					
					while(iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					break;
				}
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("Opção invalida");
			}
		} while (opcao != 0);

		leia.close();

	}
}
