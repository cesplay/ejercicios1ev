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
		
		System.out.print("\nintroduce la cantidad de los tres colores: \n");
		System.out.print("rojo(0, 255): ");
		double rojo = 0;
		rojo=teclado.nextDouble();
		System.out.print("verde(0, 255): ");
		double verde = teclado.nextDouble();
		System.out.print("azul(0, 255): ");
		double azul = teclado.nextDouble();
		double valorY= (0.299* rojo) + (0.587*verde) + (0.114*azul);
		double valorI= (0.596* rojo) - (0.275*verde) - (0.321*azul);
		double valorQ= (0.212* rojo) - (0.528*verde) + (0.311*azul);
		System.out.printf("Y:%.2f  I:%.2f  Q:%.2f",valorY, valorI, valorQ);
		
		
	}

}
