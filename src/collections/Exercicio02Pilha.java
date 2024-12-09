package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio02Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();

		Scanner leia = new Scanner(System.in);

		int opcao = -1;

		do {
			System.out.println("1 - Adicionar livros na fila ");
			System.out.println("2 - Listar todos os livros: ");
			System.out.println("3 - Retirar livros da pilha ");
			System.out.println("0 - Sair do programa");
			System.out.println("\nDigite um numero para escolher uma opção: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				String cliente = leia.nextLine();
				pilha.add(cliente);
				System.out.println("\n Livro Adicionado! ");
				break;

			case 2:
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livro está vazia.");
				} else {
					Iterator<String> iterator = pilha.iterator();
					System.out.println("\n Lista de livros na pilha: ");
					while (iterator.hasNext()) {
						System.out.println(iterator.next());
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia.");
				} else {
					String livroSaiu = pilha.pop();
					System.out.println(livroSaiu + "foi chamado!");
					Iterator<String> iterator = pilha.iterator();
					System.out.println("\nFila atualizada: ");
					while (iterator.hasNext()) {
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
