package unidad4;

import java.util.Scanner;

public class Ejercicio11 {

	public static String cadenas(String v[]) {
		String max = v[0];
		for (int i = 1; i <= v.length - 1; i++) {
			if (v[i].length() > v[i - 1].length()) {
				max = v[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String [] cadena = new String[10];
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Introduce 10 nombres" );
		for(int i=0;i<=cadena.length-1;i++) {
			cadena [i]=keyboard.nextLine();
		}
		System.out.print("El nombre mas largo es: "+cadenas( cadena ) );
	}

}
