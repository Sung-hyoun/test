package com.example.demo.Dto;

public class UserDto {
	 private int userNo;
	    private String userName;
	    private String userId;
	    private String userPassword;
	 
	    public UserDto() {
	    }
	 
	    public UserDto(int userNo, String userName, String userId, String userPassword) {
	        this.userNo = userNo;
	        this.userName = userName;
	        this.userId = userId;
	        this.userPassword = userPassword;
	    }
	 
	    public int getUserNo() {
	        return userNo;
	    }
	 
	    public void setUserNo(int userNo) {
	        this.userNo = userNo;
	    }
	 
	    public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getUserId() {
	        return userId;
	    }
	 
	    public void setUserId(String userId) {
	        this.userId = userId;
	    }
	 
	    public String getUserPassword() {
	        return userPassword;
	    }
	 
	    public void setUserPassword(String userPassword) {
	        this.userPassword = userPassword;
	    }

}
