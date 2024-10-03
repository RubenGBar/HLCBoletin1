package ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio3Test {

	@ParameterizedTest
	@MethodSource("multiplos")
	void testEsMultilo3Y5(int num, String resEsperado) {
		
		String resObtenido = Ejercicio3.multilplo3Y5(num);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> multiplos(){
		
		return Stream.of(
				Arguments.of(2, ""),
				Arguments.of(3, "fizz"),
				Arguments.of(5, "buzz"),
				Arguments.of(15, "fizzbuzz"));
		
	}
	
}
