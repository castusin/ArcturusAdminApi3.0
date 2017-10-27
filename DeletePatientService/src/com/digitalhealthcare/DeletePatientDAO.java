package com.digitalhealthcare;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.cis.CISConstants;
import com.cis.CISResults;

public class DeletePatientDAO extends JdbcDaoSupport {
	
	
public CISResults deletePatient(String patientId) {
		
		CISResults cisResults=new CISResults();
		cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
		
		Object[] inputs = new Object[]{patientId};
		try{
			
			 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEPATIENT,inputs);
			 
			 
			
		} catch (DataAccessException e) {
			e.printStackTrace();
			
		}
   		return cisResults; 
	}

public CISResults deleteUserDevicesPatient(String patientId) {


	CISResults cisResults=new CISResults();
	cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	
	Object[] inputs = new Object[]{patientId};
	try{
		
		 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEUSERDEVICESPATIENT,inputs);
		 
		 
		
	} catch (DataAccessException e) {
		e.printStackTrace();
		
	}
		return cisResults; 
}

public CISResults deletePatientFm(String patientId) {

	CISResults cisResults=new CISResults();
	cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	
	Object[] inputs = new Object[]{patientId};
	try{
		
		 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEPATIENTFM,inputs);
		 
		 
		
	} catch (DataAccessException e) {
		e.printStackTrace();
		
	}
		return cisResults; 
}

public CISResults deletePatientPhoneNumber(String patientId) {
	
	CISResults cisResults=new CISResults();
	cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	
	Object[] inputs = new Object[]{patientId};
	try{
		
		 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEPATIENTPHONENUMBER,inputs);
		 
		 
		
	} catch (DataAccessException e) {
		e.printStackTrace();
	
	}
		return cisResults; 
}

public CISResults deletePatientAppointments(String patientId) {
	
	CISResults cisResults=new CISResults();
	cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	
	Object[] inputs = new Object[]{patientId};
	try{
		
		 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEPATIENTAPPOINTMENTS,inputs);
		 
		 
		
	} catch (DataAccessException e) {
		e.printStackTrace();
		
	}
		return cisResults; 
}

public CISResults deletePatientMessages(String patientId) {
	
	CISResults cisResults=new CISResults();
	cisResults.setResponseCode(CISConstants.RESPONSE_SUCCESS);
	
	Object[] inputs = new Object[]{patientId};
	try{
		
		 getJdbcTemplate().update(DeletePatientQuery.SQL_DELETEPATIENTMESSAGES,inputs);
		 
		 
		
	} catch (DataAccessException e) {
		e.printStackTrace();
				
	}
		return cisResults; 
}


	
	
	

}
