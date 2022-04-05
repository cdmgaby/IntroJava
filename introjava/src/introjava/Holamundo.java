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
public class Holamundo {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("Ingresa tu nombre:");
        
        nombre = leer.next();
        
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en java!");
        
        // TODO code application logic here
    }
    
}
