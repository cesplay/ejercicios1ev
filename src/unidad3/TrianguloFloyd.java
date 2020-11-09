package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		int x=1; 
		for(int i=1;i<=numero;i++){
			for(int j=1;j<=i;j++){
				System.out.printf(" %d ",x);
				x++;
			}
			System.out.print("\n");
		}
		keyboard.close();
	}

}
