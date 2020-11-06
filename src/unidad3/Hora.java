package unidad3;

import java.util.Scanner;


public class Hora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la hora en los siguientes formatos(00:00:00 o 00/00/00):");
		String tiempo = teclado.nextLine();
		int hora = Integer.parseInt( tiempo.substring(0,2) ); 
		int min = Integer.parseInt( tiempo.substring(3,5) ); 
		int seg = Integer.parseInt( tiempo.substring(6,8) );
		if( hora<24 && hora>0 && min<60 && min>0 && seg<60 && seg>0 ) {
			System.out.printf("%02d:%02d:%02d",hora,min,seg+1);
		}
		
		teclado.close();
		

	}

}
