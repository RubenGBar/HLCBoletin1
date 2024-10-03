package ej5;

public class Ejercicio5 {

	public static boolean esCapicua(int num) {
		
		boolean esCapicua = false;
		int numReves = 0;
		int aux = 0;
		int numP = num;
		
		if(num < 10 && num >= 0) {
			
			esCapicua = true;
			
		}else if (num >= 10) {
			
			while(numP > 0) {
				
				aux = numP%10;
				numReves *= 10;
				numReves += aux;
				numP = numP/10;
				
			}
			
			if(num == numReves) {
				
				esCapicua = true;
				
			}
			
		}
		
		return esCapicua;
		
	}
	
}
