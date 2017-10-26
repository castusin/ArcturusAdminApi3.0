package com.validation;

import javax.servlet.http.HttpServletRequest;

import com.cis.CISConstants;
import com.cis.CISResults;



public class CommonCISValidation {
	
	public CISResults deletePatientValidation(String patientId,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		CISResults cisResult=new CISResults();
		
		cisResult.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		String headerAuthorization=request.getHeader(CISConstants.HEADERS_AUTHROIZATION);
	        
		//Validate Headers AUTHROIZATION
	    if(headerAuthorization.equals(CISConstants.HEADERS_AUTHROIZATION_VAUE))
	    {
	    	cisResult.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	    }else
	    {
	    	cisResult.setResponseCode(CISConstants.RESPONSE_FAILURE);
	    }
	  
		 cisResult.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		 return cisResult;
	}



}
