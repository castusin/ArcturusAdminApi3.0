package com.digitalhealthcare;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DigitalHealthcareUpdateDeviceService {
	
	public String updateProfile(HttpServletRequest request,@RequestBody UpdateDeviceModel deviceUpdate){	 
		 Logger logger = Logger.getLogger(DigitalHealthcareUpdateDeviceService.class);
		 
		 String requestParameters = "deviceToken=" + deviceUpdate.deviceToken + "&deviceType=" + deviceUpdate.deviceType + "&deviceId=" +           
				 deviceUpdate.deviceId;
			 logger.info("Digital HealthCare UpdateProfile Request Parameters :"+requestParameters);
			 
			 
			return requestParameters;
	


		 
		 
		
		 
		 
	}

}
