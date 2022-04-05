
package EjerciciosDeJava;
import java.util.Scanner;


public class Ej3 {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String name=leer.nextLine();
        String n1=name.toUpperCase();
        String n2=name.toLowerCase();
        
    System.out.println("La palrabra en mayuscula es " + n1 +" La palabra en minuscula es" +n2);
       
    }
    

 }