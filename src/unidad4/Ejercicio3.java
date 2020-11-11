package unidad4;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de texto:");
		String cadena1 = keyboard.nextLine();
		System.out.println("Introduce una cadena de texto:");
		String cadena2 = keyboard.nextLine();
		
		
		char [] caracteres1=cadena1.toCharArray();
		char [] caracteres2= cadena2.toCharArray();
		int contador=0;
		
		if(cadena1.length()>cadena2.length()) {
			for(int i=0;i<=cadena1.length()-1;i++) {
				if(caracteres1[i]==caracteres2[0]) {
					int coincidencia=0;
					int x=0;
					for(int z=i;z<=i+cadena2.length()-1;z++,x++) {
						if(caracteres1[z]==caracteres2[x]) {
							coincidencia++;
						}
					}
					if(coincidencia==cadena2.length()) {
						contador++;
					}
					
				}
			}
		}
		System.out.print("la segunda esta contenida" + contador +  "veces en la primera");
		keyboard.close();
	}

}
