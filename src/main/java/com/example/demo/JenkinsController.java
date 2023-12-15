package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins")
public class JenkinsController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTestString() {
		return "Hello World";
	}
	

}