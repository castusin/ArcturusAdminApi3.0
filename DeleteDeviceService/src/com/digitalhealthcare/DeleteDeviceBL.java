package com.digitalhealthcare;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cis.CISResults;

public class DeleteDeviceBL {

	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	DeleteDeviceDAO deleteDeviceDAO=(DeleteDeviceDAO)ctx.getBean("deleteUserDevice");

	public CISResults deleteDevice(String patientId){
		
		CISResults cisResult = deleteDeviceDAO.deleteDevice(patientId);
		
		return cisResult;
	}

}
