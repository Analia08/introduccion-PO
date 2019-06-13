
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class dato {
       public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in);
         
        System.out.println("ingrese texto");
        String cadena;
         cadena=entrada.nextLine();
        
        String vocales = ("AaEeIiOoUu");
        String may = "POIUYTREWQASDFGHJKLÑMNBVCXZ";
        String espacios = (" ");
        String consonantes = "QWRTYPSDFGHJKLÑMNBVCXZmnbvcxzñlkjhgfdspytrwq";
        String minusculas = "qwertyuiopñlkjhgfdsazxcvbnm";
        int contarvocales = 0, contarmay = 0, contarespacios = 0, contarconsonantes = 0, contarminusculas = 0;
        for (int i = 0; i < cadena.length(); i++) {

            if (vocales.contains(cadena.charAt(i) + "")) {
                contarvocales++;
            }
            if (may.contains(cadena.charAt(i)+ "")){
                contarmay++;
            }
            if (consonantes.contains(cadena.charAt(i)+ "")){
                contarconsonantes++;
            }
            if (minusculas.contains(cadena.charAt(i)+"")){
                contarminusculas++;
            }
        }
            System.out.println("vocales" + contarvocales + " consonantes" + contarconsonantes + " espacios" + contarespacios + " mayusculas" + contarmay + " minusculas" + contarminusculas);

        
        
       
        
    }
    
}