package com.dw2a.EntregaP2_MiguelNegron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	
public class ControladorHola {

	@RequestMapping("/hola")
	public String hola(Model modelo) {
		
		modelo.addAttribute("saludo", "Saludo de java");
		
		return "hola";
	}
	
}
