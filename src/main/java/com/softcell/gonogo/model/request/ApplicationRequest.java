package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.softcell.gonogo.model.request.core.Header;
import com.softcell.gonogo.model.request.core.Request;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author yogeshb
 */
@Document(collection = "ApplicationDocument")
@Validated
public class ApplicationRequest implements Serializable {
    /**
     *
     */
	@JsonProperty("sInstId")
    private String institutionId;

    @JsonProperty("sUserId")
    private String userId;

    @JsonProperty("sPassword")
    private String password;

    @JsonProperty("sError")
    private String error;

    public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getAssignRole() {
		return assignRole;
	}

	public void setAssignRole(String assignRole) {
		this.assignRole = assignRole;
	}

	public Object getPowercurveXmlRequest() {
		return powercurveXmlRequest;
	}

	@Id
    @JsonProperty("sRefID")
    private String refID;

    @JsonProperty("oHeader")
    @Valid
    @NotNull(groups = {Header.FetchGrp.class})
    private Header header;

    @JsonProperty("oReq")
    private Request request;

   

    @JsonProperty("sRespFormat")
    private String responseFormat;

    @JsonProperty("sCurrentStageId")
    private String currentStageId = "DE";

    @JsonProperty("iDealerRank")
    private double dealerRank;

    @JsonProperty("sAppFormNumber")
    private String applicationFormNumber;



    @JsonProperty("sApplicantType")
    private String applicantType;

    @JsonProperty("sCouponCode")
    private String couponCode;

    @JsonProperty("bQdeDecision")
    private boolean qdeDecision;


    @JsonProperty("sMiFinProspectCode")
    private String miFinProspectCode;

    @JsonProperty("sMiFinCustomerCode")
    private String miFinCustomerCode;

    @JsonProperty("bDashboardCase")
    private boolean dashboardCase;

    @JsonProperty("bStatus")
    private boolean status;

    @JsonProperty("sContactPerson")
    private boolean contactPerson;

 

    @JsonProperty("bDedupeChk")
    private boolean dedupeChk;

   
    @JsonProperty("bDeviationSubmit")
    private boolean deviationSubmit;

  

    @JsonProperty("sLeadId")
    private String leadId;

    @JsonProperty("sLeadStatus")
    private String leadStatus;

    @JsonProperty("sPosidexCallType")
    private String posidexCallType;
    
  

    // flag to decide wheather to call hunter or not
    @JsonIgnore
    @Transient
    private boolean hunterCall;

    @JsonProperty("bSmsAck")
    private boolean smsAckId;

    //temp field adding for few days
    @JsonProperty("powercurveXmlRequest")
    private Object powercurveXmlRequest;

    // Added for EFL
    @JsonProperty("sAssignRole")
    private String assignRole;

    // id to decide wheather to add which posidex
    @JsonIgnore
    @Transient
    private String appId;

    @JsonProperty("bManualFlowSubmit")
    private boolean manualFlowSubmit;

    public boolean isManualFlowSubmit() {
        return manualFlowSubmit;
    }

