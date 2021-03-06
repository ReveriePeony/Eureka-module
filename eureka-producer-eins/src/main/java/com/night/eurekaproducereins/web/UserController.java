package com.night.eurekaproducereins.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Value("${server.port}")
    String port;
	
    @RequestMapping("/home")
    public String home(@RequestParam(defaultValue = "Producer-Eins") String name) {
        return "hello "+name+",i am from port:" +port;
    }
    
}
