
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
public class debercinco {
  public static void main(String[] args) {
      Scanner entrada= new Scanner(System.in); 
  
    int num,positivo,negativo,cero,cant,i;
    positivo=0;
    negativo=0;
    cero=0;
      System.out.println ("Introduzca Cantidad de Numeros a Evaluar:");
    cant =entrada.nextInt();
    for(i=1; i<=cant;i++)
    {
        System.out.println("Introduzca un Numero Entero:");
        num=entrada.nextInt();
        if (num>0)
        {
            positivo+=+1;
        }
        else
        if(num<0)
        {
            negativo+=+1;
        }
        else
        cero+=+1;
    }
 
      System.out.println("\nLa Cantidad de Positivos Son:"+positivo);
      System.out.println("\nLa Cantidad de Negativos Son:"+negativo);
      System.out.println("\nLa Cantidad de Ceros Son:"+cero);
  }
}