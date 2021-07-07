package angel;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		int numero;
		int resultado;
		//Pedir un número
		System.out.println("Inserta un número:");
		Scanner lector = new Scanner(System.in);
		numero = lector.nextInt();
		
		//Comprobar si su resto es cero
		resultado = numero % 2;
		if(resultado == 0) {
			System.out.println("El numero si es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	}
}
