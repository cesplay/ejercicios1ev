package unidad4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int [] restos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
		char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		System.out.println("Introduce un DNI: ");
		
		String dni=keyboard.nextLine();
		StringBuffer buffDni = new StringBuffer(dni);
		StringBuffer buffNum=new StringBuffer(dni);
		buffNum.deleteCharAt(8);
		String numeo=buffNum.toString();
		int num=Integer.parseInt( numeo );
		char letra=buffDni.charAt(8);
		int resto=num%23;
		int i=0;
		while(restos[i]!=resto && i<22) {
			i++;
		}
			if(letras[i]==letra) {
			System.out.print("El dni es correcto");
		}
		else {
			System.out.print("El dni es incorrecto");
		}
		
	}

}
