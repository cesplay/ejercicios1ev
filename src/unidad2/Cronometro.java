package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
		try {
			System.out.print("nombre: ");
			long tiempo1 = System.currentTimeMillis();
			String nombre = reader.readLine();
			long tiempo2 = System.currentTimeMillis();
			long tiempoFinal= tiempo2-tiempo1;
			long segundos = tiempoFinal / 1000;
			long milisegundos = tiempoFinal % 1000;
			System.out.printf("%s has tardado %d,%d segundos en contestar",nombre, segundos, milisegundos);
			
//			System.out.print("nombre: ");
//			double tiempo1 = System.currentTimeMillis();
//			String nombre = reader.readLine();
//			double tiempo2 = System.currentTimeMillis();
//			double cronometro= (tiempo2-tiempo1)/1000;
//			System.out.printf("%s has tardado %.3f segundos en contestar",nombre, cronometro);
			
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
