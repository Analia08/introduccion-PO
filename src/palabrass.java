
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
public class palabrass {
    public static void main(String[] args) {
    Scanner entrada=new Scanner(System.in);
    String p1;
    String p2;
        System.out.println("porfavor igresar dos Palabras");
        p1 = entrada.nextLine();
        p2=entrada.nextLine();
        if (p1 == null ? p2 == null : p1.equals(p2)){
            System.out.println("Las palabras son iguales");
        } else {
            System.out.println("Las palabras no son iguales");
}        
}
} 