/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class lapiz {
    private String color;
    private String tamaño;
    private String marca;
    //metodos 
    public void escribirinformcacion(){
        System.out.println("Hola soy el lapiz y escribo informacion");
    }
    public void dibujarinformcacion(){
        System.out.println("Hola soy el lapiz y dibujo informcacion"); 
    }
    public static void main(String[] args) {
       lapiz primerobjeto=new lapiz ();
       primerobjeto.escribirinformcacion();
       primerobjeto.dibujarinformcacion("HOLA");
       primerobjeto.dibujarinformcacion("CHAO");
    }
}