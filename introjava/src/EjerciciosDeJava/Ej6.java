
package EjerciciosDeJava;
import java.util.Scanner;
/**
 *
 * @author monto
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        
        int num1=leer.nextInt();
                
        System.out.println("Ingrese otro numero");
        
        int num2=leer.nextInt();
        
        int M=Math.max(num1,num2);
        
        System.out.println("El mas grande de los 2 es "+M+"");
        // TODO code application logic here
    }
    
}
