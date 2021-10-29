package com.example.demo.ReView;

public class ReViewDto {
	private int reviewSeq;
	private String object;
	private String writer;
	private String reviewContent;
	private String evalScore;
	
	public ReViewDto(int reviewSeq, String object, String writer, String reviewContent, String evalScore) {
		this.reviewSeq = reviewSeq;
		this.object = object;
		this.writer = writer;
		this.reviewContent = reviewContent;
		this.evalScore = evalScore;
	}
	
	public ReViewDto() {}

	public int getReviewSeq() {
		return reviewSeq;
	}

	public void setReviewSeq(int reviewSeq) {
		this.reviewSeq = reviewSeq;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getEvalScore() {
		return evalScore;
	}

	public void setEvalScore(String evalScore) {
		this.evalScore = evalScore;
	}
	
	

}
