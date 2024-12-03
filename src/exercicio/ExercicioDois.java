package exercicio;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
	
	//Variaveis 
	float nota1;
	float nota2;
	float nota3;
	float nota4;
	float mediaNotas; 
	
	//Construcao Scanner 
	Scanner ler = new Scanner (System.in); 
	
	//Pedindo dados do usuario 
	System.out.printf("Nota 1: "); 
	nota1 = ler.nextFloat();
	
	System.out.printf("Nota 2: "); 
	nota2 = ler.nextFloat();
	
	System.out.printf("Nota 3: ");
	nota3 = ler.nextFloat();
	
	System.out.printf("Nota 4: ");
	nota4 = ler.nextFloat();
	
	//Calculando media 
	
	mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4; 
	System.out.printf("A media de notas foi de: %.2f",mediaNotas );
	
	
	}
}
