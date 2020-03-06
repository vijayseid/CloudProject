package com.eureka.server.service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.server.model.service.DetailsService;
import com.eureka.server.model.service.DTO.DetailsDTO;

@RestController
@RequestMapping("/api/eureka/client3")
public class DetailsController {

	
	@Autowired
	DetailsService detailsService;
	
	@GetMapping("/getall")
	public List<DetailsDTO> getall() 
	{
		return detailsService.getall();
	}
}
