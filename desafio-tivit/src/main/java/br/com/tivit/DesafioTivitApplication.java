package br.com.tivit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioTivitApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DesafioTivitApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesafioTivitApplication.class, args);
		
		log.info(">>>Serviço Iniciado<<<");	
	}

}
