package com.digitalhealthcare;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GetProfileDeviceMapper implements RowMapper {
	
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		GetProfilesModel profileDetails = new GetProfilesModel();
		
		
		profileDetails.setDeviceId(rs.getString("Device_id"));
		profileDetails.setDeviceType(rs.getString("Device_Type"));
		
		return profileDetails;
		}

}
