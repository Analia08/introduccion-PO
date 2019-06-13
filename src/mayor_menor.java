
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
public class mayor_menor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("ingresa un numero");
        a = entrada.nextInt();
        System.out.println("Ingresa un  numero");
        b = entrada.nextInt();
        System.out.println("Ingresa un  numero");
        c = entrada.nextInt();
        if (a > b && a > c) {
            System.out.println("el mayor es:" + a);
        } else {
            if (b > a && b > c) {
                System.out.println("el mayor es:" + b);
            } else {
                if (c > a && c > b) {
                    System.out.println("el mayor es:" + c);
                }
            }
        }
        if (a < b && a < c) {
            System.out.println("el menor es:" + a);
        } else {
            if (b < a && b < c) {
                System.out.println("el menor es:" + b);
            } else {
                if (c < a && c < b) {
                    System.out.println("el menor es:" + c);
                }
            }
        }
        if (a > b && a < c) {
            System.out.println("el medio es:" + a);
        } else {
            if (b > a && b < c) {
                System.out.println("el medio es:" + b);
            }else {
                if (c > a && c<b){
                     System.out.println("el medio es:" + c);
                }
            }
        }
    }
}
