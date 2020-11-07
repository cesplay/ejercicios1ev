package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char op;
		char vOp=0;
		double resultado=0;
		do {
			System.out.println("sumar(s), restar(r), multiplicar(m), dividir(d), salir(q)");
			op=teclado.next().charAt(0);
			while(op!='s' && op!='r' && op!='m' && op!='d' && op!='q') {
				System.out.println("Introduce un caracter valido");
				System.out.println("sumar(s), restar(r), multiplicar(m), dividir(d), salir(q)");
				op=teclado.next().charAt(0);
			}
			if(op!='q') {
				System.out.println("Introduce el primer número");
				double num1=teclado.nextDouble();
				System.out.println("Introduce el segundo número");
				double num2=teclado.nextDouble();
				switch (op){
				case 's': 
					vOp='+';
					resultado=num1+num2;
					break;
				case 'r': 
					vOp='-';
					resultado=num1-num2;
					break;
				case 'm': 
					vOp='*';
					resultado=num1*num2;
					break;
				case 'd': 
					vOp='/';
					resultado=num1/num2;
					break;
	
				}
				System.out.printf("%.2f %c %.2f = %.2f \n", num1, vOp, num2, resultado );
			}
		}while(op!='q');
		teclado.close();
	}
}
