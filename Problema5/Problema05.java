import java.util.Scanner;

public class Problema05{
	public static void main(String[] args){
		//Hallar la radicación n de a

		//Variables
		int a, n, radicacion;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("a: ");
		a = teclado.nextInt();

		System.out.print("n: ");
		n = teclado.nextInt();

		//Proceso
		radicacion = (int) Math.pow((double) a , 1 / ((double) n) );

		//Salida
		System.out.println("");
		System.out.println("Radicacion: " + radicacion);

	}
}