package com.softcell.gonogo.model.request;

import org.springframework.validation.Errors;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SettlementErrorRequest 
{
	
	  @JsonProperty("LoanInfo")
	    private LoanInfo loanInfo;

	    @JsonProperty("ApplicantIdentifiers")
	    private ApplicantIdentifiers applicantIdentifiers;

	    @JsonProperty("Errors")
	    private Errors errors;

	    @JsonProperty("Status")
	    private String status;
    

}
