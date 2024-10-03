package ej3;

public class Ejercicio3 {

	public static String multilplo3Y5(int num) {
		
		String resul = "";
		
		if(num%3 == 0) {
			
			resul += "fizz";
			
		}
		
		if(num%5 == 0) {
			
			resul += "buzz";
			
		}
		
		
		return resul;
	}
	
}
