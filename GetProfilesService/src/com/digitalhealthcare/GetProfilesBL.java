package com.digitalhealthcare;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cis.CISResults;

public class GetProfilesBL {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	GetProfilesDAO profileDetailsDAO=(GetProfilesDAO)ctx.getBean("getPatientProfiles");
	
	public CISResults getProfiles(GetProfilesModel profileDetails) {
		final Logger logger = Logger.getLogger(GetProfilesBL.class);
		
		String deviceType=profileDetails.getDeviceType();
		String deviceId=profileDetails.getDeviceId();
		CISResults cisResult =profileDetailsDAO.getProfiles(profileDetails.getUserId(),profileDetails.getFirstName(),profileDetails.getLastName(),profileDetails.getPhoneNumber(),profileDetails.getEmailId(),profileDetails.getDeviceType(),profileDetails.getDeviceId());
		
				
		//cisResult.setResultObject(resultObject);
		logger.info("DigitalHealthCare:ProfileDetailsBL  service" +cisResult );
		return cisResult;
	}
	
}
