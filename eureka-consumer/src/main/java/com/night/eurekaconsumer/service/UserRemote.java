package com.night.eurekaconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer")
public interface UserRemote {

	@RequestMapping("/home")
    public String home(@RequestParam(value = "name", defaultValue = "Producer-Eins") String name);
	
}
