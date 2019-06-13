
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
public class vocales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        System.out.println("Digite una palabra");
        palabra = entrada.nextLine();
        System.out.println("la cadena ");
        int contador = 0;
        for (int x = 0; x < palabra.length(); x++) {
        if ((palabra.charAt(x) =='a') ||(palabra.charAt(x) == 'e') ||(palabra.charAt(x) =='i')||(palabra.charAt(x) =='o')||(palabra.charAt(x) =='u'));
                contador++;
        } 
    }
        System.out.println("la cadena"+palabra+"contiene"+contador+"vocales");
        int contador = 0;
        for (int x = 0; x < palabra.length(); x++) 
            if ((palabra.charAt(x) == 'b') ||(palabra.charAt(x) =='c')||(palabra.charAt(x) =='d')||(palabra.charAt(x) == 'f') ||(palabra.charAt(x) =='g')||(palabra.charAt(x) =='h')||(palabra.charAt(x) == 'j') ||(palabra.charAt(x) =='k')||(palabra.charAt(x) =='l'||(palabra.charAt(x) == 'm') ||(palabra.charAt(x) =='n')||(palabra.charAt(x) =='ñ')||(palabra.charAt(x) == 'p') ||(palabra.charAt(x) =='q')||(palabra.charAt(x) =='r')||(palabra.charAt(x) == 's') ||(palabra.charAt(x) =='t')||(palabra.charAt(x) =='v'));
            contador ++
                    }
    }
                    System.out.println("la cadena"+palabra+"contiene"+contador+"vocales");  
        
}

