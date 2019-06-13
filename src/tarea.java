
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
public class tarea {
  
   public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
       String d;
System.out.println("Ingresar un dia de la semana");
d = entrada.nextLine();
if (d.equals("lunes") || d.equals("martes") || d.equals("miercoles") || d.equals("jueves") || d.equals("viernes")) {
System.out.println("Es Laborable");
} else {
if (d.equals("domingo") || d.equals("sabado")) {
System.out.println("Feriado");
} else {
System.out.println("Ingrese un dìa de la semana correcto");
}
}
}
    

}
       
            
        
   

  
  
        
    
