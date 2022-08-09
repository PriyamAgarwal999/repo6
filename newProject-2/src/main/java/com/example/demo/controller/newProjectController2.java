package com.example.demo.controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class newProjectController2 {
	
	@PostMapping("option")
	public String getResponse(@RequestBody Response response){
//		return serviceLayer2.getResponse(response);
//		this.restTemplate.getForObject();
		return "hello";
	}

}
