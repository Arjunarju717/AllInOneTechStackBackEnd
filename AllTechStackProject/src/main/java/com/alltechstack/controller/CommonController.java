package com.alltechstack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Arjun !!";
	}

}
