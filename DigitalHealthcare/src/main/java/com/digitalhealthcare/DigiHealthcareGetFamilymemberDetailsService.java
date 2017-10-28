package com.digitalhealthcare;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cis.CISConstants;
import com.cis.CISResults;
import com.google.gson.Gson;
import com.validation.CommonCISValidation;


@RestController
public class DigiHealthcareGetFamilymemberDetailsService {

	
	
	
	@RequestMapping(value="/getFamilyMember",method=RequestMethod.GET,produces={"application/json"})

	 public String getFamilyMember(@RequestParam ("memberId") String memberId,HttpServletRequest request){
		 Logger logger = Logger.getLogger(DigiHealthcareGetFamilymemberDetailsService.class);
		 
		 String  getFamilymemberServiceParameters = "memberId=" +memberId ;
		 logger.info(" DigitalHealthCare: getFamilyMember Service : " +getFamilymemberServiceParameters);
		 CommonCISValidation CommonCISValidation=new CommonCISValidation();
		 CISResults cisResults=CommonCISValidation.adminGetFamilyMemberValidation(memberId,request);
		 if(cisResults.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS))
		  {
			 GetFamilymemberDetailsWebservice detailsWebService= new GetFamilymemberDetailsWebservice();
		    cisResults  = detailsWebService.getFamilyMember(memberId);
		    logger.info(" DigitalHealthCare:Member Details :"+cisResults);
		  }
		  return returnJsonData(cisResults);
	 }
	 	 
	 private String returnJsonData(Object src){
			// TODO Auto-generated method stub
	        Gson gson = new Gson();
			String feeds = gson.toJson(src);
			return feeds;
		 
		 
		 
	}
}
