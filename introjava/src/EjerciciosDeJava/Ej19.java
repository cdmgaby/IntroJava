
package EjerciciosDeJava;
import java.util.Scanner;


public class Ej19 {

    
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Ingrese el numero que quere convertir");
        
        double num=leer.nextDouble();
        
        System.out.println("Ingrese el tipo de cambio que quiera realizar con el nombre de la moneda Libra/Dolar/Yen");
        String cambio=leer.next();
        
        
        double c=conversion(num,cambio);
        
        System.out.println(" " +num+" Euros es equivalente a " +c+ " " +cambio+ "");
    }
    
    
    public static double conversion(double a,String b){
      if(b.equalsIgnoreCase("libra")){
          
          double c =a*0.86;
          return c;
          
          
          
      }else if(b.equalsIgnoreCase("dolar")){
          double c=a*1.28611;
          return c;
          
          
          
      }else if(b.equalsIgnoreCase("yen")){
          
          double c=a*129.852;
          return c;
          
          
      }else{
          return 0;
      }
        
      
      
        
    }

    
}
 