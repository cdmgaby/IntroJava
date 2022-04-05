
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         System.out.println("Ingrese un numero del cual quiera saber paridad");
         
         int num=leer.nextInt();
         
         
         if(num % 2 == 0){
             System.out.println("Es par");
         }else{
             System.out.println("Es impar");
         }
        
    }
    
}
