package estrutura_repeticao;

import java.util.Scanner;

public class ExFor01 {

	public static void main(String[] args) {
		
		
		//variaveis 
		int num1, num2,  cont;
		Scanner leia = new Scanner(System.in); 
		
		//entrada 
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		//saida
		if (num1 >= num2) {
			System.out.println("Intervalo Inválido! O primeiro numero deve ser maior que o segundo. "); 
		}else{
				System.out.println("Numeros entre " + num1 + " e " + num2 ); 
				for (cont = num1; cont < num2; cont++ ) {				//(valor inicial; condição limite ou teste; contador){}
					if(cont % 3 == 0 && cont %5 ==0);
					System.out.println("Multiplos de 3 e 5: " + cont);
				}
			}
		
		
		 
	}
}
