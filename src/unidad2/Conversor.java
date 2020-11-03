package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	public static void main(String[] args) {
		double euroDolar=1.17;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Introduce la cantidad de euros: ");
			double euros = Double.parseDouble(reader.readLine());
			System.out.printf("Es equivalente a : %.2f$", euros*euroDolar);
		}catch (Exception e){
            e.printStackTrace();
        }
		
	}

}
