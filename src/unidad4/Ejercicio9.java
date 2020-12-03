package unidad4;


public class Ejercicio9 {

	public static void main(String[] args) {
		int size=(int) ( Math.random()*(500-10+1)+10); 
		int [] v = new int[size];
		int startSequence=0;
		int count=0;
		for(int i=0; i<=v.length-1;i++) {
			int random=(int) (Math.random()*201+1 );
			if(200<=random && random>100) {
				random=(random/2)*(-1);
			}else if(random==201) {
				random=0;
			}
			v[i]=random;
			if(i>0) {
				if(v[i]==v[i-1]){
					startSequence=1;
				}
				if(startSequence==1 && ( v[i]!=v[i-1] || i==v.length-1) ) {
					startSequence=0;
					count++;
				}
			}
			
		}
		if(v.length<=50) {
			System.out.print("vector: ");
			for(int i=0; i<=v.length-1;i++) {
				System.out.print(v[i]+" ");
			}
		}
		System.out.print("\nhay "+count+" scuencias de números repetidos");
	}

}
