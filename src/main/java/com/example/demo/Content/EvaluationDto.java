package com.example.demo.Content;

public class EvaluationDto {
	private int EvalSeq;
	private String EvalContent;
	
	public EvaluationDto(int evalSeq, String evalContent) {
		EvalSeq = evalSeq;
		EvalContent = evalContent;
	}
	
	public EvaluationDto() {}

	public int getEvalSeq() {
		return EvalSeq;
	}

	public void setEvalSeq(int evalSeq) {
		EvalSeq = evalSeq;
	}

	public String getEvalContent() {
		return EvalContent;
	}

	public void setEvalContent(String evalContent) {
		EvalContent = evalContent;
	}
	
	

}
