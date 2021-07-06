package flock.challenge.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import flock.challenge.provincias.consumingrest.DataArg;

@SpringBootApplication
public class FlockRestApplication {

	private static final Logger log = LoggerFactory.getLogger(FlockRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FlockRestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			DataArg dataArg = restTemplate.getForObject(
					"https://apis.datos.gob.ar/georef/api/provincias", DataArg.class);
			DataArg.instance = dataArg;
			log.info("#### levanta las provincias #####");
			log.info(dataArg.toString());
			log.info("#### fin busqueda provincias ####");
		};
	}
	


}
