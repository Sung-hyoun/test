package com.example.demo.Content;

public class AgencyDto {
	private int agencySeq;
	private String agencyName;
	
	public AgencyDto(int agencySeq, String agencyName) {
		this.agencySeq = agencySeq;
		this.agencyName = agencyName;
	}
	
	public AgencyDto() {}

	public int getAgencySeq() {
		return agencySeq;
	}

	public void setAgencySeq(int agencySeq) {
		this.agencySeq = agencySeq;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	
	
	

}
