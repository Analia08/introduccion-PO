/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class computador {
    private int  año;
    private String modelo;
    private String marca;
    private double capacidaddeprosesador;
    private boolean portatil;
    //declaro metodos
    public void guardarInformacion(){
        System.out.println("Hola soy la compuradora y guardo informacion");
    }
    public void leerInformacion(){
        System.out.println("Hola soy la computador y leo la informcacion");
    }
    public void imprimirInformacion(String info) {
        System.out.println(info);
    }
     public static void main(String[] args) {
       computador primerobjeto=new computador ();//he creado mi primer objeto
       primerobjeto.guardarInformacion();
       primerobjeto.imprimirInformacion("HOLA");
       primerobjeto.imprimirInformacion("CHAO");
    }
}
