/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
//public class NewClass {
//    
//}
package ejerciciosdeC;
import java.util.Scanner;

public class problema3 {

    
    public static void main(String[] args) {
      Scanner dato = new Scanner(System.in);
      int n;
      System.out.println("ingrese su edad: ");
      n = dato.nextInt();
      
      if(n>=18){
          System.out.println("es mayor de edad");
      }
      else{
          System.out.println("es menor de edad");
      }
    }
}