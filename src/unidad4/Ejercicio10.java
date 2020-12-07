package unidad4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int v[];
		int size;
		int minDif = 11;
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Introduce un número entre 10 y 20");
			size = keyboard.nextInt();
		} while (size < 20 && size < 10);

		v = new int[size];
		int random = (int) (Math.random() * (20 - 10 + 1) + 10);
		v[0] = random;
		System.out.print("Vector: ");
		System.out.print(v[0] + " ");
		for (int i = 1; i < v.length; i++) {
			random = (int) (Math.random() * 20+1 );
			v[i] = random;
			int dif = v[i] - v[i - 1];
			if (dif<0) {
				dif*=-1;
			}
			if (minDif > dif) {
				minDif=dif;
			}
			System.out.print(v[i] + " ");
		}
		System.out.print("la diferencia minima es: " + minDif);

	}

}
