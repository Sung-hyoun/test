package com.example.demo.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public Map<String, String> getTest() {
		Map<String, String> res = new HashMap<>();
		res.put("test", "hihi");
		
		return res;
	}

}


