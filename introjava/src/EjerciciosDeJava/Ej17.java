
package EjerciciosDeJava;
import java.util.Scanner;


public class Ej17 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de elementos del lado");
        int n=leer.nextInt();
        
        //linea superior
        for(int i=0;i<n;i++){
            System.out.print("*");   
        }
        
        System.out.println(" ");
        
        //centro de la forma
        for(int i=0; i<n-2;i++){
            System.out.print("*");
            for(int j=0; j<n-2;j++){
                System.out.print(" ");
            }
            System.out.println("*");
   
        }
        
        
        //linea inferior
        for(int i=0;i<n;i++){
            System.out.print("*");   
        }
    }
    
}
