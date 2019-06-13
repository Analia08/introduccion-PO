/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class NewClass1 {
    public static void main(String[] args) {
    String cadena="los sombrillos";
    int index= cadena.indexOf("a");
//        System.out.println(index);
//        System.out.println(cadena.concat("Qyehcae"));
//        System.out.println(cadena);
//        System.out.println(cadena.contains("a"));
//    int contarA=0;
//    String contar="aA";
    String vocales="AEIOUaeiou";
    String consonantes="QWRTYPSDFGHJKLÑZXCVBNM";
    int contarvocales=0, contarconsonantes= 0;
    for (int i=0;i< cadena.length(); i++){
        if (vocales.contains(cadena.charAt(i)+"")){
            contarvocales++;
        }
        if (consonantes.contains(cadena.charAt(i)+"")){
            contarconsonantes++;
        }
    }
    System.out.println("vocales"+contarvocales+"consonantes"+contarconsonantes);
//    for (int i=0 ;i<cadena.length(); i++){
//        if (buscar.contains(cadena.charAt(i)+"")){
//            contarA++;
//        }else{
//            System.out.println("no encontre una A");
//       
//        }
//    }        
//        System.out.println("el numero total de A es"+contarA);  
     
    }    
}

public class newclass1 {
    public static void main(String[] args) {
   int num1=6;
   int num2=4;
   int suma1 = Math.addExact(num1,num2);
   
//        System.out.println(suma1);
//        System.out.println(Math.ceil(25.5));
//        System.out.println(Math.round(34.544));
//        int n1=4;
//        int n205;
//        int resultado= math.max(n1,n2);
//        
//        System.out.println(resultado);
        System.out.println(Math.cos(30));
        System.out.println(Math.sin(67));
        System.out.println(Math.tan(83.7));
    }    
        
        
        
        
        
        
        
        
        
   
   










    
//concat: une dos cadenas
//el index.of: devuelve entero
//contais: un bolaneo para saber si esta en el texto que devuelve con un si o un no 