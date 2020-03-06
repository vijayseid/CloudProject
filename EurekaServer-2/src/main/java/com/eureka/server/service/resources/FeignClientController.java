package com.eureka.server.service.resources;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.eureka.server.model.service.DTO.CustomerDetailsDTO;

@FeignClient(name="Eureka-Client3")
public interface FeignClientController {

	
	@GetMapping(path="/api/eureka/client3/getall")
	List<CustomerDetailsDTO> findAll();
}
