package ej6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio6Test {

	@ParameterizedTest
	@MethodSource("calculado")
	void testEsCapicua(int opc, int num1, int num2, double resEsperado) {
		
		int resObtenido = 0;
		
		try {
			
			resObtenido = Ejercicio6.calculadora(opc, num1, num2);
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> calculado(){
	
		return Stream.of(
				Arguments.of(1, 2, 3, 5),
				Arguments.of(2, 5, 6, -1),
				Arguments.of(3, 3, 7, 21),
				Arguments.of(4, 8, 2, 4)
				);
		
	}
	
	@Test 
	public void divide0() {
		
		Assertions.assertThrows(ArithmeticException.class, () -> Ejercicio6.calculadora(4, 2, 0));
		
	}
	
	@Test 
	public void opcionNoValida() {
		
		Assertions.assertThrows(Exception.class, () -> Ejercicio6.calculadora(5, 3, 2), "Opción no válida");
		
	}
}
