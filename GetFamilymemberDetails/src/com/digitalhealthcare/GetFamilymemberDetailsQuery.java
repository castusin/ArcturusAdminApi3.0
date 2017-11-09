package com.digitalhealthcare;

public class GetFamilymemberDetailsQuery {
	
	public static String SQL_MEMBERID ="select Phone_number from Patient_phonenumber where Patient_id =?";
	public static String SQL_MEMBERDETAILS ="select User_id,First_name,Last_name,Email_id,Phone_no from Profile_table where Phone_no=?";
	public static String SQL_FamilyMEMBERDETAILS ="select User_id,First_name,Last_name,Email_id,Phone_no from Profile_table where User_id=?";


}
