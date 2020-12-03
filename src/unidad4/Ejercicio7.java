package unidad4;

import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		
		int [] vector;
		int size;
		long emptyTime;
		long fullTime;
		int seconds;
		int miliseconds;
		int max;
		int min;
		int difference;
		
		Scanner keyboard = new Scanner(System.in);
		do {
		System.out.println("Introduce el tamaño del vector(en 10 y 10.000.000): ");
		size= keyboard.nextInt();
		if(size>10000000 || size<10) {
			System.out.println("El valor es incorrecto.\n");
		}
		}while(size>10000000 || size<10);
		vector= new int [size];
		
		emptyTime= System.currentTimeMillis();
		
		for(int i=0; i<=vector.length-1;i++) {
			int random = (int) (Math.random()*1000000);
			int sign=(int) Math.round( Math.random() ) ;
			int count=0;
			int countC=0;
			int j=0;
			if(sign==0) {
				random*=-1;
			}
			if(random==-1000000) {
				random=0;
			}
			if(random==0) {
				countC++;
			}
			while( j<=i && count==0 ) {
				if(random==vector[j] && random!=0 || random==0 && countC>1) {
					count=1;
				}
				j++;
			}
			
			if(count==1 ) {
				i--;	
			}else {
				vector[i]=random;
			}
			
		}
		fullTime=System.currentTimeMillis();
		seconds= (int) ( (fullTime-emptyTime)/1000 );
		miliseconds= (int) ( (fullTime-emptyTime)%1000 );
		
		System.out.println("El tamaño del vector es: "+ size);
		System.out.println("El programa a tardado " + seconds + " segundos y "+ miliseconds + " milisegundos en llenar el vector");
		
		
		emptyTime=System.currentTimeMillis();
		min=vector[0];
		max=min;
		for(int i=1; i<=vector.length-1;i++) {
			if(vector[i]<min) {
				min=vector[i];
			}
			if(vector[i]>max) {
				max=vector[i];
			}
		}
		difference=max-min;
		fullTime=System.currentTimeMillis();
		seconds= (int) ( (fullTime-emptyTime)/1000 );
		miliseconds= (int) ( (fullTime-emptyTime)%1000 );
		
		System.out.println("La diferencia entre el mayor y el menor es: " + difference);
		System.out.println("El programa a tardado " + seconds + " segundos y "+ miliseconds + " milisegundos calcular la diferenca "
				+ "entre el mayor y el menor");
	}

}
