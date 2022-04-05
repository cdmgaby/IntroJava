
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej14 {

    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int acum=0;
        
        
        for (int i=0;i<20;i++){
            System.out.println("Ingrese un numero");
        int number=leer.nextInt();
        acum= acum + number;
        
        if( number == 0 ){
            System.out.println("E Encontrado el 0");
        
            break;
        }  
        }
        
        System.out.println("La suma dio"+acum+"");
    }
}

                    
           
 
    

