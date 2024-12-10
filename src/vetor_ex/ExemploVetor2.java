package vetor_ex;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		
		//tipagem - nome_vetor = new tipagem[qtd de indices];
		int numeros[] = new int[5]; // so usa o new quando for vetor sem dados
        
		Scanner leia = new Scanner(System.in);
        
        for(int indice = 0; indice < 3; indice ++) {
            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
            numeros[indice] = leia.nextInt(); // ler e adicionar ao vetor
        }
        
        System.out.println("\nOs números digitados foram: \n");
        
        for(int indice2 = 0; indice2 < 3; indice2++) { 
            System.out.println((indice2 + 1) + "º número: " + numeros[indice2]); //exibir o array preenchido/listar eles
		}
        leia.close();
	}
	

}
