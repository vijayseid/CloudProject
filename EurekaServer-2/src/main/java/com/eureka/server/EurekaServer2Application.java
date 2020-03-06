package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
public class EurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer2Application.class, args);
	}
	
	  @Configuration 
	  class configuraion {
	  
	  @LoadBalanced
	  
	  @Bean 
	  public RestTemplate restTemplate() 
	  { 
		  return new RestTemplate(); 
	  }
	  
	  }


}
