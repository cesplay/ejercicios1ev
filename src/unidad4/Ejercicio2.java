package unidad4;

import java.util.Scanner;



public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");
		
		
		StringBuffer buffCadena = new StringBuffer(keyboard.nextLine());
		char [] caracteres= new char[buffCadena.length()];
		
		for (int i=buffCadena.length()-1; i>=0;i--) {
			caracteres [i]=buffCadena.charAt(i);
			System.out.print(caracteres [i]);
		}

		//String cadena = keyboard.nextLine();
		//StringBuffer buffCadena = new StringBuffer(cadena);
		//buffCadena.reverse();
		//System.out.print(buffCadena);
		
	}
}
