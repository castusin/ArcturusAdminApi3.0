package com.digitalhealthcare;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cis.CISConstants;
import com.cis.CISResults;

public class DigitalHealthcareDeleteCareTakerDAO extends JdbcDaoSupport {

	public CISResults deleteCareTaker(String patientId, String careTakerId,
			String phoneNumber) {


		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		
		Object[] inputs = new Object[]{phoneNumber};
		try{
			
			 getJdbcTemplate().update(DigitalHealthcareDeleteCareTakerQuery.SQL_DELETECARETAKERPHONE,inputs);
			 
			 
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			
		}
   		return cisResults; 
	}

	public CISResults deleteCareTakerPhoneNumber(String patientId,
			String careTakerId, String phoneNumber) {


		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		
		Object[] inputs = new Object[]{patientId};
		try{
			
			 getJdbcTemplate().update(DigitalHealthcareDeleteCareTakerQuery.SQL_DELETECARETAKER,inputs);
			 
			 
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			
		}
   		return cisResults; 
	}

	
}
