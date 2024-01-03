package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@Mapping("/")
	public String greet() {
		return "Hello world";
	}

}
