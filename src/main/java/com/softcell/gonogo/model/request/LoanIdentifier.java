package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoanIdentifier
{
	
    @JsonProperty("LoanNumber")
    private String loanNumber;

    @JsonProperty("FanNo")
    private String fanNo;

    @JsonProperty("ContractNumber")
    private String contractNumber;

    @JsonProperty("RoNumber")
    private String roNumber;

    @JsonProperty("RoGenerationDate")
    private String roGenerationDate;

    @JsonProperty("ContractGenerationDate")
    private String contractGenerationDate;

}
