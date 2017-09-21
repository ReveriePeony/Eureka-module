package com.night.eurekaconsumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.night.eurekaconsumer.service.UserRemote;

@RestController
public class UserController {
	
	@Autowired
	UserRemote userRemote;
	
	@RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return userRemote.home(name);
    }
	
}
