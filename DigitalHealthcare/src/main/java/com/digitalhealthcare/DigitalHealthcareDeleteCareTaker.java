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
public class DigitalHealthcareDeleteCareTaker {
	
	@RequestMapping(value="/deleteCareTaker",method=RequestMethod.GET,produces={"application/json"})
	
	public String deleteCareTaker(@RequestParam ("patientId") String patientId,@RequestParam ("careTakerId") String careTakerId,@RequestParam ("phoneNumber") String phoneNumber,HttpServletRequest request){
		
		Logger logger = Logger.getLogger(DigitalHealthcareDeleteCareTaker.class);
		CommonCISValidation CommonCISValidation=new CommonCISValidation();
	    CISResults cisResults=CommonCISValidation.deletedeleteCareTaker(patientId,careTakerId,phoneNumber,request);
		 if(cisResults.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS))
		
		{
			 DigitalHealthcareDeleteCareTakerWebservice deleteCareTakerWebservice= new DigitalHealthcareDeleteCareTakerWebservice();
	    	cisResults  = deleteCareTakerWebservice.deleteCareTaker(patientId,careTakerId,phoneNumber);
	        logger.info(" DigitalHealthCare: delete care taker rest service :"+cisResults);
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
