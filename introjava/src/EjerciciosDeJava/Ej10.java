
package EjerciciosDeJava;
import java.util.Scanner;
public class Ej10 {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese una palabra con inicial A");
        
        String cadena=leer.nextLine();
        
        String cad= cadena.substring(0, 1);
        
        if(cad.equalsIgnoreCase("A")){

            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        
        }
    }
    
}
