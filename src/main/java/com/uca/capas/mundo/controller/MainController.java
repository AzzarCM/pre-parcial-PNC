package com.uca.capas.mundo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.mundo.domain.Contribuyente;
import com.uca.capas.mundo.domain.Importancia;
import com.uca.capas.mundo.service.contribuyenteService;
import com.uca.capas.mundo.service.importanciaService;
@Controller
public class MainController {
	
	@Autowired
    private contribuyenteService contService;
	@Autowired
	private importanciaService impService;
	
	
	@RequestMapping("/inicio")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		List<Importancia> importancia = null;
		   try {
			   importancia = impService.allImportancias();
	        }catch (Exception e){
	            e.printStackTrace();
	        }
		   mav.addObject("importancias", importancia);
		   mav.addObject("contribuyente", new Contribuyente());	
		   mav.setViewName("index");
		return mav;
		
	}
	
}
