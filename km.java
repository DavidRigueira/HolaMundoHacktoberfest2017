
import java.util.Scanner;
public class ejercicio6pro3 {
public static void main(String[]args) {
	
	
	//v= km*3.6;
	//km*1000/3600;
	
	Scanner sc = new Scanner(System.in);
	
	double dato, resultado;
	
	System.out.println("Introduzca los Km/h : ");
	dato=sc.nextDouble();
	
	resultado=(dato*1000)/3600;
	
	
	System.out.println("El resultado  en es m/s:  " + resultado);
	sc.close();
}
}
