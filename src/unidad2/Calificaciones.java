package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			double tareasMatematicas=0;
			double tareasFisica=0;
			double tareasQuimica=0;
			double tarea=0;
			
			System.out.print("introduce la nota del examen de matemáticas");
			double examenMatematicas = Double.parseDouble(read.readLine());
			for(int i=1; i<=3 ; i++) {
				System.out.print("introduce la nota de la tarea " + i + "de matemáticas");
				tarea = Double.parseDouble(read.readLine());
				tareasMatematicas+= tarea;
			}
			tareasMatematicas/=3;
			
			System.out.print("introduce la nota del examen de física");
			double examenFisica = Double.parseDouble(read.readLine());
			for(int i=1; i<=2 ; i++) {
				System.out.print("introduce la nota de la tarea " + i + "de física");
				tarea = Double.parseDouble(read.readLine());
				tareasFisica+= tarea;
			}
			tareasFisica/=2;
			
			System.out.print("introduce la nota del examen de química");
			double examenQuimica = Double.parseDouble(read.readLine());
			for(int i=1; i<=3 ; i++) {
				System.out.print("introduce la nota de la tarea " + i + "de química");
				tarea = Double.parseDouble(read.readLine());
				tareasQuimica+=tarea;
			}
			tareasQuimica/=3;
			
//			System.out.println("\nLa nota del examen de matemáticas es: " + examenMatematicas);
//			System.out.println("La nota media de las atreas de matemáticas es: " + tareasMatematicas);
//			System.out.printf("Por tanto la nota final de matemáticas es: %.2f \n \n" , (0.9*examenMatematicas+0.1*tareasMatematicas));
			
			System.out.printf("\nLa nota del examen de física es:  %.2f \nLa nota media de las treas de física es: %.2f \n"
					+ "Por tanto la nota final de física es: %.2f \n \n", examenMatematicas, tareasMatematicas, 0.9*examenMatematicas+0.1*tareasMatematicas);
			
			System.out.printf("La nota del examen de física es:  %.2f \nLa nota media de las treas de física es: %.2f \n"
					+ "Por tanto la nota final de física es: %.2f \n \n", examenFisica, tareasFisica, 0.8*examenFisica+0.2*tareasFisica);
			
			System.out.printf("La nota del examen de química es:  %.2f \nLa nota media de las treas de química es: %.2f \n"
					+ "Por tanto la nota final de química es: %.2f \n", examenQuimica, tareasQuimica, 0.85*examenQuimica+0.15*tareasQuimica);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
