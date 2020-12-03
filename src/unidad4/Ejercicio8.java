package unidad4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int v [];
		int random;
		int sign;
		int sum=0;
		int j=14;
		int sum13=0;
		int count=0;
		
		
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("introduce un tamaño para el vector entre 10 y 200");
			v= new int [in.nextInt()];
		}while(v.length<10 || v.length>200);
		;
		
		for(int i=0;i<=v.length-1;i++) {
			random= (int) ( Math.random()*21 );
			sign= (int)  ( Math.random()*2 );
			if(sign==1) {
				random*=-1;
			}
			v[i]=random;
		}
		for(int i=0;i<=v.length-1;i++) {
			if(v[i]==13 || j<14 && j>0) {
				sum13+=v[i];
				j--;
				if (j==0 && sum13==7) {
					sum+=sum13;
				}
				count++;
			}else {
				j=14;
				sum13=0;
				sum+=v[i];
			}
			System.out.print(v[i]+" ");
		}
		System.out.println("\nsumatorio= "+sum);	
		System.out.println(count+" número no se han sumado");		
	}

}
