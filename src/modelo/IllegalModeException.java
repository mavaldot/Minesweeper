package modelo;

public class IllegalModeException extends Exception {

	public IllegalModeException() {
		super();
	}
	
	public IllegalModeException(String message) {
		super("ERROR. Usted ha introducido un valor ilegal de modo de juego. \n" + message);
	}
	
	public IllegalModeException(Throwable cause) {
		super(cause);
	}
	
	public IllegalModeException(String message, Throwable cause) {
		super("ERROR. Usted ha introducido un valor ilegal de modo de juego. \n" + message, cause);
	}
	
}
