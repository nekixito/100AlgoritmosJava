import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema08{
	public static void main(String[] args){
		//Calcular el interés compuesto generado por un capital depositado durante cierta cantidad de tiempo, 
		//a una tasa de interés determinada.

		//Variables
		float capital = 0.0f, 
			   tasaDeInteres = 0.0f,
			   interes = 0.0f,
			   monto = 0.0f;

		int tiempo = 0;

		DecimalFormat df = new DecimalFormat("#.#####");

		//Entrada
		Scanner teclado = new Scanner(System.in);
		System.out.print("Capital: ");
		capital = teclado.nextFloat();

		System.out.print("Tasa de interes: ");
		tasaDeInteres = teclado.nextFloat();

		System.out.print("Tiempo: ");
		tiempo = teclado.nextInt();


		//Proceso
		monto = (float) ( (double) Math.pow((1  + (tasaDeInteres / 100.0)), (double) tiempo) * capital );
		String montoTruncado = df.format(monto);
		monto = Float.parseFloat(montoTruncado);

		interes = monto - capital; 
		

		//Salida
		System.out.println("");
		System.out.println("Interes: " + interes);
		System.out.println("Monto: " + monto);

	}
}