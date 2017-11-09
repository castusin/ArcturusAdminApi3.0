package com.digitalhealthcare;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cis.CISConstants;
import com.cis.CISResults;

public class DeleteDeviceDAO extends JdbcDaoSupport {
	
public CISResults deleteDevice(String patientId) {
		
		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		
		Object[] inputs = new Object[]{patientId};
		try{
			
			 getJdbcTemplate().update(DeleteDeviceQuery.SQL_DELETEDEVICE,inputs);
			 
			 
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			
		}
   		return cisResults; 
	}

}
