package com.zipkin.resources;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.cloud.netflix.feign.FeignClient(name="zipkin-client")
public interface FeignClient {
	
	@GetMapping(path="/zipkin/getall1")
	String getfeign();

}
