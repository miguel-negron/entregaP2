package com.dw2a.EntregaP2_MiguelNegron.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorCGC {
	
	@RequestMapping("CGC")
	public String CGC() {
		return "CGC";
	}
}
