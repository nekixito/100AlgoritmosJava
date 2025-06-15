import java.util.Scanner;

public class Problema04{
	public static void main(String[] args){
		//Hallar la potencia de a^n

		//Variables
		int a, n, potencia;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("a: ");
		a = teclado.nextInt();

		System.out.print("n: ");
		n = teclado.nextInt();

		//Proceso
		potencia = (int) Math.pow((double) a ,(double) n );

		//Salida
		System.out.println("");
		System.out.println("Potencia: " + potencia);

	}
}