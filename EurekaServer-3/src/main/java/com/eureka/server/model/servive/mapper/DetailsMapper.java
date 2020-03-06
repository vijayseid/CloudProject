package com.eureka.server.model.servive.mapper;

import org.mapstruct.Mapper;

import com.eureka.server.model.Details;
import com.eureka.server.model.service.DTO.DetailsDTO;
import com.eureka.server.model.service.utils.EntityMapper;

@Mapper(componentModel="spring" , uses= {})
public interface DetailsMapper extends EntityMapper<Details, DetailsDTO> {

	
	default Details fromId(Long id) 
	{
		if(id==0)
			return null;
		
		Details banks=new Details();
		banks.setId(id);
		return banks;
	}
}
