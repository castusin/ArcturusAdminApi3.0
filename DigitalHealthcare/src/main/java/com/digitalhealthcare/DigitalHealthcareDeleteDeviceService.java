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
public class DigitalHealthcareDeleteDeviceService {
	
	
@RequestMapping(value="/deleteDevice",method=RequestMethod.GET,produces={"application/json"})
	
	public String deletePatient(@RequestParam ("patientId") String patientId,HttpServletRequest request){
		
		Logger logger = Logger.getLogger(DigitalHealthcareDeleteDeviceService.class);
		CommonCISValidation CommonCISValidation=new CommonCISValidation();
	    CISResults cisResults=CommonCISValidation.deleteDeviceValidation(patientId,request);
		 if(cisResults.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS))
		
		{
			 DeleteDeviceWebservice deleteDeviceWebservice= new DeleteDeviceWebservice();
	    	cisResults  = deleteDeviceWebservice.deleteDevice(patientId);
	        logger.info(" DigitalHealthCare: delete device rest service :"+cisResults);
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
