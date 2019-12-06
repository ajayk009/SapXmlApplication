package com.softcell.gonogo.controller;

import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.javers.core.Javers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.softcell.gonogo.model.request.ApplicationRequest;
import com.softcell.gonogo.model.request.EndPointReferrer;
import com.softcell.gonogo.model.request.SapRequest;
import com.softcell.gonogo.model.request.SapResponse;
import com.softcell.gonogo.model.request.core.Header;
import com.softcell.gonogo.service.ApplicantService;
import com.softcell.gonogo.service.DMZConnector;


@RestController
public class ApplicationRequestController {

	private final Javers javers;
	
	@Autowired
	private DMZConnector dmzconnector;




	@Autowired
	public ApplicationRequestController(Javers javers) {
		this.javers = javers;

		// TODO Auto-generated constructor stub
	}

	@Autowired
	private ApplicantService applicantService;

	@PostMapping("/applicant/add")
	public void addApplicant(@RequestBody ApplicationRequest applicationRequest) {
		applicantService.addApplicant(applicationRequest);


	}

	@PutMapping("/applicant/update")
	public void updateApplicant(@RequestBody ApplicationRequest applicationRequest) {
		applicantService.updateApplicant(applicationRequest);
	}
	
	
	// this method is to get sapxml based on given reference id and header.

    @PostMapping(EndPointReferrer.SAP_XML)
    @ResponseBody
	public ResponseEntity<SapResponse> getSapXmlData(
			 @Validated({Header.FetchGrp.class})
			@RequestBody @NotNull @Valid SapRequest sapRequest,HttpServletRequest httpRequest) throws Exception 
    {
    	


    	
		return new ResponseEntity<>(
				dmzconnector.getSapXmlFullData(sapRequest.getGonogoRefId()),
				HttpStatus.OK);

	}
    
    

}
