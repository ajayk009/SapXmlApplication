package com.softcell.gonogo.model.request;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SettleInfoObject")
public class SettlementInfo 
{
	
    private String institutionId;
    private Date insertDate;
    private Date updateDate;
    private String gonogoRefId;
    private String fanNo;
    private SettlementSuccessRequest settlementSuccessResponse;
    private SettlementErrorRequest settlementErrorResponse;
    private ThirdPartyException thirdPartyException;
    private String errorResponse;
    private String rawResponse;
    private String sapErrorToken;
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SettlementInfo{");
        sb.append("institutionId='").append(institutionId).append('\'');
        sb.append(", insertDate=").append(insertDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", gonogoRefId=").append(gonogoRefId);
        sb.append(", fanNo=").append(fanNo);
        sb.append(", settlementSuccessResponse=").append(settlementSuccessResponse);
        sb.append(", settlementErrorResponse=").append(settlementErrorResponse);
        sb.append(", exception=").append(thirdPartyException);
        sb.append(", errorResponse='").append(errorResponse).append('\'');
        sb.append('}');
        return sb.toString();
        
        
        
    }

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getGonogoRefId() {
		return gonogoRefId;
	}

	public void setGonogoRefId(String gonogoRefId) {
		this.gonogoRefId = gonogoRefId;
	}

	public String getFanNo() {
		return fanNo;
	}

	public void setFanNo(String fanNo) {
		this.fanNo = fanNo;
	}

	public SettlementSuccessRequest getSettlementSuccessResponse() {
		return settlementSuccessResponse;
	}

	public void setSettlementSuccessResponse(SettlementSuccessRequest settlementSuccessResponse) {
		this.settlementSuccessResponse = settlementSuccessResponse;
	}

	public SettlementErrorRequest getSettlementErrorResponse() {
		return settlementErrorResponse;
	}

	public void setSettlementErrorResponse(SettlementErrorRequest settlementErrorResponse) {
		this.settlementErrorResponse = settlementErrorResponse;
	}

	public ThirdPartyException getThirdPartyException() {
		return thirdPartyException;
	}

	public void setThirdPartyException(ThirdPartyException thirdPartyException) {
		this.thirdPartyException = thirdPartyException;
	}

	public String getErrorResponse() {
		return errorResponse;
	}

	public void setErrorResponse(String errorResponse) {
		this.errorResponse = errorResponse;
	}

	public String getRawResponse() {
		return rawResponse;
	}

	public void setRawResponse(String rawResponse) {
		this.rawResponse = rawResponse;
	}

	public String getSapErrorToken() {
		return sapErrorToken;
	}

	public void setSapErrorToken(String sapErrorToken) {
		this.sapErrorToken = sapErrorToken;
	}

	public SettlementInfo(String institutionId, Date insertDate, Date updateDate, String gonogoRefId, String fanNo,
			SettlementSuccessRequest settlementSuccessResponse, SettlementErrorRequest settlementErrorResponse,
			ThirdPartyException thirdPartyException, String errorResponse, String rawResponse, String sapErrorToken) {
		super();
		this.institutionId = institutionId;
		this.insertDate = insertDate;
		this.updateDate = updateDate;
		this.gonogoRefId = gonogoRefId;
		this.fanNo = fanNo;
		this.settlementSuccessResponse = settlementSuccessResponse;
		this.settlementErrorResponse = settlementErrorResponse;
		this.thirdPartyException = thirdPartyException;
		this.errorResponse = errorResponse;
		this.rawResponse = rawResponse;
		this.sapErrorToken = sapErrorToken;
	}

	public SettlementInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
