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
		System.out.printf("He pensado un n�mero entre 1 y %d, adivina cu�l es: \n", n);
		while(numero!=random) {
			numero= teclado.nextInt();
			if(numero>random) {
				System.out.println("El n�mero es menor, �que n�mero he pensado?");
			}
			else if(numero<random) {
				System.out.println("El n�mero es mayor, �que n�mero he pensado?");
			}
			else {
				System.out.println("��Has acertado!!");
			}
		}
	}

}
