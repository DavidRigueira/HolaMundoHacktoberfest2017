import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		/*
		 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
		 * mes, año) y calcule su número de la suerte. El número de la suerte se calcula
		 * sumando el día, mes y año de la fecha de nacimiento y a continuación sumando
		 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
		 * 12/07/1980 Calculamos el número de la suerte así: 12+7+1980 = 1999 1+9+9+9 =
		 * 28 Número de la suerte: 28
		 */

		Scanner lector = new Scanner(System.in);
		
		int d, m, a;
		int n, t; 
		
		//INTRODUCIMOS LOS DATOS
		System.out.println("Introduce tu día de nacimiento:");
		d = lector.nextInt();
		
		System.out.println("Introduce tu mes de nacimiento:");
		m = lector.nextInt();
		
		System.out.println("Introduce tu año de nacimiento:");
		a = lector.nextInt();
		
		
		//OPERAMOS EMPEZANDO A CONTAR POR LA DERECHA!
		
		n = d + m + a;
		
		
			t = n%10;
			n = n/10; 				// HALLAMOS EL PRIMER DÍGITO POR LA DERECHA
			
			t+= n%10;				
			n = n/10;				// HALLAMOS EL SEGUNDO DÍGITO POR LA DERECHA
			
			t+= n%10;				// HALLAMOS EL TERCER DÍGITO POR LA DERECHA
			t+= n/10;				// HALLAMOS EL CUARTO DÍGITO EMPEZANDO POR LA DERECHA. 
			
			//HEMOS SACADO CADA DÍGITO "AL REVÉS".
			
			if (t<10) {System.out.println("Tu numero de la suerte es: " + t);} 
			else 
			{
				n = t;				
				t = n%10;				
				t+= n/10;	
				System.out.println("Tu numero de la suerte es: " + t);
			}
			
		
		
		
		

		
		
		
		
		
		lector.close();
		
		
		
		
		
		
		
		
		
	}

}
