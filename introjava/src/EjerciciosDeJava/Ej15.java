
package EjerciciosDeJava;
import java.util.Scanner;
public class Ej15 {
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("Ingrese un numero");
       int n1=leer.nextInt();
       System.out.println("Ingrese otro numero");
       int n2=leer.nextInt();
       int num=0;  
       
    while(num!=5) {

        System.out.println("  MENU  ");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opción");
       
        
        num=leer.nextInt();
        

        switch(num){
            case 1:
                int suma= n1+n2;
                System.out.println("La suma es"+suma+"");
                
                break;
            case 2:
                int resta=n1-n2;
                System.out.println("La resta es"+resta+"");
                break;
            case 3:
                int multi=n1*n2;
                System.out.println("La multiplicacion es "+multi+"");
               
                break;
                
            case 4:
                int dividir=n1/n2;
                System.out.println("La division es"+dividir+"");
                
                break;
            
            }
             
        if(num==5){

             System.out.println("Seguro quiere salir (1.Si/2.No)");
             String sino=leer.next();
//             if(sino==1){
//
//             num=5;
//             }else{
//             num=6;
             }
    }
     }

   
//   System.out.println("Game over");  
}

//}



