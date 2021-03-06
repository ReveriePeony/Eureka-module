package com.night.eurekaproducereins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProducerEinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerEinsApplication.class, args);
	}
}
