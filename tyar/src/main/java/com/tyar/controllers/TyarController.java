package com.tyar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tyar.entity.Tyar;
import com.tyar.services.TyarService;

@RestController
public class TyarController {
	
	@Autowired
	TyarService tyarService;
	
	@RequestMapping(value = "/getAll" , method = RequestMethod.GET)
	public Iterable<Tyar> getAllTyar(){		
		return tyarService.getAllTyar();
	}	


}
