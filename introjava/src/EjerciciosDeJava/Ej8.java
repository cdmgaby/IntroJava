
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una frase");
        
        String f=leer.nextLine();
        
        if(f.equalsIgnoreCase("eureka")){
                System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }


        
   
        
        // TODO code application logic here
    }
    
}
