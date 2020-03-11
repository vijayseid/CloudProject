package com.zipkin.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class UserController {
	

	
	@GetMapping("/getall")
	public String zip() 
	{
		return "Zipkin Server";
	}

	
	@GetMapping("/getall1")
	public String zip1() 
	{
		return "From Inner Microservices";
	}
}
