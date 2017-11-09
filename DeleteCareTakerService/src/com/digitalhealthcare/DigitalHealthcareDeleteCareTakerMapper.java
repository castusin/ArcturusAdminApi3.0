
package com.digitalhealthcare;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DigitalHealthcareDeleteCareTakerMapper implements RowMapper {
	

	

public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	DigitalHealthcareDeleteCareTakerDetails caretaker = new DigitalHealthcareDeleteCareTakerDetails();
	
	
	
	caretaker.setEmailId(rs.getString("Email_id"));
	
	
	return caretaker;
	}

}
