package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
		
	//variaveis
	float media; 
	
	Scanner leia = new Scanner(System.in); 
	
	//entrada
		System.out.println("Media: ");
		media = leia.nextFloat(); 
	
	//processamento 
		if(media >= 6 && media <= 10) { 
		System.out.println("Aprovado");
	}else{
		System.out.println("Infelizmente, voce reprovado");
	
	leia.close();
	}
	}
}
