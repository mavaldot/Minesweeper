package modelo;

public class IllegalBoxValueException extends Exception {

	public IllegalBoxValueException() {
		super();
	}
	
	public IllegalBoxValueException(String message) {
		super("ERROR. Usted ha introducido un valor ilegal de casilla. \n" + message);
	}
	
	public IllegalBoxValueException(Throwable cause) {
		super(cause);
	}
	
	public IllegalBoxValueException(String message, Throwable cause) {
		super("ERROR. Usted ha introducido un valor ilegal de casilla. \n" + message, cause);
	}
	
}
