package exercicio;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {

		//Variaveis 
		float salario;
		float abono; 
		float novoSalario;
		
		//Construçao do Leia
		Scanner ler = new Scanner (System.in); 
		
		//Pedindo dados do usuario 
		System.out.printf("Insira seu salario: ");
		salario = ler.nextFloat();
		System.out.printf("Insira seu abono: ");
		abono = ler.nextFloat();
		
		//Calculo do novo salario 
		novoSalario = salario + abono; 
		
		//Mostrar resultado
		System.out.printf("O novo salário é de: %.2f ", novoSalario);
		
	} 
}
