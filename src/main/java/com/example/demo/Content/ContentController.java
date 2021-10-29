package com.example.demo.Content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	ContentService contentservice;
	
	@GetMapping("/agency")
	public List<AgencyDto> getAllAgency() {
		return contentservice.getAllAgency();
	}
	
	@GetMapping("/evaluation")
	public List<EvaluationDto> getAllEvaluation() {
		return contentservice.getAllEvaluation();
	}
	
	@GetMapping("/subject")
	public List<SubjectDto> getAllSubject() {
		return contentservice.getAllSubject();
	}

}
