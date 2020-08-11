package cl.recoders.ejemplo.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Inicio {
	
	private Logger log = Logger.getLogger(Inicio.class);
	
	@GetMapping("/")
	public String inicio() {
		
		log.info("ingreso a Inicio");
		
		System.out.println("hola");
		return "inicio";
	}
	
	@GetMapping("/login")
	public String login() {
		
		log.info("ingreso a Login");
		
		return "login";
	}

}
