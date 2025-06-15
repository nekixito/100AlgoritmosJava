import java.util.Scanner;

public class Problema07{
	public static void main(String[] args){
		//Determinar la suma de los N primeros numeros enteros positivos usando la formula n(n+1)/2

		//Variables
		int numero = 0, suma = 0;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("Numero: ");
		numero = teclado.nextInt();


		//Proceso
		suma = (numero*(numero + 1)) / 2;
		

		//Salida
		System.out.println("");
		System.out.println("Suma: " + suma);

	}
}