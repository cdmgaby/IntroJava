
package EjerciciosDeJava;
import java.util.Scanner;
/**
 *
 * @author monto
 */
public class Ej11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tipo de motor 1:bomba de agua 2:gasoil 3:bomba hormigon 4:bomba pasta alimenticia");
        int tipo=leer.nextInt();
                switch(tipo){
                    case 1:
                        System.out.println("El motor es Bomba de agua");
                    break;
                    case 2:
                        System.out.println("El motor es gasoil");
                    break;
                    case 3:
                        System.out.println("El motor es bomba de hormigon");
                    break;
                    case 4:
                        System.out.println("El motor es de pasta alimnticia");
                    break;
                    default:
                        System.out.println("No existe un valor valido para este motor");
                       
                }
                        
    }
    
}
