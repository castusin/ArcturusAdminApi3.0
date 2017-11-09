package com.digitalhealthcare;

import org.apache.log4j.Logger;

import com.cis.CISResults;

public class DeleteDeviceWebservice {

	
		static Logger logger = Logger.getLogger(DeletePatientWebservice.class);
		DeleteDeviceBL deleteDeviceBL=new DeleteDeviceBL();
			public CISResults deleteDevice(String patientId){
			 CISResults cisResult = deleteDeviceBL.deleteDevice(patientId);
			 logger.info(" DigitalHealthCare: delete device WebService :"+cisResult);
			return cisResult;
		}
		
		
}
