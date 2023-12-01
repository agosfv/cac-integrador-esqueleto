package ar.com.codoacodo.entity;

import java.time.LocalDate;

public class MainOradores {

	public static void main(String[] args) {
Oradores nuevoOradores = new Oradores("agostina", "fernandez", "agos@email.com", "JAVA", LocalDate.now()); 
		
		
		System.out.println(nuevoOradores);
	}

}

