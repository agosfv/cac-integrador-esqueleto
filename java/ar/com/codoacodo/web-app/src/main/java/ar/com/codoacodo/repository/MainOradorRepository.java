package ar.com.codoacodo.repository;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 repository.save(new Orador("pablo", "martinez", "martinezp@mail.com", "css", LocalDate.now()));
		 
		 Orador ramiro =repository.getById(17L);
		 
		 ramiro.setApellido("bastida");
		 ramiro.setNombre("marcos");
		 ramiro.setTema("phyton");
		 
		 repository.update(ramiro);
		 
		 System.out.println(repository.findAll());
		 
	}
}