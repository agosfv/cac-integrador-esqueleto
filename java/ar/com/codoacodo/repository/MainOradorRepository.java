package ar.com.codoacodo.repository;

import java.time.LocalDate;

import ar.com.codoacodo.entity.Orador;

public class MainOradorRepository {

	 public static void main(String[] args) {
		
		 OradorRepository repository = new MySqlOradorRepository();
		 
		 repository.save(new Orador("juan", "perez", "jua@mail.com", "php", LocalDate.now()));
		 
		 Orador carlos =repository.getById(3L);
		 
		 carlos.setApellido("perez");
		 carlos.setNombre("martin");
		 carlos.setTema("c#");
		 
		 repository.update(carlos);
		 
		 System.out.println(repository.findAll());
		 
	}
}