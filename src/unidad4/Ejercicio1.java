package unidad4;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int e=0;
		int u=0;
		int i=0;
		int o=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");
		String cadena = keyboard.nextLine();
		char[] caracteres = cadena.toCharArray();
		
		for(int j=0; j<=caracteres.length-1; j++) {
			char letra=caracteres[j];
			switch(caracteres[j]) {
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'u':
					u++;
					break;
				case 'i':
					i++;
					break;
				case 'o':
					o++;
					break;
			}
		}
		System.out.printf("a: %d \ne: %d \nu: %d \ni: %d \no: %d", a, e, u, i,o);
	}

}
