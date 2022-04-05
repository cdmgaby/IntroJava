
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej20 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int vector[] = new int[100];
        int n=101;
        for (int i=0;i<vector.length;i++){
            
           n=n-1;
            
           vector[i] =n;
        }
        
        String aux="";
        System.out.println("*Vector:");
        for(int elemento:vector){
            aux=aux+" "+elemento;
        }
        System.out.println(aux);
    
}

}
