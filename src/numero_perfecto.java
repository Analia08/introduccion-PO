

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author window 7
 */
public class numero_perfecto {
    public static void main(String[] args) {
        int i, j, suma;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i<=1000;i++){   
            suma=0;
            for(j=1;j<i;j++){  
                 if(i%j==0){
                    suma=suma+j;     
                 }
            }
          if(i==suma){           
                 System.out.println(i);
              }
        }
    }
}
