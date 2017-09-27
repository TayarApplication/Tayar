package com.tyar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	
	@RequestMapping(value = "/")
	public String welcome(){
		return "*************WELCOME TO TYAR APPLICATION***************";
	}
	

}
