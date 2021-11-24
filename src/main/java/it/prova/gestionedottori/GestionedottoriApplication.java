package it.prova.gestionedottori;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.prova.gestionedottori.model.Dottore;
import it.prova.gestionedottori.service.DottoreService;

@SpringBootApplication
public class GestionedottoriApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionedottoriApplication.class, args);
	}


	@Bean
	public CommandLineRunner initDottori(DottoreService service) {
		return (args) -> {
			
			service.save(new Dottore("paolo", "rossi", "CJSH89", true, false));
			service.save(new Dottore("paolo2", "rossi2", "2CJSH89", true, false));
			service.save(new Dottore("Carlo", "rossi", "FDDG67", false, false));
		};
	}
}
