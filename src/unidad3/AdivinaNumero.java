package unidad3;

import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int n= (int)(Math.random()*(100000-1000+1)+1000);
		int random = (int)(Math.random()*n+1);
		int numero=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(n);
		System.out.println(random);
		System.out.printf("He pensado un número entre 1 y %d, adivina cuál es: \n", n);
		while(numero!=random) {
			numero= teclado.nextInt();
			if(numero>random) {
				System.out.println("El número es menor, ¿que número he pensado?");
			}
			else if(numero<random) {
				System.out.println("El número es mayor, ¿que número he pensado?");
			}
			else {
				System.out.println("¡¡Has acertado!!");
			}
		}
	}

}
