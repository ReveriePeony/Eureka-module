package com.night.eurekaeins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaEinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaEinsApplication.class, args);
	}
}
