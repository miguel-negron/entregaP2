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
		double gc = 0;
		double isVaron = sexo.equals("v") ? 1 : 0;
		int sector = 0;
		  
		
		
		imc = peso / (altura * altura);
		
		gc = 1.2 * imc + 0.23 * edad - 10.8 * isVaron - 5.4;
		
		if (sexo.equals("m")) {
			if (gc <= 13) {
				sector = 1;
			} else if (gc <= 20) {
				sector = 2;
			} else if (gc <= 24) {
				sector = 3;
			} else if (gc <= 31) {
				sector = 4;
			} else {
				sector = 5;
			}
		} else {
			if (gc <= 5) {
				sector = 1;
			} else if (gc <= 13) {
				sector = 2;
			} else if (gc <= 17) {
				sector = 3;
			} else if (gc <= 24) {
				sector = 4;
			} else {
				sector = 5;
			}
		}
		
		
		modelo.addAttribute("gc", String.format("%.2f", gc));
		modelo.addAttribute("edad", edad);
		modelo.addAttribute("altura", altura);
		modelo.addAttribute("peso", peso);
		modelo.addAttribute("sexo", sexo);
		modelo.addAttribute("sector", sector);
		
		return "CGC";
	}
}
