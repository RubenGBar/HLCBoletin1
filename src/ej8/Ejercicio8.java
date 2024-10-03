package ej8;

public class Ejercicio8 {
	
	public static int fibonacci(int num) throws Exception {
		
		int res = 0;
		
		if(num > 0) {
			
			if(num == 1 || num == 2) {
				
				res = 1;
				
			} else {
				
				res = fibonacci(num-1) + fibonacci(num-2);
				
			}
			
		} else {
			
			throw new Exception("Introduzca un numero mayor que 0");
			
		}
		
		return res;
	}

}
