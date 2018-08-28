package com.ctsi.springboot.tomcat.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	private static final Logger log = Logger.getLogger(HelloWorldController.class);
	
	@RequestMapping("/")
	String home() {
		log.info("## Welcome");
		return "Welcome You";
	}

}
