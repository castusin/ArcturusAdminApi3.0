package com.digitalhealthcare;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cis.CISConstants;
import com.cis.CISResults;
import com.cis.TimeCheck;
import com.cis.testServiceTime;

public class GetProfilesDAO extends JdbcDaoSupport {
	
	public CISResults getProfiles(String userId, String firstName,
			String lastName, String phoneNumber, String emailId, String deviceType,
			String deviceId) {

		

		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		Logger logger = Logger.getLogger(GetProfilesDAO.class);
		try{
			// Capture service Start time
			 TimeCheck time=new TimeCheck();
			 testServiceTime sessionTimeCheck=new testServiceTime();
			 String serviceStartTime=time.getTimeZone();
			 List deviceDetails=getJdbcTemplate().query(GetProfilesQuery.SQL_USERDEVICES,new GetProfilesMapper());
			 String serviceEndTime=time.getTimeZone();
			 long result=sessionTimeCheck.getServiceTime(serviceEndTime,serviceStartTime);
			 cisResults.setResultObject(deviceDetails);
			 logger.info("profile details query time:: " +result);
			
		} catch (DataAccessException e) {
			e.printStackTrace();
		
			cisResults.setResponseCode(CISConstants.RESPONSE_FAILURE);
			cisResults.setErrorMessage("Failed to get  Data");
		}
   		return cisResults; 
	}

	

}