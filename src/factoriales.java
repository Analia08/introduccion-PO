
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class factoriales {
    public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double f;
		double i;
		double n;
		f = 1;
		System.out.println("Ingrese un numero");
		n = Double.parseDouble(bufEntrada.readLine());
		for (i=1;i<=n;i++) {
			f = f*i;
		}
		System.out.println("El factorial de"+n+"es"+f);
	}
}
