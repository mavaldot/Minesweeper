package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscaminasTest {

	Buscaminas buscaminas;
	
	void loadScene1() {
		buscaminas = new Buscaminas(Buscaminas.PRINCIPIANTE);
	}
	
	void loadScene2() {
		buscaminas = new Buscaminas(Buscaminas.INTERMEDIO);
	}
	
	void loadScene3() {
		buscaminas = new Buscaminas(Buscaminas.EXPERTO);
	}
	
	@Test
	void test1() {
		loadScene1();
		assertNotNull(buscaminas.darCasillas());
		fail("Not yet implemented");
	}

	@Test
	void test2() {
		loadScene2();
		assertNotNull(buscaminas.darCasillas());
		fail("test 2");
	}
	
	@Test
	void test3() {
		loadScene3();
		assertNotNull(buscaminas.darCasillas());
		fail("test 2");
	}
}
