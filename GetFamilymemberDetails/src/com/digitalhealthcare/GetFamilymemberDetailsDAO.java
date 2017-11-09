package com.digitalhealthcare;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cis.CISConstants;
import com.cis.CISResults;
import com.cis.TimeCheck;
import com.cis.testServiceTime;

import java.util.List;

public class GetFamilymemberDetailsDAO extends JdbcDaoSupport {
	
	
	public List<GetFamilymemberDetailsModel> getFamilyMember(String memberId) {
		GetFamilymemberDetailsModel memberDetails;
		
		List<GetFamilymemberDetailsModel> familyPhoneList = null;
		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		Logger logger = Logger.getLogger(GetFamilymemberDetailsDAO.class);
		Object[] inputs = new Object[]{memberId};
		try{
			// Capture service Start time
			 TimeCheck time=new TimeCheck();
			 testServiceTime sessionTimeCheck=new testServiceTime();
			 String serviceStartTime=time.getTimeZone();
			 familyPhoneList=getJdbcTemplate().query(GetFamilymemberDetailsQuery.SQL_MEMBERID,inputs,new GetFamilymemberMapper());
			 String serviceEndTime=time.getTimeZone();
			 long result=sessionTimeCheck.getServiceTime(serviceEndTime,serviceStartTime);
			 logger.info("Get member details query time:: " +result);
			
			
			//cisResults.setResultObject(res);
		} catch (DataAccessException e) {
			e.printStackTrace();
		
			cisResults.setResponseCode(CISConstants.RESPONSE_FAILURE);
			cisResults.setErrorMessage("Failed to get Profile Data");
		}

   		return familyPhoneList;  
	}

	public CISResults getFamilyMemberDetails(String familyUserId) {

		GetFamilymemberDetailsModel memberDetails;
		List<GetFamilymemberDetailsModel> familyLilst=null;
		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		Logger logger = Logger.getLogger(GetFamilymemberDetailsDAO.class);
		Object[] inputs = new Object[]{familyUserId};
		try{
			// Capture service Start time
			 TimeCheck time=new TimeCheck();
			 testServiceTime sessionTimeCheck=new testServiceTime();
			 String serviceStartTime=time.getTimeZone();
			 GetFamilymemberDetailsModel res=(GetFamilymemberDetailsModel)getJdbcTemplate().queryForObject(GetFamilymemberDetailsQuery.SQL_MEMBERDETAILS,inputs,new GetFamilymemberDetailsMapper());
			
			 
			 String serviceEndTime=time.getTimeZone();
			 long result=sessionTimeCheck.getServiceTime(serviceEndTime,serviceStartTime);
			 logger.info("Get member details query time:: " +result);
			
			
			cisResults.setResultObject(res);
		} catch (DataAccessException e) {
			e.printStackTrace();
		
			cisResults.setResponseCode(CISConstants.RESPONSE_FAILURE);
			
			//cisResults.setErrorMessage("Failed to get Profile Data");
		}

   		return cisResults;  
	}

	public List<GetFamilymemberDetailsModel> getFamilyDetails(String familyId) {


		List<GetFamilymemberDetailsModel> familyLilst=null;
		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		Logger logger = Logger.getLogger(GetFamilymemberDetailsDAO.class);
		Object[] inputs = new Object[]{familyId};
		try{
			// Capture service Start time
			 TimeCheck time=new TimeCheck();
			 testServiceTime sessionTimeCheck=new testServiceTime();
			 String serviceStartTime=time.getTimeZone();
			 familyLilst=getJdbcTemplate().query(GetFamilymemberDetailsQuery.SQL_FamilyMEMBERDETAILS,inputs,new GetFamilymemberDetailsMapper());
			 String serviceEndTime=time.getTimeZone();
			 long result=sessionTimeCheck.getServiceTime(serviceEndTime,serviceStartTime);
			 logger.info("Get member details query time:: " +result);
			
			
			//cisResults.setResultObject(res);
		} catch (DataAccessException e) {
			e.printStackTrace();
		
			cisResults.setResponseCode(CISConstants.RESPONSE_FAILURE);
			cisResults.setErrorMessage("Failed to get Profile Data");
		}

   		return familyLilst;  
	}
	

}
