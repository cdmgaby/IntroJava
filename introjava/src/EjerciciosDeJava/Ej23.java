
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej23 {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int matriz[][] = new int[4][4];
        int Traspuesta[][] = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                matriz[i][j] = (int)(Math.random()*100+0);
                    
            }
               
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                Traspuesta[i][j] = matriz[j][i] ;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        System.out.println("  ");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + Traspuesta[i][j] + "]");
            }
            System.out.println(" ");
        }
        
        
        
    }
    
}
