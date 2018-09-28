package com.raj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("raj/v1")
public class DockerController {
	
	@GetMapping("/test")
	public String test() {
		return "This is Docker Service";
	}

}
