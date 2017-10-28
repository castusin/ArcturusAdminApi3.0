package com.digitalhealthcare;

public class GetFamilymemberModel {
	
	
	public String memberId;
	
	public GetFamilymemberModel(String memberId) {
		super();
		
		this.memberId=memberId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	

}
