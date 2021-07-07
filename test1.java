//esto es para cambiar el ducomento
public class test1 {

	
public static char getLetras() {
	
	
	return (char)( Math.random()*26 + 'a');
	//fin del metodo getLetras
}
public static void main (String[]args) {
	int i;
	char prueba;
	double valor = Math.random();
	System.out.println(valor);
	valor *=26;
	System.out.println(valor);
	valor += 'a';
	System.out.println(valor);
	prueba = (char) valor;
	System.out.println(prueba);
	
	
	for ( i = 1; i <=10;i++);{
	System.out.println("La pasada del bucle for es la numero " + i);
	System.out.println(getLetras());
	}
}
	
	
	
}

