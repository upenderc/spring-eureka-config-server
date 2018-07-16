package com.uppi.poc.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class SpringEurekaConfigServerApplication {
	

	
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaConfigServerApplication.class, args);
	}
	
	
}
