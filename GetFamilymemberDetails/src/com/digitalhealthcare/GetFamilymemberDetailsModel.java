package com.digitalhealthcare;

public class GetFamilymemberDetailsModel {
	
	public String userId;
	public String firstName;
	public String lastName;
	public String emailId;
	public String phoneNumber;
	
	public GetFamilymemberDetailsModel(String userId,String firstName, String lastName,String emailId,String phoneNumber) {
		super();
		
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.phoneNumber=phoneNumber;
		
		
		
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String i) {
		this.phoneNumber = i;
	}

	public GetFamilymemberDetailsModel(){
		
	}
}
