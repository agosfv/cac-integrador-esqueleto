package ar.com.codoacodo.interfaces;

public class EmailLogger implements ILogger {


	@Override
	public void log() {
		System.out.println("Enviando mail a direccion@gmail.com");

	}

}
