package com.night.eurekaproducerzwei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProducerZweiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProducerZweiApplication.class, args);
	}
}
