package unidad2;

import java.util.Scanner;
public class Sueldo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("introduce el sueldo base: ");
		double sueldoBase = teclado.nextDouble();
		double comisionesTotales=0;
		
		int i=1;
		while(i<=3){
			System.out.print("introduce el importe de la" + i + "ª venta: ");
			double comision= teclado.nextDouble() *0.1;
			comisionesTotales+=comision;
			i++;
		}
		System.out.printf("\nHas ganado %.2f€ en comisiones y %.2f€ de sueldo base, lo que suma un total de: %.2f€", comisionesTotales, sueldoBase,
				comisionesTotales+sueldoBase);
		
	}

}
