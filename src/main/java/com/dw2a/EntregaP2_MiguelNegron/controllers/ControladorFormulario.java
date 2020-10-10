package com.dw2a.EntregaP2_MiguelNegron.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorFormulario {

	@RequestMapping("formulario")
	public String formulario(Model modelo) {

		return "formulario";
	}

	@RequestMapping(value = "formulario", method = RequestMethod.POST)
	public String datosFormulario(Model modelo, @RequestParam String nombre, @RequestParam String ape1,
			@RequestParam String ape2, @RequestParam String nacimiento, @RequestParam String sexo,
			@RequestParam String email, @RequestParam String pwd, @RequestParam String direccion,
			@RequestParam String estudios, @RequestParam List intereses) {

		modelo.addAttribute("nombre", nombre);
		modelo.addAttribute("ape1", ape1);
		modelo.addAttribute("ape2", ape2);
		modelo.addAttribute("nacimiento", nacimiento);
		modelo.addAttribute("email", email);
		modelo.addAttribute("sexo", sexo);
		modelo.addAttribute("pwd", pwd);
		modelo.addAttribute("direccion", direccion);
		modelo.addAttribute("estudios", estudios);
		modelo.addAttribute("intereses", intereses);

		return "datos_formulario";
	}
}
