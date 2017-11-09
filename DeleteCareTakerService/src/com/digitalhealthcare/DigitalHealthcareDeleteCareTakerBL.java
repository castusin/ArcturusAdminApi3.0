
package com.digitalhealthcare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cis.CISResults;


public class DigitalHealthcareDeleteCareTakerBL {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	DigitalHealthcareDeleteCareTakerDAO deletePatientDAO=(DigitalHealthcareDeleteCareTakerDAO)ctx.getBean("DeleteCareTaker");

	public CISResults deleteCareTaker(String patientId,String careTakerId,String phoneNumber){
		
		CISResults cisResult = new CISResults();
		
		if(careTakerId.equals("")){
			
			cisResult = deletePatientDAO.deleteCareTaker(patientId,careTakerId,phoneNumber);
			
		}else{
			
			cisResult = deletePatientDAO.deleteCareTaker(patientId,careTakerId,phoneNumber);
			
			cisResult = deletePatientDAO.deleteCareTakerPhoneNumber(patientId,careTakerId,phoneNumber);
			
			
		}
		
		
		
		
		
		return cisResult;
	}
	
}
