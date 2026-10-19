package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion3.Cuenta;

class CuentaTest {

	Cuenta c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta(0.0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		c.ingreso(5.0);
		assertEquals(5.0, c.getSaldo());
	}
	
	@Test
	void testRetirar() {
		c.retirar(5.0);
		assertEquals(-5.0, c.getSaldo());
	}
	
	@Test
	void test0014() {
		Cuenta cuenta1 = new Cuenta(50.0);
		cuenta1.setNumero("12345");
		Cuenta cuenta2 = new Cuenta(0.0);
		cuenta2.setNumero("67890");
		
	    cuenta1.retirar(200.0);
	    assertEquals(-150.0, cuenta1.getSaldo());

	    cuenta2.retirar(350.0);
	    assertEquals(-350.0, cuenta2.getSaldo());

	    cuenta1.ingreso(100.0);
	    assertEquals(-50.0, cuenta1.getSaldo());

	    cuenta2.retirar(200.0);
	    assertEquals(-350.0, cuenta2.getSaldo());

	    cuenta2.retirar(150.0);
	    assertEquals(-500.0, cuenta2.getSaldo());

	    cuenta1.retirar(200.0);
	    assertEquals(-250.0, cuenta1.getSaldo());

	    cuenta2.ingreso(50.0);
	    assertEquals(-450.0, cuenta2.getSaldo());

	    cuenta2.retirar(100.0);
	    assertEquals(-450.0, cuenta2.getSaldo());
		
	}
	

}
