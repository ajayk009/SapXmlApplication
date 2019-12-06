package com.softcell.gonogo.model.request;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.softcell.gonogo.model.request.core.Header;

public class SapRequest 
{
	
	     @JsonProperty("oHeader")
	    @NotNull(groups = {Header.FetchGrp.class, Header.InstWithProductGrp.class})
	    @Valid
	    private Header header;

	    @JsonProperty("sRefID")
	    @NotEmpty(groups = {DmzRequest.FetchGrp.class})
	    private String gonogoRefId;

		public Header getHeader() {
			return header;
		}

		public void setHeader(Header header) {
			this.header = header;
		}

		public String getGonogoRefId() {
			return gonogoRefId;
		}

		public void setGonogoRefId(String gonogoRefId) {
			this.gonogoRefId = gonogoRefId;
		}

		public SapRequest(Header header, String gonogoRefId) {
			super();
			this.header = header;
			this.gonogoRefId = gonogoRefId;
		}

		public SapRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
	    

}
