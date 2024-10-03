package ej6;

public class Ejercicio6 {
	
	public static int calculadora(int opc, int num1, int num2) throws Exception {
		
		int res = 0;		
		
		switch(opc) {
			case 1 ->{
				res = num1+num2;
			}
			case 2 ->{
				res = num1-num2;
			}
			case 3 -> {
				res = num1*num2;
			}
			case 4 -> {
				res = num1/num2;
			}
			default -> {
				throw new Exception("Opción no válida");
			}
		}
		
		return res;
	}

}
