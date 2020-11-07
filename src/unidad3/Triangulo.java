package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		if(a+b>c && a+c>b && c+a>b) {
			System.out.print("¿Es escaleno?(s,n)");
			char escaleno = teclado.next().charAt(0);
			System.out.print("¿Es equilátero?(s,n)");
			char equilatero = teclado.next().charAt(0);
			System.out.print("¿Es isósceles?(s,n)");
			char isosceles = teclado.next().charAt(0);
		}else {
			System.out.print("no es un triangulo valido");
		}
		teclado.close();
	}

}
