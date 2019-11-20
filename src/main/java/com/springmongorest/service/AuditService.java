package com.springmongorest.service;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.softcell.gonogo.model.request.Audit;
import com.softcell.gonogo.model.request.core.Header;
import com.softcell.gonogo.model.request.core.Header.FetchGrp;
import com.softcell.gonogo.model.request.core.Request;

@Service
public class AuditService
{

	 public void SaveAudit(Audit audit) {
		 
	 }

}
