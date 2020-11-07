package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
		
		int tabla;
		char repasar;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿que tabla desea repasar?(1-9)");
		tabla = teclado.nextInt();
		
		do {
			int fallos=0;
			
			for (int i=0; i<=9; i++) {
				System.out.print(tabla+" * "+i+" = ");
				int resultado = teclado.nextInt();
				if(resultado!=tabla*i) {
					System.out.println("la respuesta correcta es: " + tabla*i);
					fallos++; 
				}
			}
			if(fallos<2) {
				System.out.println("has tenido "+ fallos + " fallos, has aprobado.");
			}else {
				System.out.println("has tenido "+ fallos + " fallos, has suspendido.");
			}
			System.out.println("¿quieres segir repasando?(s/n)");
			repasar = teclado.next().charAt(0);
			if (repasar=='s') {
				System.out.println("¿que tabla desea repasar?(1-9)");
				tabla = teclado.nextInt();
			}
			
		}while(tabla>0 && tabla<=9 && repasar=='s');
		
	}

}
