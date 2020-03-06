package com.eureka.server.model.service.DTO;

import java.util.List;

import com.eureka.server.model.CustomerDetails;

public class ResultDTO {
	private List<CustomerDetails> in;
	private List<CustomerDetailsDTO> out;

	public List<CustomerDetails> getIn() {
		return in;
	}

	public void setIn(List<CustomerDetails> in) {
		this.in = in;
	}

	public List<CustomerDetailsDTO> getOut() {
		return out;
	}

	public void setOut(List<CustomerDetailsDTO> out) {
		this.out = out;
	}

}
