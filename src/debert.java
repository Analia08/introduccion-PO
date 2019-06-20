/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class debert {
    public static void main(String[] args) {
        System.out.println( separa(42339, "") );        
    }
    
    private static String separa(int n, String r){
        if( n < 10 ) 
            return r;        
        else if ( n/10 >= 1000 && r.equals(""))
            return separa(n, " "+n%10);
        else
           return separa(n/10, " "+(((n/10))%10) + r );
    }    
    
}
 
   