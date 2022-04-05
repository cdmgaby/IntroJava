/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author monto
 */
public class EncuestasConCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la peli de 1 a 5");
        opinion=leer.nextInt();
        
        if (opinion>=1 && opinion<=5){
            switch(opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimis apenados");
                    break;
                case 3:
                    System.out.println("La has calificado como buena");
                    break;
                case 4:
                    System.out.println("Joyita");
                    break;
                case 5:
                    System.out.println("Te amo");
                    break;
            }
        } else if(opinion < 0){
            System.out.println("Tan mala fue rey ?");
            
        }else if (opinion == 0 ){   
            System.out.println(" el valor no es valido");
           
        }else {
            System.out.println(" Gracias rey alto putnaje");   
        }
        System.out.println("Adios");
        // TODO code application logic here
    }
    
}
