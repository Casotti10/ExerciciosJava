package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		//Definiçao do metodo somar - Metodo com retorno e com parametro
		System.out.println(somar(1, 10) );

		//Definiçao do metodo falar - Metodo com retorno e com parametro
		falar("Hello World");
		
		MetodoExterno.mensagem();
		
	}
	
	//Definiçao do metodo somar - Metodo com retorno e com parametro
	public static int somar(int x, int y) {
		return x + y;
		}
	//Definiçao do metodo falar - Metodo com retorno e com parametro
	public static void falar(String mensagem) {	
		System.out.println(mensagem);
	}

}
