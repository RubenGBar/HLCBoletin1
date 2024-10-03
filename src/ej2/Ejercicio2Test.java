package ej2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Ejercicio2Test {

	@ParameterizedTest
	@MethodSource("pareado")
	void testEsPar(int num, boolean resEsperado) {
		
		boolean resObtenido = Ejercicio2.esPar(num);
		assertEquals(resEsperado, resObtenido);
		
	}
	
	private static Stream<Arguments> pareado(){
		
		return Stream.of(
				Arguments.of(2, true),
				Arguments.of(3, false),
				Arguments.of(4, true),
				Arguments.of(5, false));
		
	}
	
//	@Test
//	void testEsPar2() {
//		
//		boolean resul = Ejercicio2.esPar(2);
//		assertTrue(resul);
//		
//	}
//
//	
//	@Test
//	void testEsPar3() {
//		
//		boolean resul = Ejercicio2.esPar(3);
//		assertFalse(resul);
//		
//	}
//	
//	@Test
//	void testEsPar4() {
//		
//		boolean resul = Ejercicio2.esPar(4);
//		assertTrue(resul);
//		
//	}
}
