/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_github;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Practica_Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        String caracter;
        int cont=0;
        Scanner sc=new Scanner (System.in);
        
        System.out.println("Caracter: ");
        caracter=sc.nextLine();
        System.out.println("Escribe cadena: ");
        cadena=sc.nextLine();      
        /**
         * Descripcion
         */        
        System.out.println(caracter+" aparece "+ncadena(caracter, cadena)+" veces");
    }
    /**
     * 
     * @param caracter
     * @param cadena
     * @return 
     */
    public static int ncadena(String caracter, String cadena){
        int cont=0;
        for (int i=0; i<cadena.length();i++){
            if (cadena.charAt(i)==caracter.charAt(0))
                cont++;
        }
        return cont;
    }
    
}