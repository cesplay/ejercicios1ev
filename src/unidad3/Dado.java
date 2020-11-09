package unidad3;

import java.util.Scanner;

public class Dado {

	public static void main(String[] args) {
		
		int[] dado = new int[6];

		Scanner keyboard = new Scanner(System.in);
		System.out.println("¿Cuantas veces quieres tirar el dado?");
		int numero = keyboard.nextInt();
		
		for(int i=0;i<=numero;i++) {
			int random = (int)(Math.random()*6);	
			switch(random) {
			case 0: dado[0]= dado[0]+1;
			break;
			case 1: dado[1]= dado[1]+1;
			break;
			case 2: dado[2]= dado[2]+1;
			break;
			case 3: dado[3]= dado[3]+1;
			break;
			case 4: dado[4]= dado[4]+1;
			break;
			case 5: dado[5]= dado[5]+1;
			break;
			}
		}
		for(int i=0;i<=dado.length-1;i++) {
			System.out.println("La cara "+ (i+1) +" ha salido "+dado[i]+" veces");
		}
		keyboard.close();
	}

}
