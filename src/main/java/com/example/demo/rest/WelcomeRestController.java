package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	@Autowired
	private GreetFeignClient greetFeignClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String greetResp = greetFeignClient.invokeGreetApi();
		return greetResp + ", w e l c o m e  T o  h y d e r a b a d ";
	}

}
