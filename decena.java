import java.util.Scanner;
public class ejercicio3pro2 {
public static void main(String[]args) {
	
	
	
	int a;
	Scanner sc = new Scanner(System.in);
	//bucle con do
	do {
		System.out.println("introduzca un numero de tres cifras: " );
		a=sc.nextInt();
	}
	while(a>=1000||a<100);
	System.out.println("La centena es: "+a/100);
	System.out.println("La decena es : "+(a%100)/10 );
    System.out.println("La unidad es: "+(a%100)%10);
}
}