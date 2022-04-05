
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej5 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       
       System.out.println("Ingrese un numero del cual quiera saber d/t y raiz");
               
       double num=leer.nextInt();
       
       double raiz=Math.sqrt(num);
       
       double doble=num*2;
       double triple=num*3;
               
        System.out.println("La raiz de ese num es " +raiz+ "El doble es " +doble+ "y el triple es "+triple);
         
        // TODO code application logic here
    }
    
}
