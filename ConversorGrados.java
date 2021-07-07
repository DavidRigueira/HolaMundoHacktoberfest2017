import java.util.Scanner;

public class Ejercicio4
{

	// Método de Celsius a Farenheit
	public static double CelsiusAFarenheit(double valor)
	{
		return (32 + (9 * (valor / 5)));
	}

	// Método de Farenheit a Celsius
	public static double FarenheitACelsius(double valor)
	{
		valor = ((valor - 32) * 5 / 9);
		return valor;
	}

	public static void main(String[] args)
	{
		/*
		 * Programa que lea una cantidad de grados centígrados y la pase a grados
		 * Fahrenheit.La fórmula correspondiente es:F = 32 + ( 9 * C / 5)
		 */

		// Scanner
		Scanner sc = new Scanner(System.in);

		// Pedir opcion
		System.out.println("Escriba 1 si quiere convertir de grados Celsius a Farenheit.");
		System.out.println("Escriba 2 si quiere convertir de grados Farenheit a Celsius.");

		// Leer opcion
		int opcion;
		double grados;
		do
		{
			opcion = sc.nextInt();
		} while ((opcion != 1) && (opcion != 2));

		System.out.println("Introduzca los grados " + ((opcion == 1) ? "Celsius" : "Farenheit"));
		grados = sc.nextDouble();
		// Si la opcion es 1 llamamos a metodo 1 y si es 2 al metodo 2.
		if (opcion == 1)
		{
			System.out.println(grados + " Grados Celsius, son " + CelsiusAFarenheit(grados) + " Grados Farenheit");
		} else
		{
			System.out.println(grados + " Grados Farenheit, son " + FarenheitACelsius(grados) + " Grados Celsius");
		}
	}

}
