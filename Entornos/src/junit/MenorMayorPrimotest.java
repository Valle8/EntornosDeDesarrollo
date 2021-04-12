package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenorMayorPrimotest {

	@Test
	void test_mayormenor() {
		int numeros[]=new int[] {3,5,7};
		int resultado[]=MenorMayorPrimo.mayorMenor(numeros);
		int esperado[]= new int[] {7,3};
		assertArrayEquals(esperado, resultado);
	}
	@Test
	void test_primos() {
		int numero = 12;
		int actual[]=MenorMayorPrimo.ultimos3Primos(numero);
		int esperado[]=new int[] {11,7,5};
		assertArrayEquals(esperado, actual);
	}

}
