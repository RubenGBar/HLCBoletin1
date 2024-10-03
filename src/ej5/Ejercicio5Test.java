package ej5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio5Test {
	
	@ParameterizedTest
	@MethodSource("capicuo")
	void testEsCapicua(int num, boolean resEsperado) {
		
		boolean resObtenido = Ejercicio5.esCapicua(num);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> capicuo(){
	
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(30, false),
				Arguments.of(22, true),
				Arguments.of(101, true),
				Arguments.of(305, false),
				Arguments.of(2112, true),
				Arguments.of(2123, false),
				Arguments.of(50505, true)
				);
		
	}
	
}
