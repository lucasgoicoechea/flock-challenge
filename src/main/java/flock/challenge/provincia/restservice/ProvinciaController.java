package flock.challenge.provincia.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flock.challenge.app.FlockRestApplication;
import flock.challenge.provincias.consumingrest.DataArg;
import flock.challenge.provincias.consumingrest.Provincia;

@RestController
public class ProvinciaController {

	private static final Logger log = LoggerFactory.getLogger(FlockRestApplication.class);


	@GetMapping("/provincia")
	public Provincia provincia(@RequestParam(value = "name", defaultValue = "") String name) {
		return this.findByName(name);
	}
	
	public Provincia findByName(String name) {
		log.info(this.getClass().getName() + " - Busca provincia:"+name);
		for(Provincia prov : DataArg.instance.getProvincias())
		{
			if (prov.getNombre().equals(name)) {
				return prov;
			}
		}
		log.debug("NO ENCUENTRA PROVINCIA");
		return null;
	}
}
