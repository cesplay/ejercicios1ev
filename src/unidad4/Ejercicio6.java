package unidad4;

public class Ejercicio6 {

	public static void main(String[] args) {
		int random = (int) (Math.random()*(50-10+1)+10);
		int [] vector;
		vector= new int [random];
		int countC=0;
		int j=0;
		for (int i=0;i<=vector.length-1;i++) {
			random = (int) (Math.random()*101);
			int sign = (int) Math.round ( Math.random() );
			int numero;
			j=0;
			int count=0;
	
			if(sign==0) {
				numero = random;
			}
			else {
				numero = random *-1;
			}
			
			if(numero==0) {
				countC+=1;
			}
			while(j<=i && count<1) {
				
				if( (vector[j]==numero && numero!=0) || (numero==0 && countC>1) ) {
					count=1;
				}
				
				j++;
			}
			
			if(count<1) {	
				vector[i]=numero;
			}	
			
			else {
				i--;
			}
		}
		
		System.out.print("Vector original: ");
		for(int i=0;i<=vector.length-1;i++) {
			System.out.print(" "+vector[i]);
		}
		
		int inverso []= new int [vector.length];
		j=0;
		
		System.out.print("\nVector Inverso: ");
		
		for(int i= inverso.length-1; i>=0; i--) {
			inverso[j]=vector[i];
			System.out.print(" "+inverso[j]);
			j++;
		}
		
		
		
		
	}

}
