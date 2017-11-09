package com.digitalhealthcare;

import org.apache.log4j.Logger;

import com.cis.CISResults;


public class DigitalHealthcareDeleteCareTakerWebservice {

	static Logger logger = Logger.getLogger(DigitalHealthcareDeleteCareTakerWebservice.class);
	DigitalHealthcareDeleteCareTakerBL deletePatientBL=new DigitalHealthcareDeleteCareTakerBL();
		public CISResults deleteCareTaker(String patientId,String careTakerId,String phoneNumber){
		 CISResults cisResult = deletePatientBL.deleteCareTaker(patientId,careTakerId,phoneNumber);
		 logger.info(" DigitalHealthCare: delete caretaker WebService :"+cisResult);
		return cisResult;
	}
	
	
	
}
