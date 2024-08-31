package com.proyectoclub.app.controlerweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SobreNosotrosWeb {

	@GetMapping("/verSobreNosotros")
	public String verSobreNosotros() {
		return "verSobreNosotros";
	}
}
