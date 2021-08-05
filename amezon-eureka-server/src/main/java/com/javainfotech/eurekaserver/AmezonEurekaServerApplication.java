package com.javainfotech.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AmezonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmezonEurekaServerApplication.class, args);
	}

}
