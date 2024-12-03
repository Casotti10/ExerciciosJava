package exercicio;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		//Variaveis 
		float salarioBruto;
		float adicional;
		float horasExtras;
		float desconto;
		float salarioLiquido;
		
		//Construcao Scanner 
		Scanner ler = new Scanner(System.in); 
		
		// Recebendo dados do usuario
		System.out.printf("Insira seu salario: ");
		salarioBruto = ler.nextFloat(); 
		System.out.printf("Insira seu adicional: ");
		adicional = ler.nextFloat();
		System.out.printf("Insira suas horas e xtras:  ");
		horasExtras = ler.nextFloat();
		System.out.printf("Insira seu desconto: ");
		desconto = ler.nextFloat();
		
		
		//Calculo do Salario
		salarioLiquido = salarioBruto + adicional + (horasExtras * 5) - desconto; 
		
		System.out.printf("O salario Liquido mensal foi de %.2f ", salarioLiquido);
		
	}
}
