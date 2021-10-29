package com.example.demo.Content;

public class SubjectDto {
	private String SubjectName;
	private String SubjectContent;
	
	public SubjectDto(String subjectName, String subjectContent) {
		SubjectName = subjectName;
		SubjectContent = subjectContent;
	}
	
	public SubjectDto() {}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	public String getSubjectContent() {
		return SubjectContent;
	}

	public void setSubjectContent(String subjectContent) {
		SubjectContent = subjectContent;
	}
	
	
	
	

}
