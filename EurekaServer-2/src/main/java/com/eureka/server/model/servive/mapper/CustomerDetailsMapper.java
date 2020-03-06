package com.eureka.server.model.servive.mapper;

import org.mapstruct.Mapper;

import com.eureka.server.model.CustomerDetails;
import com.eureka.server.model.service.DTO.CustomerDetailsDTO;
import com.eureka.server.model.service.utils.EntityMapper;

@Mapper(componentModel="spring" , uses= {})
public interface CustomerDetailsMapper extends EntityMapper<CustomerDetails, CustomerDetailsDTO> {

	
	default CustomerDetails fromId(Long id) 
	{
		if(id==0)
			return null;
		
		CustomerDetails banks=new CustomerDetails();
		banks.setId(id);
		return banks;
	}
}
