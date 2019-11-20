package com.softcell.gonogo.model.request;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.softcell.gonogo.model.request.core.Header;
import com.softcell.gonogo.model.request.core.Request;
import com.softcell.gonogo.model.request.core.Header.FetchGrp;

@Document(collection = "audit_trail")
@Validated
public class Audit 
{
	
	@JsonProperty("sInstId")
    private String institutionId;

    @JsonProperty("sUserId")
    private String userId;

    @JsonProperty("sPassword")
    private String password;

    @JsonProperty("sError")
    private String error;

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Audit(String institutionId, String userId, String password, String error) {
		super();
		this.institutionId = institutionId;
		this.userId = userId;
		this.password = password;
		this.error = error;
	}

	public Audit() {
		super();
		// TODO Auto-generated constructor stub
	}

   

}
