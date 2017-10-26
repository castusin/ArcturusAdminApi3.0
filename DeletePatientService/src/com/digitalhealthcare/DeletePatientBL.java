package com.digitalhealthcare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cis.CISResults;


public class DeletePatientBL {
	
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	DeletePatientDAO deletePatientDAO=(DeletePatientDAO)ctx.getBean("deletePatient");

	public CISResults deletePatient(String patientId){
		
		CISResults cisResult = deletePatientDAO.deletePatient(patientId);
		cisResult = deletePatientDAO.deleteUserDevicesPatient(patientId);
		cisResult = deletePatientDAO.deletePatientFm(patientId);
		cisResult = deletePatientDAO.deletePatientPhoneNumber(patientId);
		cisResult = deletePatientDAO.deletePatientAppointments(patientId);
		cisResult = deletePatientDAO.deletePatientMessages(patientId);
		
		return cisResult;
	}
	
}
