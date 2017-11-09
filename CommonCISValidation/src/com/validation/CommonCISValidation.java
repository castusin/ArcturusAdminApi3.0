package com.validation;

import javax.servlet.http.HttpServletRequest;

import com.cis.CISConstants;
import com.cis.CISResults;
import com.digitalhealthcare.GetProfilesModel;



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

	public CISResults adminGetFamilyMemberValidation(String memberId,
			HttpServletRequest request) {
		
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

	public CISResults deletedeleteCareTaker(String patientId,
			String careTakerId, String phoneNumber, HttpServletRequest request) {
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

	public CISResults adminGetProfilesValidation(HttpServletRequest request,
			GetProfilesModel profileDetails) {
		
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

	public CISResults deleteDeviceValidation(String patientId,
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
