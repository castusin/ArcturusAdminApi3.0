package com.digitalhealthcare;

import org.apache.log4j.Logger;

import com.cis.CISResults;

public class GetFamilymemberDetailsWebservice {
	
	static Logger logger = Logger.getLogger(GetFamilymemberDetailsWebservice.class);
	GetFamilymemberDetailsBL detailsBL=new GetFamilymemberDetailsBL();
	
	public CISResults getFamilyMember(String memberId) {
		
		 CISResults cisResult = detailsBL.getFamilyMember(memberId);
		 logger.info(" DigitalHealthCare:FamilyMember Details webservice :"+cisResult);
		return cisResult;
	}
	

}
