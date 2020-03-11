package com.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableFeignClients
@EnableZipkinServer
@EnableEurekaClient
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
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
