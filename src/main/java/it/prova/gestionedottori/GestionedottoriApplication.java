package it.prova.gestionedottori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.gestionedottori.model.Dottore;
import it.prova.gestionedottori.repository.DottoreRepository;

@SpringBootApplication
public class GestionedottoriApplication implements CommandLineRunner  {

	@Autowired
	private DottoreRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionedottoriApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Dottore("paolo", "rossi", "CJSH89", true, false));
		repository.save(new Dottore("paolo2", "rossi2", "2CJSH89", true, false));
		repository.save(new Dottore("Carlo", "rossi", "FDDG67", false, false));
	}

}
