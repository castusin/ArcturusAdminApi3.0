package com.digitalhealthcare;

public class DigitalHealthcareDeleteCareTakerQuery {

	public static String SQL_DELETECARETAKERPHONE= " delete from Patient_phonenumber where Phone_number=? "; 
	
	public static String SQL_DELETECARETAKER= " delete from Patient_fm where Patient_userid=? "; 
	
	
}
