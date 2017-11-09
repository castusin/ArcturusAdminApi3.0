package com.digitalhealthcare;

public class GetProfilesQuery {
	
	public static final String SQL_USERDEVICES = "SELECT Profile_table.User_id,Profile_table.First_name,Profile_table.Last_name,Profile_table.Phone_no,Profile_table.Email_id,User_Devices.Device_Type,User_Devices.Device_id FROM Profile_table JOIN User_Devices ON Profile_table.User_id=User_Devices.User_id";
	
}
