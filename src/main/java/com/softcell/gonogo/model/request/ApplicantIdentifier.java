package com.softcell.gonogo.model.request;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicantIdentifier 

{

	

    @JsonProperty("ApplicantIdDetails")
    private List<ApplicantIdDetails> applicantIdDetails;
}
