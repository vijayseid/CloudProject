package com.eureka.server.service.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eureka.server.model.CustomerDetails;
import com.eureka.server.model.repo.CustomerDetailsRepo;
import com.eureka.server.model.service.DTO.CustomerDetailsDTO;
import com.eureka.server.model.service.DTO.ResultDTO;

@RestController
@RequestMapping("/users")
public class Client2Controller {

	@Autowired
	FeignClientController feignClientController;

	@Autowired
	CustomerDetailsRepo customerDetailsRepo;

	@GetMapping("/getallfromclient2")
	public ResultDTO get()

	{
		List<CustomerDetails> in = customerDetailsRepo.findAll();
		List<CustomerDetailsDTO> OUT = feignClientController.findAll();
		ResultDTO dto = new ResultDTO();
		dto.setIn(in);
		dto.setOut(OUT);
		return dto;
	}

}


//java -Dserver.port={port} -jar {filename}