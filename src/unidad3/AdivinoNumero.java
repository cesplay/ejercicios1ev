package unidad3;

import java.util.ArrayList;
import java.util.Scanner;

public class AdivinoNumero {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Piensa un número entre 1 y N \nIntroduce el valor de N: ");
		int min=1;
		int max = keyboard.nextInt();
		int random = (int)(Math.random()*max+1);
		boolean acertar=false;
		boolean mentira=false;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		do {
			System.out.print("Es el número que has pensado mayor(+), menor(-) o acierto(a) a :" + random);
			char valor = keyboard.next().charAt(0);
			if(valor=='+') {
				if (random == max) {
					System.out.println("me estas engañando");
					mentira=true;
				}
				if(random < max) {
					min=random+1;
				}
				
			}
			else if(valor=='-') {
				if (random == min) {
					System.out.println("me estas engañando");
					mentira=true;

				}
				if(random > min) {
				max=random-1;
				}	
			}
			else if(valor=='a') {
				System.out.print("¡acerte!");
				acertar=true;						
			}
			numeros.add(random);
			if( mentira==true) {
				System.out.println("Me has engañando");
				for(int i=numeros.size()-1;i>=0;i--) {
					System.out.println("¿Es este el numero que estabas pensando?(s/n) " + numeros.get(i));	
					char respuesta = keyboard.next().charAt(0);
					if(respuesta=='s') {
						System.out.println("he acertado");
						acertar=true;
						break;
					}
				}
				if (acertar==false) {
					System.out.println("Eres un mentiroso compulsivo");
					acertar=true;
				}
				
			}
			
			
			
			random= (int)(Math.random()*(max-min+1)+min);
		}while(acertar==false);
	}

}
