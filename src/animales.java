
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
public class animales {
    public static void main(String[] args) {
        String animal;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Ingrese el nombre de un animal");
        animal=entrada.nextLine();
        System.out.println("El nombre del animal es"+ animal);
        if (animal.equals("cabra")||animal.equals("vaca")||animal.equals("conejo"))
            System.out.println("hervivoros");
        else
            if(animal.equals("león")||animal.equals("tigre")||animal.equals("boa"))
                System.out.println("Carnivo");
        else
                if (animal.equals("cerdo")||animal.equals("camaleón")||animal.equals("serpiente"))
            System.out.println("Omnivoros");            
   }
}
