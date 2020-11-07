package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int year = teclado.nextInt();
		if(year%4==0 && year%100!=0 || year%400==0 ) {
			System.out.print("el año es bisiesto");
		}else {
			System.out.print("no es un año bisiesto");
		}

	}

}
