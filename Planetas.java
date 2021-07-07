import java.util.Scanner;

public class GitHub {
    public static void main(String[]args) {
        //Atributos
        double Mercurio = 166.85, Venus = 456, Tierra = 14.85, Marte = -87, Neptuno = -220;
        int aux;

        //Iniciando escaner
        Scanner escaneo = new Scanner(System.in);

        //Question
        System.out.println("De qué planeta desea obtener la temperatura media en superfice? Presione la tecla relacionada con el planeta: 1. Mercurio. 2. Venus. 3. Tierra. 4. Marte. 5. Neptuno.");
        aux = escaneo.nextInt();

        switch (aux) {
            case (1):
                System.out.println("La temperatura media en la superficie de Mercurio es: ");
                System.out.print(Mercurio+"°C");
                break;
            case (2):
                System.out.println("La temperatura media en la superficie de Venus es: ");
                System.out.println(Venus+"°C");
                break;
            case (3):
                System.out.println("La temperatura media en la superficie de la Tierra es: ");
                System.out.println(Tierra+"°C");
                break;
            case (4):
                System.out.println("La temperatura media en la superficie de Marte es: ");
                System.out.println(Marte+"°C");
                break;
            case (5):
                System.out.println("La temperatura media en la superficie de Neptuno es: ");
                System.out.println(Neptuno+"°C");
                break;
            default:
                System.out.println("No ha seleccionado ningún planeta válido. Por favor, inténtelo de nuevo.");
        }

        }
    }
