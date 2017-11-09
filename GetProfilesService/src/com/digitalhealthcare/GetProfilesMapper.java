package com.digitalhealthcare;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GetProfilesMapper implements RowMapper {
	
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		GetProfilesModel profileDetails = new GetProfilesModel();
		
		
		profileDetails.setUserId(rs.getString("User_id"));
		profileDetails.setFirstName(rs.getString("First_name"));
		profileDetails.setLastName(rs.getString("Last_name"));
		profileDetails.setEmailId(rs.getString("Email_id"));
		profileDetails.setPhoneNumber(rs.getString("Phone_no"));
		profileDetails.setDeviceId(rs.getString("Device_id"));
		profileDetails.setDeviceType(rs.getString("Device_Type"));
		
		return profileDetails;
		}
	

}
