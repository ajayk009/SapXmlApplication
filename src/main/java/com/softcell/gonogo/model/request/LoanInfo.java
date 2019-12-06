package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanInfo 
{
	 @JsonProperty("LoanNumber")
	    private String loanNumber;

	    @JsonProperty("FanNo")
	    private String fanNo;

}
