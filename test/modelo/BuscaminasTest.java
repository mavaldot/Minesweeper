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
	
	private void setUpCustomScene() {
		try {
			buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE, 1);
		} catch (IllegalModeException illegalmexception) {
			fail("FAIL por IllegalModeException.");
		}	
		
		try {
			
			buscaminas.createCasilla(1, 1, Casilla.MINA);
			buscaminas.createCasilla(2, 1, Casilla.MINA);
			buscaminas.createCasilla(5, 3, Casilla.MINA);
			buscaminas.createCasilla(6, 6, Casilla.MINA);
			buscaminas.createCasilla(5, 1, Casilla.MINA);
			buscaminas.createCasilla(7, 1, Casilla.MINA);
			buscaminas.createCasilla(0, 5, Casilla.MINA);
			buscaminas.createCasilla(6, 2, Casilla.MINA);
			buscaminas.createCasilla(0, 7, Casilla.MINA);
			buscaminas.createCasilla(4, 2, Casilla.MINA);
			
		} catch (IllegalBoxValueException ibve) {
			fail("FAIL por IllegalBoxValueException");
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
	
	@Test
	public void testCreateCasilla() {
		setUpBuscaminasInicializarPartidaPrincipiante();
		
		try {
			buscaminas.createCasilla(1, 1, Casilla.MINA);
			buscaminas.createCasilla(0, 1, Casilla.MINA);
			buscaminas.createCasilla(2, 2, Casilla.MINA);
			buscaminas.createCasilla(6, 3, Casilla.MINA);
			buscaminas.createCasilla(4, 1, Casilla.MINA);
			
		} catch (IllegalBoxValueException ibve) {
			fail("FAIL por IllegalBoxValueException");
		}
		
		Casilla[][] casillas = buscaminas.darCasillas();
		assertTrue(casillas[1][1].esMina());
		assertTrue(casillas[0][1].esMina());
		assertTrue(casillas[2][2].esMina());
		assertTrue(casillas[6][3].esMina());
		assertTrue(casillas[4][1].esMina());
	}
	
	@Test
	public void testInicializarCasillasLibresCustomScene() {
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		Casilla[][] casillas = buscaminas.darCasillas();
		assertTrue(casillas[0][1].darValor() == 1);
		assertTrue(casillas[1][2].darValor() == 2);
		assertTrue(casillas[5][2].darValor() == 4);
		assertTrue(casillas[1][1].darValor() == -1);
		assertTrue(casillas[0][6].darValor() == 2);
		assertTrue(casillas[2][2].darValor() == 2);
		assertTrue(casillas[7][4].darValor() == 0);
		assertTrue(casillas[1][3].darValor() == 0);
	}
	
	@Test
	public void testCantidadMinasAlrededor() {
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(buscaminas.cantidadMinasAlrededor(0, 1) == 1);
		assertTrue(buscaminas.cantidadMinasAlrededor(5, 2) == 4);
		assertTrue(buscaminas.cantidadMinasAlrededor(2, 2) == 2);
		assertTrue(buscaminas.cantidadMinasAlrededor(1000, 1000) == 0);
		assertTrue(buscaminas.cantidadMinasAlrededor(50, 50) == 0);
		assertTrue(buscaminas.cantidadMinasAlrededor(6, 7) == 1);
		assertTrue(buscaminas.cantidadMinasAlrededor(0, 0) == 1);
		
	}
	
	@Test
	public void testCheckMineCustomScene() {
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(buscaminas.checkMine(1, 1) == 1);
		assertTrue(buscaminas.checkMine(2, 1) == 1);
		assertTrue(buscaminas.checkMine(5, 3) == 1);
		assertTrue(buscaminas.checkMine(6, 6) == 1);
		assertTrue(buscaminas.checkMine(5, 1) == 1);
		assertTrue(buscaminas.checkMine(7, 1) == 1);
		assertTrue(buscaminas.checkMine(0, 5) == 1);
		assertTrue(buscaminas.checkMine(0, 7) == 1);
		assertTrue(buscaminas.checkMine(6, 2) == 1);
		assertTrue(buscaminas.checkMine(4, 2) == 1);
		
		assertTrue(buscaminas.checkMine(7, 7) == 0);
		assertTrue(buscaminas.checkMine(10, 10) == 0);
		assertTrue(buscaminas.checkMine(1000, 1000) == 0);
		assertTrue(buscaminas.checkMine(0, 0) == 0);
		assertTrue(buscaminas.checkMine(2, 2) == 0);
		assertTrue(buscaminas.checkMine(3, 3) == 0);
		
	}
	
	@Test
	public void testAbrirCasilla() {
		setUpBuscaminasExperto();
		int rows = Buscaminas.FILAS_EXPERTO;
		int columns = Buscaminas.COLUMNAS_EXPERTO;
		for(int i = rows/2; i < rows; i++) {
			for(int j = columns/2; j < columns; j++) {
				assertTrue(buscaminas.abrirCasilla(i, j));
			}
		}
		
		Casilla[][] casillas = buscaminas.darCasillas();
		
		for(int i = 0; i < rows/2; i++) {
			for(int j = 0; j < columns/2; j++) {
				assertTrue(!casillas[i][j].darSeleccionada());
			}
		}
		
		for(int i = rows/2; i < rows; i++) {
			for(int j = columns/2; j < columns; j++) {
				assertTrue(casillas[i][j].darSeleccionada());
			}
		}
		
	}
	
	@Test
	public void testDarPerdio() {
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(1, 1);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(2, 1);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(5, 3);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(6, 6);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(5, 1);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(7, 1);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(0, 5);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(0, 7);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(6, 2);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(4, 2);
		assertTrue(buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(0, 0);
		assertTrue(!buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(7, 7);
		assertTrue(!buscaminas.darPerdio());
		
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.darPerdio());
		buscaminas.abrirCasilla(6, 7);
		assertTrue(!buscaminas.darPerdio());
	}
	
	@Test
	public void testDarPista() {
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		buscaminas.darPista();
		Casilla[][] casillas = buscaminas.darCasillas();
		assertTrue(casillas[0][0].darSeleccionada());
		assertTrue(casillas[0][1].darSeleccionada());
		assertTrue(casillas[0][2].darSeleccionada());
		assertTrue(!casillas[0][3].darSeleccionada());
		assertTrue(casillas[0][4].darSeleccionada());
		assertTrue(!casillas[0][5].darSeleccionada());
		assertTrue(!casillas[1][1].darSeleccionada());
		assertTrue(casillas[1][2].darSeleccionada());
		assertTrue(!casillas[7][7].darSeleccionada());
	}
	
	@Test
	public void testGano() {
		setUpCustomScene();
		buscaminas.inicializarCasillasLibres();
		assertTrue(!buscaminas.gano());
		int rows = Buscaminas.FILAS_PRINCIPIANTE;
		int columns = Buscaminas.COLUMNAS_PRINCIPIANTE;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(buscaminas.checkMine(i,j) == 0) {
					buscaminas.abrirCasilla(i, j);
				}
			}
		}
		assertTrue(buscaminas.gano());
	}
	
	
}
