package com.night.eurekadrei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaDreiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDreiApplication.class, args);
	}
}
