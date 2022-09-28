package com.github.sanchezih.calculadora.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cientifica")
public class CalculadoraCientificaController {
	
	public CalculadoraCientificaController() {
	}
	
	@RequestMapping(value = "/cuadrado", method = RequestMethod.GET, params = { "operando1" })
	public Integer cuadrado(@RequestParam("operando1") Integer operando1) {
		return operando1 * operando1 ;
	}
	
	@RequestMapping(value = "/factorial", method = RequestMethod.GET, params = { "operando1" })
	public Integer factorial(@RequestParam("operando1") Integer operando1) {
		Integer resultado=1;
		for(int i=1;i <= operando1; i++){
			resultado=resultado*i;
		}
		return resultado ;
	}
	@RequestMapping(value = "/primo", method = RequestMethod.GET, params = { "operando1" })
	public boolean isPrimo(@RequestParam("operando1") Integer operando1) {
		boolean resultado=false;
		float valor=(float)operando1;
		if((valor/2) == (Math.round(valor/2))){
			resultado=true;
		}else {
			if((valor/3) == (Math.round(valor/3))){
				resultado=true;
			}
		}
		
		
		return resultado  ;
	}
	

}
