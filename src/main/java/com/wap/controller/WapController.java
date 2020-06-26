package com.wap.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WapController {

	Logger logger = LoggerFactory.getLogger(WapController.class);
	
	@RequestMapping(value={"/webhook"}, method = RequestMethod.POST)
	public ResponseEntity<String> webhook(@RequestBody String payload){
		
		logger.info("Recibido el webhook de whatsapp");
		logger.info("El valor del payload es: "+payload);
		
		return new ResponseEntity<>(HttpStatus.OK);		
	}
	
}
