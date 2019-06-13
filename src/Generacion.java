
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author windows 7
 */
public class Generacion {
    public static void main (String[]args){
        Scanner entrada=new Scanner(System.in);
		int a;
		System.out.println("Ingresa tu año de nacimiento");
		a = entrada.nextInt();
		if (a>=1930 && a<=1948) {
			System.out.println("Pereneces a la generacón de Niños de la posguerra");
		} else {
			if (a>=1949 && a<=1968) {
				System.out.println("Perteneces a la generación de Baby Boom");
			} else {
				if (a>=1969 && a<=1980) {
					System.out.println("Perteneces a la Generación X");
				} else {
					if (a>=1981 && a<=1993) {
						System.out.println("Pertences a la Generacón Y");
					} else {
						if (a>=1994 && a<=2010) {
							System.out.println("Perteneces a a Generacón Z");
						} else {
							System.out.println("Eres un bebe para estar preguntando generaciones");
						}
					}
				}
			}
		}
	}
}
