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
public class DigitalHealthcareDeletePatient {
	
	@RequestMapping(value="/deletePatient",method=RequestMethod.GET,produces={"application/json"})
	
	public String deletePatient(@RequestParam ("patientId") String patientId,HttpServletRequest request){
		
		Logger logger = Logger.getLogger(DigitalHealthcareDeletePatient.class);
		CommonCISValidation CommonCISValidation=new CommonCISValidation();
	    CISResults cisResults=CommonCISValidation.deletePatientValidation(patientId,request);
		 if(cisResults.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS))
		
		{
	    	DeletePatientWebservice deletePatientWebservice= new DeletePatientWebservice();
	    	cisResults  = deletePatientWebservice.deletePatient(patientId);
	        logger.info(" DigitalHealthCare: delete patient rest service :"+cisResults);
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
