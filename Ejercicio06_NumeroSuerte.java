/*Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule 
 * su número de la suerte. El número de la suerte se calcula sumando el día, mes y año de la fecha de 
 * nacimiento y a continuación sumando las cifras obtenidas en la suma. 
 * Por ejemplo: Si la fecha de nacimiento es 12/07/1980  
 * Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28 Número de la suerte: 28
 */
package tema1_EjerciciosPropuestos2;

import java.util.Scanner;

public class Ejercicio06_NumeroSuerte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fechaNacim,testString="00/00/0000";
		int suma;
		Scanner sc=new Scanner(System.in);

		do {
			System.out.print("Introduce to fecha de naciemineto ");
			fechaNacim=sc.nextLine();	
		}while(fechaNacim.compareTo(testString)<=0);
		sc.close();

		suma=Integer.parseInt(fechaNacim.substring(0,2))+Integer.parseInt(fechaNacim.substring(3,5))+
				Integer.parseInt(fechaNacim.substring(6,10));
		do {
			String strSuma=Integer.toString(suma);
			suma=0;
			for(int i=0;i<strSuma.length();i++) {
				suma+=Character.getNumericValue(strSuma.charAt(i));
			}
		}while(suma>=10);
		
		System.out.println("Si naciste el "+fechaNacim+" es el "+suma);
	}

}
