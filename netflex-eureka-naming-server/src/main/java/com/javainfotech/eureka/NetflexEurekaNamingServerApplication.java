package com.javainfotech.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflexEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflexEurekaNamingServerApplication.class, args);
	}

}
