package com.example.demo.Dao;

public class TeacherDto {
	private int teacherSeq;
	private String agency;
	
	public TeacherDto(int teacherSeq, String agency) {
		this.teacherSeq = teacherSeq;
		this.agency = agency;
	}
	
	public TeacherDto() {}

	public int getTeacherSeq() {
		return teacherSeq;
	}

	public void setTeacherSeq(int teacherSeq) {
		this.teacherSeq = teacherSeq;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	
	

}
