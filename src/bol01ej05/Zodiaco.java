/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol01ej05;

import java.util.Scanner;

/**
 *
 * @author Window 7
 */
public class Zodiaco {

    
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
        int d,m;
        System.out.println("Ingresa tu dia de nacimiento");
        d=entrada.nextInt();
        System.out.println("Ingresa tu mes de nacimiento");
        m=entrada.nextInt();
    if ((d>=22 && m==3) || (d<=21 && m==4)) {
			System.out.println(" Aries");
		}
		if ((d>=22 && m==4) || (d<=21 && m==5)) {
			System.out.println(" Tauro");
		}
		if ((d>=22 && m==5) || (d<=21 && m==6)) {
			System.out.println(" Geminis");
		}
		if ((d>=22 && m==6) || (d<=21 && m==7)) {
			System.out.println(" Cancer");
		}
		if ((d>=22 && m==7) || (d<=21 && m==8)) {
			System.out.println(" Leo");
		}
		if ((d>=22 && m==8) || (d<=21 && m==9)) {
			System.out.println(" Virgo");
		}
		if ((d>=22 && m==9) || (d<=21 && m==10)) {
			System.out.println(" Libra");
		}
		if ((d>=22 && m==10) || (d<=21 && m==11)) {
			System.out.println(" Escorpion");
		}
		if ((d>=22 && m==11) || (d<=21 && m==12)) {
			System.out.println(" Sagitario");
		}
		if ((d>=22 && m==12) || (d<=21 && m==1)) {
			System.out.println(" Capricornio");
		}
		if ((d>=22 && m==1) || (d<=21 && m==2)) {
			System.out.println(" Acuario");
		}
		if ((d>=22 && m==2) || (d<=21 && m==3)) {
			System.out.println(" Piscis");
		}
	}
}