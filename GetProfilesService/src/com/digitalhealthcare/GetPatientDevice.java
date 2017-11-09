package com.digitalhealthcare;

public class GetPatientDevice {
	
public String patientId;

	
	
	public GetPatientDevice(String patientId) {
		super();
		
		this.patientId=patientId;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	

}
