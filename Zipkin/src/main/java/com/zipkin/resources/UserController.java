package com.zipkin.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zipkin")
public class UserController {
	

	@Autowired
	FeignClient feignClient;
	
	@GetMapping("/getall")
	public String zip() 
	{
		return "Zipkin Server";
	}

	
	@GetMapping("/getall1")
	public String zip1() 
	{
		return "Zipkin Server1";
	}
	
	@GetMapping("/getfromzipkinclient")
	public String get()
	{
		return feignClient.getfeign();
	}
	}
