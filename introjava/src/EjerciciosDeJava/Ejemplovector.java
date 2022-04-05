/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosDeJava;
import java.util.Scanner;
/**
 *
 * @author monto
 */
public class Ejemplovector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int vector[] = new int[5];
        System.out.println("Ingre los valores del vector de tamaño"+vector.length+":");
        
        for (int    i=0;i<vector.length;i++){
            System.out.println("v["+i+"]");
            vector[i] =leer.nextInt();
        }
        
        
        // TODO code application logic here
    }
    
}
