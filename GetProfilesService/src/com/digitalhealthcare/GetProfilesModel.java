package com.digitalhealthcare;

public class GetProfilesModel {
	
	
	public String userId;
	public String firstName;
	public String lastName;
	public String emailId;
	public String phoneNumber;
	public String deviceType;
	public String deviceId;
	
	public GetProfilesModel(String userId,String firstName, String lastName,String emailId,String phoneNumber, String deviceType, String deviceId) {
		super();
		
		this.userId=userId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		this.phoneNumber=phoneNumber;
		this.deviceType=deviceType;
		this.deviceId=deviceId;
		
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public GetProfilesModel() {
		// TODO Auto-generated constructor stub
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

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
