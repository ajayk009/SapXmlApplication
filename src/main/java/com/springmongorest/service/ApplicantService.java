package com.springmongorest.service;

import com.softcell.gonogo.model.request.ApplicationRequest;

public interface ApplicantService 
{
	
    void addApplicant(ApplicationRequest student);
    void updateApplicant(ApplicationRequest student);
   

}
