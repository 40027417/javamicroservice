package com.ltts.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicedemoApplication.class, args);
	}

}
