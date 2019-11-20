package com.springmongorest.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.javers.core.Javers;
import org.javers.core.json.JsonConverter;
import org.javers.core.metamodel.object.CdoSnapshot;
import org.javers.repository.jql.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softcell.gonogo.model.request.ApplicationRequest;
import com.softcell.gonogo.model.request.Audit;
import com.springmongorest.repository.AuditRepository;
import com.springmongorest.service.ApplicantService;
import com.springmongorest.service.AuditService;

@RestController
public class ApplicationRequestController 
{

	private final Javers javers;

	@Autowired
	AuditService auditService;

	@Autowired
	AuditRepository auditRepository;

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


		/*
		 * Audit audit = new Audit(); if(Objects.nonNull(applicationRequest)) {
		 * if(applicationRequest.getError()!=audit.getError()) {
		 * audit.setError("value changed from "+applicationRequest.getError());
		 * 
		 * String value1 =
		 * "value changed from"+applicationRequest.getError()+"to"+audit.getError(); } }
		 * if(Objects.nonNull(applicationRequest)) {
		 * if(applicationRequest.getInstitutionId()!=audit.getInstitutionId()) {
		 * audit.setInstitutionId(applicationRequest.getInstitutionId()); } }
		 * if(Objects.nonNull(applicationRequest)) {
		 * if(applicationRequest.getPassword()!=audit.getPassword()) {
		 * audit.setPassword(applicationRequest.getPassword()); } }
		 * if(Objects.nonNull(applicationRequest)) {
		 * if(applicationRequest.getUserId()!=audit.getError()) {
		 * audit.setUserId(applicationRequest.getUserId()); } }
		 * 
		 * auditRepository.save(audit); Audit auditgame = auditRepository. String value1
		 * =
		 * "value changed from"+applicationRequest.getError()+"to"+auditgame.getError();
		 * String value2 =
		 * "value changed from"+applicationRequest.getInstitutionId()+"to"+auditgame.
		 * getInstitutionId(); String value3 =
		 * "value changed from"+applicationRequest.getPassword()+"to"+auditgame.
		 * getPassword(); String
		 * value4="value changed from"+applicationRequest.getUserId()+"to"+auditgame.
		 * getPassword();
		 */
	}

	@PutMapping("/applicant/update")
	public void updateApplicant(@RequestBody ApplicationRequest applicationRequest) {
		applicantService.updateApplicant(applicationRequest);
	}



}
