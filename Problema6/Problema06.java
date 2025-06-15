import java.util.Scanner;

public class Problema06{
	public static void main(String[] args){
		//Dado un numero de 5 digitos, devolver el numero en orden inverso.

		//Variables
		int numeroIngresado = 0, numeroInverso = 0, residuo = 0, acumulado = 0;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("Numero: ");
		numeroIngresado = teclado.nextInt();


		//Proceso

		//Primer paso
		residuo = numeroIngresado % 10; //5
		numeroIngresado = numeroIngresado / 10; //1234

		numeroInverso = residuo + numeroInverso * 10; // 5 + 0 * 1 = 5



		//Segundo paso
		residuo = numeroIngresado % 10; //4
		numeroIngresado = numeroIngresado / 10; //123

		numeroInverso = residuo + numeroInverso * 10; //4 + 50


		//Tercer paso
		residuo = numeroIngresado % 10; //3
		numeroIngresado = numeroIngresado / 10; //12

		numeroInverso = residuo + numeroInverso * 10; //3 + 540

		//Cuarto paso
		residuo = numeroIngresado % 10; //2
		numeroIngresado = numeroIngresado / 10; //1

		numeroInverso = residuo + numeroInverso * 10; //2 + 5430

		//Quinto paso
		residuo = numeroIngresado % 10; //1
		numeroIngresado = numeroIngresado / 10; //0

		numeroInverso = residuo + numeroInverso * 10; //1 + 54320
		

		/*
		while(numeroIngresado > 0){
			residuo = numeroIngresado % 10;
			numeroIngresado = numeroIngresado / 10;

			numeroInverso = residuo + numeroInverso * 10;
		}
		*/

		//Salida
		System.out.println("");
		System.out.println("Inverso: " + numeroInverso);

	}
}