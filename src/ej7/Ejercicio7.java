package ej7;

public class Ejercicio7 {
	
	public static boolean fechaValida(int dia, int mes, int anio) {
		
		boolean valido = false;

		switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
	
				if (dia > 0 && dia <= 31) {
					valido = true;
				}
	
			}
			case 4, 6, 9, 11 -> {
	
				if (dia > 0 && dia <= 30) {
					valido = true;
				}
	
			}
			case 2 -> {
				
				if((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
					
					if (dia > 0 && dia <= 29) {
						valido = true;
					}
					
				}else {
					
					if (dia > 0 && dia <= 28) {
						valido = true;
					}
					
				}
			}
			default ->{
				
				valido = false;
				
			}
		}
		
		
		return valido;
		
	}
	
}
