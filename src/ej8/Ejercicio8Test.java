package ej8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio8Test {

	@ParameterizedTest
	@MethodSource("numAureo")
	void testFechaValida(int num, int resEsperado) {
		
		int resObtenido = 0;
		
		try {
			
			resObtenido = Ejercicio8.fibonacci(num);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream <Arguments> numAureo(){
		
		return Stream.of(
				Arguments.of(2, 1),
				Arguments.of(3, 2),
				Arguments.of(5, 5),
				Arguments.of(6, 8)
				);
		
	}
	
	@Test 
	public void numMayorQue0() {
		
		Assertions.assertThrows(Exception.class, () -> Ejercicio8.fibonacci(0), "Introduzca un numero mayor que 0");
		
	}

}
