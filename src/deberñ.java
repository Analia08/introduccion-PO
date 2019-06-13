/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IST- LOJA
 */
public class deberñ {
	public static void main(String args[]) {
		String str1 = "String1";
		String str2 = "String2";
		StringBuffer str3 = new StringBuffer( "String1");

		boolean  result = str1.contentEquals( str3 );
		System.out.println(result);
		  
		result = str2.contentEquals( str3 );
		System.out.println(result);
	}
}

