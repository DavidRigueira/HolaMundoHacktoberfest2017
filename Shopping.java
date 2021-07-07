import java.util.Scanner;

public class Shopping{
    public static void main(String[] args) {
        //Objetos
        double valorDeCompra;
        double IVA = 1.21;
        byte ScreenInfo = 0;

        //Iniciando Scanner
        Scanner escaneador = new Scanner(System.in);

        System.out.println("Cuánto ha gastado en la compra?");
        valorDeCompra = escaneador.nextDouble();
        System.out.println("Desea aplicar el IVA? En caso afirmativo presione la tecla 1. En caso contrario presione la tecla 2.");
        ScreenInfo = escaneador.nextByte();

        //Iniciando if
        if (ScreenInfo = 1) {
            System.out.println('El total de la compra (IVA incluido) es:' + valorDeCompra * 1.21);
        } else (ScreenInfo = 2) {
            System.out.println('El total de compra (IVA no incluido) es:' + valorDeCompra);
        }
    }
}
