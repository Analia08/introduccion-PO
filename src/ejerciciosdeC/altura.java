/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeC;

import java.util.Scanner;

/**
 *
 * @author window 7
 */
public class altura {
    public static void main(String[]args){
        Scanner entrada=new Scanner (System.in);
        float altura,peso,imc;
        System.out.println("Porfavor ingresar altura");
        altura=entrada.nextFloat();
        System.out.println("Porfavor ingresar el peso en Kg");
        peso=entrada.nextFloat();
        imc=peso/(altura*altura);
        System.out.println("El imc es"+imc);
        if(imc<16.99)
            System.out.println("Bajo de peso");
        else if (imc>18.5 && imc<=24.99)
            System.out.println("Peso normal");
        else if (imc<29.99)
            System.out.println("Sobrepeso");
    }
}
