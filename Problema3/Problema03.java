import java.util.Scanner;

public class Problema03{
	public static void main(String[] args){
		//Calcular el IGV (Impuesto General a las ventas) del 19%
		//y el precio final

		//Variables
		double valorVenta, impGenVentas, precioVenta;

		//Entrada
		Scanner teclado = new Scanner(System.in);

		System.out.print("Valor de Venta: ");
		valorVenta = teclado.nextDouble();

		//Proceso
		impGenVentas = valorVenta * 0.19;
		precioVenta = valorVenta + impGenVentas;

		//Salida
		System.out.println("");
		System.out.println("IGV: " + impGenVentas);
		System.out.println("Precio de venta: " + (valorVenta + impGenVentas));

	}
}