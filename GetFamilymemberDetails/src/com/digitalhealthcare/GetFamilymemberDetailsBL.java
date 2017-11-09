 package com.digitalhealthcare;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cis.CISConstants;
import com.cis.CISResults;

public class GetFamilymemberDetailsBL {
	
	ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-servlet.xml"); 
	GetFamilymemberDetailsDAO detailsDAO=(GetFamilymemberDetailsDAO)ctx.getBean("getFamilyMember");

	
	public CISResults getFamilyMember(String memberId) {
		final Logger logger = Logger.getLogger(GetFamilymemberDetailsBL.class);
		
		CISResults cisResult = new CISResults();
		List<GetFamilymemberDetailsModel> getPlans = detailsDAO.getFamilyMember(memberId);
		String FamlyphoneNumber="";
		ArrayList<GetFamilymemberDetailsModel> unRegistered = new ArrayList<GetFamilymemberDetailsModel>();
		//GetFamilymemberDetailsModel family = null;
		ArrayList<GetFamilymemberDetailsModel> familymembers = new ArrayList<GetFamilymemberDetailsModel>();
		GetFamilymebers getFamilymembers = new GetFamilymebers() ;
		for (int i = 0; i < getPlans.size(); i++) {
			GetFamilymemberDetailsModel getPlanDetails = new GetFamilymemberDetailsModel();
			FamlyphoneNumber = getPlans.get(i).phoneNumber;
			cisResult = detailsDAO.getFamilyMemberDetails(FamlyphoneNumber);
			if(cisResult.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_FAILURE)) {
				
				cisResult.setResponseCode(CISConstants.RESPONSE_SUCCESS);
				getPlanDetails.setPhoneNumber(FamlyphoneNumber);
				unRegistered.add(getPlanDetails);
			 
				
			} else if(cisResult.getResponseCode().equalsIgnoreCase(CISConstants.RESPONSE_SUCCESS)){
				
				 GetFamilymemberDetailsModel  staffEmailId=(GetFamilymemberDetailsModel)cisResult.getResultObject();
	             String staffEmail=staffEmailId.getEmailId();
	             String userId=staffEmailId.getUserId();
	             String firstname=staffEmailId.getFirstName();
	             String lastname=staffEmailId.getLastName();
	             String phonenumber=staffEmailId.getPhoneNumber();
	            		 
	             getPlanDetails.setEmailId(staffEmail);
	             getPlanDetails.setUserId(userId);
	             getPlanDetails.setFirstName(firstname);
	             getPlanDetails.setLastName(lastname);
	             getPlanDetails.setPhoneNumber(phonenumber);
	             familymembers.add(getPlanDetails);
	            
		   }
			
	}
		 getFamilymembers.setFamilyMembersDetails(familymembers);
		 getFamilymembers.setUnRegisterdfamilyMembersDetails(unRegistered);
		 cisResult.setResultObject(getFamilymembers);
		
		
		logger.info("DigitalHealthCare:FamilyMemberDetailsBL  service" +cisResult );
		return cisResult;
	}

}
