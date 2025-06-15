import java.util.Scanner;

public class Problema02{
	public static void main(String[] args){
		//Variables
		int num1, num2, cociente, residuo;

		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero 1: ");
		num1 = teclado.nextInt();
		System.out.print("Numero 2: ");
		num2 = teclado.nextInt();

		//Proceso
		cociente = num1 / num2;
		residuo = num1 % num2;

		//Salida
		System.out.println("");
		System.out.println("Cociente: " + cociente);
		System.out.println("Residuo: " + residuo);

	}
}