package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicantIdDetails
{
	
	  @JsonProperty("ApplicantId")
	    private String applicantId;

	    @JsonProperty("BpNumber")
	    private String bpNumber;

	    @JsonProperty("Status")
	    private String status;

	    @JsonProperty("ErrorDescription")
	    private String errorDescription;

}
