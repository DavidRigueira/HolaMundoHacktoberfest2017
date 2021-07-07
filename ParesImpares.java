import java.util.Scanner; 

 

public class ParesImpares { 

    public static void main(String[] args) { 

        int par = 0 ; 

        int impar = 0; 

        Scanner entrada = new Scanner(System.in);  

        int num = entrada.nextInt(); 

        for(int i=1; i<=num; i++){ 

            if(i%2==0) 

                par = par + i; 

            else 

                impar = impar + i; 

        } 

        System.out.println(impar);  

        System.out.println(par); 

    } 
