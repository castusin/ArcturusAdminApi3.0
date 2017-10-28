package com.digitalhealthcare;

public class GetFamilymemberDetailsQuery {
	
	public static String SQL_MEMBERID ="select Fm_id from Patient_fm where Patient_userid =?"; 
	public static String SQL_MEMBERDETAILS ="select User_id,First_name,Last_name,Email_id,Phone_no from Profile_table where User_id=?";
	
}
