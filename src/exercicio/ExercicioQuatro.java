package exercicio;

import java.util.Scanner; 

public class ExercicioQuatro {
	
	public static void main(String[] args) {
	
		//Variaveis 
		float num1;
		float num2;  
		float num3; 
		float num4; 
		float resultado; 
		
		Scanner ler = new Scanner(System.in); 
		
		//Receber dados do usuario
		System.out.printf("Valor do numero 1: ");
		num1 = ler.nextFloat();
		
		System.out.printf("Valor do numero 2: "); 
		num2 = ler.nextFloat(); 
		
		System.out.printf("Valor do numero 3: ");
		num3 = ler.nextFloat(); 
		
		System.out.printf("Valor do numero 4: ");
		num4 = ler.nextFloat(); 
		
		//Calculando a diferença 
		resultado = (num1 * num2) - (num3 * num4); 
		
		System.out.printf("A diferença é de: %.2f", resultado);
		
	}
}
