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
public class DigitalHealthcareGetProfilesService {
	
	
	@RequestMapping(value="/getPatientProfiles",method=RequestMethod.GET,produces={"application/json"})
	
	 public String getProfiles(HttpServletRequest request,GetProfilesModel profileDetails){
		 Logger logger = Logger.getLogger(DigitalHealthcareGetProfilesService.class);
		 
		 
		 CommonCISValidation CommonCISValidation=new CommonCISValidation();
		    CISResults cisResults=CommonCISValidation.adminGetProfilesValidation(request,profileDetails);
		    if(cisResults.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS))
		     {
		    	GetProfilesWebservice profilesWebService= new GetProfilesWebservice();
		       cisResults  = profilesWebService.profileDetails(profileDetails);
		       logger.info(" DigitalHealthCare: view message service :"+cisResults);
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
