package com.digitalhealthcare;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cis.CISResults;

public class GetFamilymemberDetailsBL {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	GetFamilymemberDetailsDAO detailsDAO=(GetFamilymemberDetailsDAO)ctx.getBean("getFamilyMember");

	
	public CISResults getFamilyMember(String memberId) {
		final Logger logger = Logger.getLogger(GetFamilymemberDetailsBL.class);
		 
		CISResults cisResult = detailsDAO.getFamilyMember(memberId);
		
		GetFamilymemberDetailsModel  familyId=(GetFamilymemberDetailsModel)cisResult.getResultObject();
        String familyUserId=familyId.getUserId();
        
        cisResult = detailsDAO.getFamilyMemberDetails(familyUserId);
        
		logger.info("DigitalHealthCare:FamilyMemberDetailsBL  service" +cisResult );
		return cisResult;
	}

}
