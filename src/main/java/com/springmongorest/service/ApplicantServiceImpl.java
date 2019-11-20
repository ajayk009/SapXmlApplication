package com.springmongorest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softcell.gonogo.model.request.ApplicationRequest;
import com.springmongorest.repository.ApplicantRepository;



@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository;

	@Override
	public void addApplicant(ApplicationRequest applicantRequest) {
		// TODO Auto-generated method stub
		applicantRepository.save(applicantRequest);

	}

	@Override
	public void updateApplicant(ApplicationRequest applicantRequest) {
		// TODO Auto-generated method stub
		
		applicantRepository.save(applicantRequest);

	}

}
