
package com.digitalhealthcare;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GetFamilymemberMapper implements RowMapper {
	

		
	

public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	// TODO Auto-generated method stub
	GetFamilymemberDetailsModel memberDetails = new GetFamilymemberDetailsModel();
	
	
	memberDetails.setUserId(rs.getString("Fm_id"));
	
	
	return memberDetails;
	}

}
