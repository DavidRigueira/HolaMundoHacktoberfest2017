import java.util.Scanner;

public class Ejercicio6
{

	public static void main(String[] args)
	{
		/*
		 * Programa que pida por teclado la fecha de nacimiento de una persona (dia,
		 * mes, a�o) y calcule su n�mero de la suerte. El n�mero de la suerte se calcula
		 * sumando el d�a, mes y a�o de la fecha de nacimiento y a continuaci�n sumando
		 * las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es
		 * 12/07/1980 Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999 1+9+9+9 =
		 * 28 N�mero de la suerte: 28
		 */

		Scanner lector = new Scanner(System.in);
		
		int d, m, a;
		int n, t; 
		
		//INTRODUCIMOS LOS DATOS
		System.out.println("Introduce tu d�a de nacimiento:");
		d = lector.nextInt();
		
		System.out.println("Introduce tu mes de nacimiento:");
		m = lector.nextInt();
		
		System.out.println("Introduce tu a�o de nacimiento:");
		a = lector.nextInt();
		
		
		//OPERAMOS EMPEZANDO A CONTAR POR LA DERECHA!
		
		n = d + m + a;
		
		
			t = n%10;
			n = n/10; 				// HALLAMOS EL PRIMER D�GITO POR LA DERECHA
			
			t+= n%10;				
			n = n/10;				// HALLAMOS EL SEGUNDO D�GITO POR LA DERECHA
			
			t+= n%10;				// HALLAMOS EL TERCER D�GITO POR LA DERECHA
			t+= n/10;				// HALLAMOS EL CUARTO D�GITO EMPEZANDO POR LA DERECHA. 
			
			//HEMOS SACADO CADA D�GITO "AL REV�S".
			
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
