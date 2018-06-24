package com.terminology.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class EurekaServerController {
	
	

	@GetMapping
	public void printHello(){
		System.out.println("Hello Client Service!");
	}
}
