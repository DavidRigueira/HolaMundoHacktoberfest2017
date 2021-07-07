import java.util.Scanner;

public class Sumar2Numeros {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float resultado;
		Scanner lector = new Scanner(System.in);
		
		// leer numero 1
		System.out.println("Inserta el primer nº");
		numero3 = lector.nextFloat();
		// leer numero 2
		System.out.println("Inserta el segundo nº");
		numero2 = lector.nextFloat();
		// sumarlo
		resultado = numero1+numero3;
		// mostrar el resultado por pantalla
		System.out.println( resultado );
		lector.close();
	}

}
