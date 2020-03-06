package com.eureka.server.model.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eureka.server.model.service.DetailsService;
import com.eureka.server.model.service.DTO.DetailsDTO;
import com.eureka.server.model.servive.mapper.DetailsMapper;
import com.eureka.server.repo.DetailsRepo;

@Service
public class DetailsImpl implements DetailsService {

	@Autowired
	DetailsMapper detailsMapper;
	
	@Autowired
	DetailsRepo detailsRepo;
	
	@Override
	public List<DetailsDTO> getall() {
		
		return detailsMapper.toDto(detailsRepo.findAll());
	}

}
