package com.digitalhealthcare;

public class DeletePatientQuery {
	
	public static String SQL_DELETEPATIENT = " delete from Profile_table where User_id=? "; 
	
	public static String SQL_DELETEUSERDEVICESPATIENT = " delete from User_Devices where User_id=? ";
	
	public static String SQL_DELETEPATIENTFM = " delete from Patient_fm where Patient_userid=? ";

	public static String SQL_DELETEPATIENTPHONENUMBER = " delete from Patient_phonenumber where Patient_id=? ";
	
	public static String SQL_DELETEPATIENTAPPOINTMENTS = " delete from Appointments_table where Patient_id=? ";
	
	public static String SQL_DELETEPATIENTMESSAGES = " delete from Messages_table where Patient_id=? ";
}
