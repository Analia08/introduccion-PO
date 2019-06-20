
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
public class deberu {

    public static void main( String[] args )
    {
        int radio; // Almacena el radio del círculo
        
        // Instanciar un objeto de tipo 'Scanner'
        Scanner entrada = new Scanner( System.in );
        
        // Obtención del radio del círculo
        System.out.print( "Digite el radio del círculo: ");
        radio = entrada.nextInt();
        
        // Visualización de resultados
        //El Diámetro
        System.out.printf("\nEl diametro del círculo es: %d.", ( 2 * radio ) );
        
        // La Circunferencia
        System.out.printf( "\nLa circunferencia del círculo es: %f.", ( 2 * Math.PI * radio ) );
        
        // El Área
        System.out.printf( "\nEl área del círculo es: %f.\n", ( Math.PI * radio * radio ) );
        
        // Salida normal
        System.exit(0);
        
    } // fin del método main
}
    
