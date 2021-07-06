package flock.challenge.login.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import flock.challenge.app.FlockRestApplication;

@RestController
public class LoginController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private final String nameLoginValidate = "test";
	private final String nameSpringValidate = "Spring";
	private static final Logger log = LoggerFactory.getLogger(FlockRestApplication.class);


	@GetMapping("/loging")
	public Login loging(@RequestParam(value = "name", defaultValue = "root") String name) {
		log.info(this.getClass().getName() + " - logging nombre:"+name);
		
		if (this.nameLoginValidate.equals(name) || nameSpringValidate.equals(name))
			return new Login(counter.incrementAndGet(), String.format(template, name));
		return null;
	}
}
