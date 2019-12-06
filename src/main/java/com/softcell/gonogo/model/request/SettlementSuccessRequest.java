package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SettlementSuccessRequest 
{
	
	  @JsonProperty("LoanIdentifier")
	    private LoanIdentifier loanIdentifier;

	    @JsonProperty("ApplicantIdentifiers")
	    private ApplicantIdentifiers applicantIdentifiers;

	    @JsonProperty("Status")
	    private String status;


}
