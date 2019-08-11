package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscaminasTest {

	Buscaminas buscaminas;
	
	private void setUpBuscaminasPrincipiante() {
		buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE);
	}
	
	private void setUpBuscaminasIntermedio() {
		buscaminas = new Buscaminas(Buscaminas.INTERMEDIO);
	}
	
	private void setUpBuscaminasExperto() {
		buscaminas = new Buscaminas(Buscaminas.EXPERTO);
	}
	
	private void setUpBuscaminasInicializarPartidaPrincipiante() {
		try {
			buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE, 1);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}
		
	}
	
	private void setUpBuscaminasInicializarPartidaIntermedio() {
		try {
			buscaminas = new Buscaminas(Buscaminas.INTERMEDIO, 1);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}
		
	}
	
	private void setUpBuscaminasInicializarPartidaExperto() {
		try {
			buscaminas = new Buscaminas(Buscaminas.EXPERTO, 1);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}
		
	}
	
	private void setUpBuscaminasGenerarMinasPrincipiante() {
		try {
			buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE, 2);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	private void setUpBuscaminasGenerarMinasIntermedio() {
		try {
			buscaminas = new Buscaminas(Buscaminas.INTERMEDIO, 2);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	private void setUpBuscaminasGenerarMinasExperto() {
		try {
			buscaminas = new Buscaminas(Buscaminas.EXPERTO, 2);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	private void setUpBuscaminasInicializarCasillasLibresPrincipiante() {
		try {
			buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE, 3);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	private void setUpBuscaminasInicializarCasillasLibresIntermedio() {
		try {
			buscaminas = new Buscaminas(Buscaminas.INTERMEDIO, 3);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	private void setUpBuscaminasInicializarCasillasLibresExperto() {
		try {
			buscaminas = new Buscaminas(Buscaminas.EXPERTO, 3);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
	}
	
	@Test
	public void testInicializarPartidaPrincipiante() {
		setUpBuscaminasInicializarPartidaPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_PRINCIPIANTE);
		assertTrue(columns == Buscaminas.COLUMNAS_PRINCIPIANTE);
	}
	
	@Test
	public void testInicializarPartidaIntermedio() {
		setUpBuscaminasInicializarPartidaIntermedio();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_INTERMEDIO);
		assertTrue(columns == Buscaminas.COLUMNAS_INTERMEDIO);
	}
	
	@Test
	public void testInicializarPartidaExperto() {
		setUpBuscaminasInicializarPartidaExperto();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_EXPERTO);
		assertTrue(columns == Buscaminas.COLUMNAS_EXPERTO);
	}
	
	@Test
	public void testGenerarMinasPrincipiante() {
		setUpBuscaminasGenerarMinasPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		
		int rows = casillas.length;
		int columns = casillas[0].length;
		
		int mineCount = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(casillas[i][j] != null) {
					if(casillas[i][j].esMina()) {
						mineCount++;
					}
				}
			}
		}
		assertTrue(mineCount == Buscaminas.CANTIDAD_MINAS_PRINCIPANTE);
		
		setUpBuscaminasGenerarMinasPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] otracasillas = buscaminas.darCasillas();
		
		assertTrue(casillas != otracasillas);

	}
		
	@Test
	public void testGenerarMinasIntermedio() {
		setUpBuscaminasGenerarMinasIntermedio();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		
		int mineCount = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(casillas[i][j] != null) {
					if(casillas[i][j].esMina()) {
						mineCount++;
					}
				}
			}
		}
		assertTrue(mineCount == Buscaminas.CANTIDAD_MINAS_INTERMEDIO);
		
		setUpBuscaminasGenerarMinasPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] otracasillas = buscaminas.darCasillas();
		
		assertTrue(casillas != otracasillas);

	}
	
	@Test
	public void testGenerarMinasExperto() {
		setUpBuscaminasGenerarMinasExperto();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		
		int mineCount = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(casillas[i][j] != null) {
					if(casillas[i][j].esMina()) {
						mineCount++;
					}
				}
			}
		}
		assertTrue(mineCount == Buscaminas.CANTIDAD_MINAS_EXPERTO);
		
		setUpBuscaminasGenerarMinasPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] otracasillas = buscaminas.darCasillas();
		
		assertTrue(casillas != otracasillas);

	}
	
	@Test
	public void testInicializarCasillasLibresPrincipiante() {
		setUpBuscaminasInicializarCasillasLibresPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darValor() == 0);
			}
		}
	}
	
	@Test
	public void testInicializarCasillasLibresIntermedio() {
		setUpBuscaminasInicializarCasillasLibresIntermedio();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darValor() == 0);
			}
		}
	}
	
	@Test
	public void testInicializarCasillasLibresExperto() {
		setUpBuscaminasInicializarCasillasLibresExperto();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darValor() == 0);
			}
		}
	}
	
	@Test
	public void testBuscaminasPrincipiante() {
		setUpBuscaminasPrincipiante();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_PRINCIPIANTE);
		assertTrue(columns == Buscaminas.COLUMNAS_PRINCIPIANTE);
		int minesQuantity = buscaminas.getCantidadMinas();
		assertTrue(minesQuantity == Buscaminas.CANTIDAD_MINAS_PRINCIPANTE);	
		
		int freeBoxCount = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(!casillas[i][j].esMina()) 
					freeBoxCount++;
			}
		}
		
		assertTrue(freeBoxCount == (rows * columns - minesQuantity));
	}

	@Test
	public void testBuscaminasIntermedio() {
		setUpBuscaminasIntermedio();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_INTERMEDIO);
		assertTrue(columns == Buscaminas.COLUMNAS_INTERMEDIO);
		int minesQuantity = buscaminas.getCantidadMinas();
		assertTrue(minesQuantity == Buscaminas.CANTIDAD_MINAS_INTERMEDIO);	
		
		int freeBoxCount = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(!casillas[i][j].esMina()) 
					freeBoxCount++;
			}
		}
		
		assertTrue(freeBoxCount == (rows * columns - minesQuantity));
	}
	
	@Test
	public void testBuscaminasExperto() {
		setUpBuscaminasExperto();
		assertNotNull(buscaminas.darCasillas());
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		assertTrue(rows == Buscaminas.FILAS_EXPERTO);
		assertTrue(columns == Buscaminas.COLUMNAS_EXPERTO);
		int minesQuantity = buscaminas.getCantidadMinas();
		assertTrue(minesQuantity == Buscaminas.CANTIDAD_MINAS_EXPERTO);	
	
		int freeBoxCount = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(!casillas[i][j].esMina()) 
					freeBoxCount++;
			}
		}
		
		assertTrue(freeBoxCount == (rows * columns - minesQuantity));
	}
	
	@Test
	public void testResolverPrincipiante() {
		setUpBuscaminasPrincipiante();
		buscaminas.resolver();
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darSeleccionada());
			}
		}
		
	}
	
	@Test
	public void testResolverIntermedio() {
		setUpBuscaminasIntermedio();
		buscaminas.resolver();
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darSeleccionada());
			}
		}
		
	}
	
	@Test
	public void testResolverExperto() {
		setUpBuscaminasExperto();
		buscaminas.resolver();
		Casilla[][] casillas = buscaminas.darCasillas();
		int rows = casillas.length;
		int columns = casillas[0].length;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				assertTrue(casillas[i][j].darSeleccionada());
			}
		}
		
	}
	
	@Test
	public void testMostrarTableroPrincipiante() {
		setUpBuscaminasPrincipiante();
		String board1 = buscaminas.mostrarTablero();
		setUpBuscaminasPrincipiante();
		String board2 = buscaminas.mostrarTablero();
		assertTrue(board1.equals(board2));
	}
	
	@Test
	public void testMostrarTableroIntermedio() {
		setUpBuscaminasIntermedio();
		String board1 = buscaminas.mostrarTablero();
		setUpBuscaminasIntermedio();
		String board2 = buscaminas.mostrarTablero();
		assertTrue(board1.equals(board2));
	}
	
	@Test
	public void testMostrarTableroExperto() {
		setUpBuscaminasExperto();
		String board1 = buscaminas.mostrarTablero();
		setUpBuscaminasExperto();
		String board2 = buscaminas.mostrarTablero();
		assertTrue(board1.equals(board2));
	}
	
}
