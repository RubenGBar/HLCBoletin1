package ej7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio7Test {

	@ParameterizedTest
	@MethodSource("fechado")
	void testFechaValida(int dia, int mes, int anio, boolean resEsperado) {
		
		boolean resObtenido = Ejercicio7.fechaValida(dia, mes, anio);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream <Arguments> fechado(){
		
		return Stream.of(
				Arguments.of(21, 02, 2004, true),
				Arguments.of(21, 02, 1950, true),
				Arguments.of(21, 02, 1899, true),
				Arguments.of(30, 06, 2000, true),
				Arguments.of(30, 02, 1970, false), 
				Arguments.of(29, 02, 2004, true)
				);
		
	}
}
