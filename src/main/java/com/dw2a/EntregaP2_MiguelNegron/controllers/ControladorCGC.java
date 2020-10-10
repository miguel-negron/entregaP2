package com.dw2a.EntregaP2_MiguelNegron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorCGC {

	@RequestMapping("CGC")
	public String CGC() {
		return "CGC";
	}

	@RequestMapping(value = "CGC", method = RequestMethod.POST)
	public String CGCresultados(Model modelo, @RequestParam int edad, @RequestParam double altura,
			@RequestParam double peso, @RequestParam String sexo) {
		double imc = 0;
		double igc = 0;
		  
		
		imc = peso / altura * altura;
		
		if (sexo.equals("m")) {
			igc = 1.2 * imc + 0.23 * edad - 10.8 * 1 - 5.4;
		} else {
			igc = 1.2 * imc + 0.23 * edad - 10.8 * 0 - 5.4;
		}
		
		modelo.addAttribute("gc", igc);
		
		return "CGC";
	}
}
