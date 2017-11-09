package com.digitalhealthcare;

import org.apache.log4j.Logger;

import com.cis.CISResults;

public class GetProfilesWebservice {

		public CISResults profileDetails(GetProfilesModel profileDetails) {
			GetProfilesBL profileBL = new GetProfilesBL();
			 Logger logger = Logger.getLogger(GetProfilesWebservice.class);
			 CISResults cisResult = profileBL.getProfiles(profileDetails);
			 logger.info("  get patient profiles webservice :"+cisResult);
			return cisResult;
		}


}

	 
	 
	 