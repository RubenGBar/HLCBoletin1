package ej4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio4Test {

	@ParameterizedTest
	@MethodSource("primilloChico")
	void testEsPrimo(int num, boolean resEsperado) {
		
		boolean resObtenido = Ejercicio4.esPrimo(num);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> primilloChico(){
		
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(3, true),
				Arguments.of(4, false),
				Arguments.of(5, true),
				Arguments.of(7, true),
				Arguments.of(9, false),
				Arguments.of(1, false),
				Arguments.of(0, false));
		
	}
	
}
