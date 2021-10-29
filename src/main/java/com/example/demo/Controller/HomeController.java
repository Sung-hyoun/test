package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.TestService;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("")
	public String test() {
		return "root url call";
	}
	
	@GetMapping("/test")
	public Map<String, String> testMethod() {
		Map<String, String> res = this.testService.getTest();
		
		return res;
	}

}
