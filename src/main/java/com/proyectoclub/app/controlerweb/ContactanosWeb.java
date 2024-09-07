package com.proyectoclub.app.controlerweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactanosWeb {

	@GetMapping("/verContactanos")
	public String verContactanos() {
		return "verContactanos";
	}
}
