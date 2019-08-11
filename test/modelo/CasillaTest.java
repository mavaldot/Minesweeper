package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CasillaTest {

	Casilla casilla;
	
	private void setUpScene1() {
		casilla = new Casilla(Casilla.LIBRE);
	}
	
	private void setUpScene2() {
		casilla = new Casilla(Casilla.MINA);
	}
	
	@Test
	public void testCasillaLibre() {
		setUpScene1();
		assertTrue(!casilla.esMina());
	}
	
	@Test
	public void testCasillaMina() {
		setUpScene2();
		assertTrue(casilla.esMina());
	}

	@Test
	public void testDarValor() {
		setUpScene1();
		assertTrue(casilla.darValor() == -1);
		
		setUpScene2();
		assertTrue(casilla.darValor() == -1);
	}
	
	@Test
	public void testModificarValor() {
		setUpScene1();
		casilla.modificarValor(4);
		assertTrue(casilla.darValor() == 4);
		
		setUpScene2();
		casilla.modificarValor(-7);
		assertTrue(casilla.darValor() == -7);
	}
	
	@Test
	public void testDarSeleccionada() {
		setUpScene1();
		assertTrue(!casilla.darSeleccionada());
		
		setUpScene2();
		assertTrue(!casilla.darSeleccionada());
	}
	
	@Test
	public void testDestapar() {
		setUpScene1();
		assertTrue(!casilla.darSeleccionada());
		casilla.destapar();
		assertTrue(casilla.darSeleccionada());
		
		setUpScene2();
		assertTrue(!casilla.darSeleccionada());
		casilla.destapar();
		assertTrue(casilla.darSeleccionada());
	}
	
	@Test
	public void testMostrarValorCasilla() {
		setUpScene1();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		casilla.destapar();
		assertTrue(casilla.mostrarValorCasilla().equals("-1"));
		
		setUpScene1();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		casilla.modificarValor(42);
		casilla.destapar();
		assertTrue(casilla.mostrarValorCasilla().equals("42"));
		
		setUpScene2();
		assertTrue(casilla.mostrarValorCasilla().equals("-"));
		casilla.destapar();
		assertTrue(casilla.mostrarValorCasilla().equals("*"));
	}
	
}
