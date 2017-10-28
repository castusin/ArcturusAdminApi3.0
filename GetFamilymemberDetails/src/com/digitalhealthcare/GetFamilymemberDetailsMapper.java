package com.digitalhealthcare;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GetFamilymemberDetailsMapper implements RowMapper {
	

	

public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	GetFamilymemberDetailsModel memberDetails = new GetFamilymemberDetailsModel();
	
	
	memberDetails.setUserId(rs.getString("User_id"));
	memberDetails.setFirstName(rs.getString("First_name"));
	memberDetails.setLastName(rs.getString("Last_name"));
	memberDetails.setEmailId(rs.getString("Email_id"));
	memberDetails.setPhoneNumber(rs.getString("Phone_no"));
	
	return memberDetails;
	}

}
