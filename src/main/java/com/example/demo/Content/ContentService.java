package com.example.demo.Content;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
	
	@Autowired
	ContentDao contentDao;
	
	public List<AgencyDto> getAllAgency() {
		return contentDao.getAllAgency();
	}
	
	public List<EvaluationDto> getAllEvaluation() {
		return contentDao.getAllEvaluation();
	}
	
	public List<SubjectDto> getAllSubject() {
		return contentDao.getAllSubject();
	}

}
