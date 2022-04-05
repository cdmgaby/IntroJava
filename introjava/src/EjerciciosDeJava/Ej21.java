
package EjerciciosDeJava;
import java.util.Scanner;

public class Ej21 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int vector[]=   new int [20];
        
        for (int i=0;i<vector.length;i++){
        vector[i]=(int)(Math.random()*20+0);
         }
        
        System.out.println("Ingrese el valor que quiere buscar en el vector");
        
        int n=leer.nextInt();
        
        for (int i=0;i<vector.length;i++){
            
            if(vector[i]==n){
                System.out.println("El numero buscado se encuentra en la pisicion "+ i +"");            
            }
               
            
        }
         
        String aux="";
        System.out.println("*Vector:");
        for(int elemento:vector){
            aux=aux+" "+elemento;
        }
        System.out.println(aux);
    
}
        
        
      
        
        
        
    }
    

