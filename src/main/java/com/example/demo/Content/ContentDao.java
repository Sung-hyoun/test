package com.example.demo.Content;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ContentDao {
	
	public static List<EvaluationDto> evals;
	public static List<SubjectDto> subjects;
	public static List<AgencyDto> agencys;
	
	static {
		evals = new ArrayList();
		
		evals.add(new EvaluationDto(1, "내용1"));
		evals.add(new EvaluationDto(2, "내용2"));
		evals.add(new EvaluationDto(3, "내용3"));
		evals.add(new EvaluationDto(4, "내용4"));
		evals.add(new EvaluationDto(5, "내용5"));
	}
	
	static {
		subjects = new ArrayList();
		
		subjects.add(new SubjectDto("과목 이름1", "과목내용1"));
		subjects.add(new SubjectDto("과목 이름2", "과목내용2"));
		subjects.add(new SubjectDto("과목 이름3", "과목내용3"));
		subjects.add(new SubjectDto("과목 이름4", "과목내용4"));
		subjects.add(new SubjectDto("과목 이름5", "과목내용5"));
	}
	
	static {
		agencys = new ArrayList();
		
		agencys.add(new AgencyDto(1, "소속 이름1"));
		agencys.add(new AgencyDto(2, "소속 이름2"));
		agencys.add(new AgencyDto(3, "소속 이름3"));
		agencys.add(new AgencyDto(4, "소속 이름4"));
		agencys.add(new AgencyDto(5, "소속 이름5"));
	}
	
	public List<EvaluationDto> getAllEvaluation() {
		return evals;
	}
	
	public List<SubjectDto> getAllSubject() {
		return subjects;
	}
	
	public List<AgencyDto> getAllAgency() {
		return agencys;
	}
}