    public void setManualFlowSubmit(boolean manualFlowSubmit) {
        this.manualFlowSubmit = manualFlowSubmit;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public boolean isSmsAckId() {
        return smsAckId;
    }
    
    public String getPosidexCallType(){
        return posidexCallType;
    }
    
    public void setPosidexCallType(String posidexCallType){
        this.posidexCallType = posidexCallType;
    }
    
    public void setSmsAckId(boolean smsAckId) {
        this.smsAckId = smsAckId;
    }


    public boolean isDeviationSubmit() {    return deviationSubmit; }

    public void setDeviationSubmit(boolean deviationSubmit) {   this.deviationSubmit = deviationSubmit; }

    public ApplicationRequest() {    }

    public boolean isDedupeChk() {  return dedupeChk;   }

    public void setDedupeChk(boolean dedupeChk) {   this.dedupeChk = dedupeChk; }


    public boolean isDashboardCase() {   return dashboardCase;  }

    public void setDashboardCase(boolean dashboardCase) {   this.dashboardCase = dashboardCase;   }

    public boolean isStatus() {     return status;   }

    public void setStatus(boolean status) {  this.status = status;  }

    public boolean isContactPerson() {  return contactPerson;  }

    public void setContactPerson(boolean contactPerson) { this.contactPerson = contactPerson;  }





 



    public double getDealerRank() {
        return dealerRank;
    }

    public void setDealerRank(double dealerRank) {
        this.dealerRank = dealerRank;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getApplicantType() {        return applicantType;    }

    public void setApplicantType(String customerType) {        this.applicantType = customerType;    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRefID() {
        return refID;
    }

    public void setRefID(String refID) {
        this.refID = refID;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getCurrentStageId() {
        return currentStageId;
    }

    public void setCurrentStageId(String currentStageId) {
        this.currentStageId = currentStageId;
    }

    /**
     * @return the reAppraiseDetails
     */
 

    /**
     * @param reAppraiseDetails the reAppraiseDetails to set
     */
  

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * @return the applicationFormNumber
     */
    public String getApplicationFormNumber() {
        return applicationFormNumber;
    }

    /**
     * @param applicationFormNumber the applicationFormNumber to set
     */
    public void setApplicationFormNumber(String applicationFormNumber) {
        this.applicationFormNumber = applicationFormNumber;
    }



    public boolean isQdeDecision() {
        return qdeDecision;
    }

    public void setQdeDecision(boolean qdeDecision) {
        this.qdeDecision = qdeDecision;
    }

 
    public String getMiFinProspectCode() {
        return miFinProspectCode;
    }

    public void setMiFinProspectCode(String miFinProspectCode) {
        this.miFinProspectCode = miFinProspectCode;
    }

    public String getMiFinCustomerCode() {
        return miFinCustomerCode;
    }

    public void setMiFinCustomerCode(String miFinCustomerCode) {
        this.miFinCustomerCode = miFinCustomerCode;
    }

  


    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public boolean isHunterCall() {
        return hunterCall;
    }

    public void setHunterCall(boolean hunterCall) {
        this.hunterCall = hunterCall;
    }

	public ApplicationRequest(String institutionId, String userId, String password, String error, String refID,
			 Header header, Request request, String responseFormat,
			String currentStageId, double dealerRank, String applicationFormNumber, String applicantType,
			String couponCode, boolean qdeDecision, String miFinProspectCode, String miFinCustomerCode,
			boolean dashboardCase, boolean status, boolean contactPerson, boolean dedupeChk,
			boolean deviationSubmit, String leadId, String leadStatus, String posidexCallType, boolean hunterCall,
			boolean smsAckId, Object powercurveXmlRequest, String assignRole, String appId,
			boolean manualFlowSubmit) {
		super();
		this.institutionId = institutionId;
		this.userId = userId;
		this.password = password;
		this.error = error;
		this.refID = refID;
		this.header = header;
		this.request = request;
		this.responseFormat = responseFormat;
		this.currentStageId = currentStageId;
		this.dealerRank = dealerRank;
		this.applicationFormNumber = applicationFormNumber;
		this.applicantType = applicantType;
		this.couponCode = couponCode;
		this.qdeDecision = qdeDecision;
		this.miFinProspectCode = miFinProspectCode;
		this.miFinCustomerCode = miFinCustomerCode;
		this.dashboardCase = dashboardCase;
		this.status = status;
		this.contactPerson = contactPerson;
		this.dedupeChk = dedupeChk;
		this.deviationSubmit = deviationSubmit;
		this.leadId = leadId;
		this.leadStatus = leadStatus;
		this.posidexCallType = posidexCallType;
		this.hunterCall = hunterCall;
		this.smsAckId = smsAckId;
		this.powercurveXmlRequest = powercurveXmlRequest;
		this.assignRole = assignRole;
		this.appId = appId;
		this.manualFlowSubmit = manualFlowSubmit;
	}
    
    
/*
 * @Autowired private final Javers javers;
 * 
 * public AuditService(Javers javers) {
 * 
 * this.javers = javers; }
 * 
 * public <T> void commit(String author, T currentVersion) {
 * 
 * javers.commit(author, currentVersion); }
 */

/*
 * public <T> List<VersionDTO<T>> getVersions(T currentVersion, Object id) {
 * 
 * List<Shadow<T>> ds = getShadows(currentVersion.getClass(), id); AtomicInteger
 * index = new AtomicInteger(); return ds.stream().map(d -> { VersionDTO<T>
 * version = new VersionDTO<>(); version.setEntity(d.get());
 * version.setVersion(index.getAndIncrement());
 * version.setAuthor(d.getCommitMetadata().getAuthor());
 * version.setCreatedAt(d.getCommitMetadata().getCommitDate()); if (
 * !javers.compare(currentVersion, d.get()).hasChanges()) {
 * version.setCurrentVersion(true); } return version;
 * }).collect(Collectors.toList()); }
 * 
 * public <T> List<VersionsDiffDTO> compare(Class<?> entity, Object id, int
 * left, int right) {
 * 
 * List<Shadow<T>> shadows = getShadows(entity, id); T v1 =
 * shadows.get(left).get(); T v2 = shadows.get(right).get(); List<Change>
 * changes = javers.compare(v1, v2).getChanges(); return
 * changes.parallelStream().map(change -> { VersionsDiffDTO diff = new
 * VersionsDiffDTO(); diff.setPropertyName(((ValueChange)
 * change).getPropertyName()); diff.setPropertyNameWithPath(((ValueChange)
 * change).getPropertyNameWithPath()); diff.setLeft(((ValueChange)
 * change).getLeft()); diff.setRight(((ValueChange) change).getRight()); return
 * diff; }).collect(Collectors.toList()); }
 * 
 * public <T> T getVersion(Class<T> entity, Object id, int version) {
 * 
 * List<Shadow<T>> shadows = getShadows(entity, id); return
 * shadows.get(version).get(); }
 * 
 * private <T> List<Shadow<T>> getShadows(Class<?> entity, Object id) {
 * 
 * QueryBuilder jqlQuery = QueryBuilder.byInstanceId(id, entity);
 * List<Shadow<T>> shadows = javers.findShadows(jqlQuery.build());
 * Collections.reverse(shadows); return shadows; }
 */

   
}
