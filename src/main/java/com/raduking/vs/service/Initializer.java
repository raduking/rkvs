package com.raduking.vs.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Class that will perform initializations.
 * (example development specific or others)
 * 
 * @author Radu Sebastian LAZIN
 */
@Component
public class Initializer {

	@Autowired
	ProductService didService;
	
	@PostConstruct
	public void development() {
		// Generate some Products
		
	}
	
}
