package com.tyar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyar.entity.Tyar;
import com.tyar.repository.TyarRepository;

@Service
public class TyarService {
	
	@Autowired
	TyarRepository tyarRepository;
	
	public Iterable<Tyar> getAllTyar(){
		return tyarRepository.findAll();
	}

}
