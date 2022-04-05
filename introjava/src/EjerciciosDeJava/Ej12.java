
package EjerciciosDeJava;
import java.util.Scanner;
public class Ej12 {

  public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese una nota del 0 al 10");
       int nota= leer.nextInt();
      
               
       while(nota<0 || nota>10){   
           System.out.println("Nota incorrecta, ingrese la nota de nuevo");
           nota=leer.nextInt();
       }
       System.out.println("Nota correcta");
    
    }
    
}
