package com.digitalhealthcare;

import org.apache.log4j.Logger;

import com.cis.CISResults;


public class DeletePatientWebservice {

	static Logger logger = Logger.getLogger(DeletePatientWebservice.class);
	DeletePatientBL deletePatientBL=new DeletePatientBL();
		public CISResults deletePatient(String patientId){
		 CISResults cisResult = deletePatientBL.deletePatient(patientId);
		 logger.info(" DigitalHealthCare: delete patient WebService :"+cisResult);
		return cisResult;
	}
	
	
	
}
