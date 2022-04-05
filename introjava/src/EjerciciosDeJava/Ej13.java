
package EjerciciosDeJava;
import java.util.Scanner;
public class Ej13 {

  
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int lim=100;
    int acum=0;
    
    do{
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();      
        acum=acum+num;
        
    }while (acum<lim);
    
    System.out.println("La sumatoria dio"+acum+"");   
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
