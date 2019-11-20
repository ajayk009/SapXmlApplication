package com.softcell.gonogo.model.request.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.softcell.gonogo.model.core.*;

import org.springframework.data.annotation.Transient;
import java.io.Serializable;
import java.util.List;

/**
 * @author yogeshb
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Request implements Serializable {

    @JsonProperty("oApplicant")
    private Applicant applicant;

	/*
	 * @JsonProperty("aCoApplicant") private List<CoApplicant> coApplicant;
	 * 
	 * @JsonProperty("oApplication") private Application application;
	 */

    @JsonProperty("sSuspAct")
    private String suspiciousActivity;

	/*
	 * @JsonProperty("oGstDetails") private GstDetails gstDetails;
	 * 
	 * @JsonProperty("oPersonalDiscussion") private PersonalDiscussion
	 * personalDiscussion;
	 */

    //Added for FiveStar - by Somasekhar on 08/09/2018.
	/*
	 * @JsonProperty("aPersonalDiscussionList") private List<PersonalDiscussion>
	 * personalDiscussionList;
	 */

    @JsonProperty("sCharacterAgency")
    private String characterAgency;

    @JsonProperty("sCharacterStatus")
    private String characterStatus;

    @JsonProperty("sCapabilityAgency")
    private String capabilityAgency;

    @JsonProperty("sCapabilityStatus")
    private String capabilityStatus;

    @JsonProperty("bWelcomeMsgSent")
    private boolean welcomeMsgSent;

    @JsonProperty("sEventType")
    private String eventType;

    @JsonProperty("oLogoDetails")
    private List<Object> logDetails;

    public List<Object> getLogDetails() {
        return logDetails;
    }

    public void setLogDetails(List<Object> logDetails) {
        this.logDetails = logDetails;
    }

    @JsonProperty("bWithDedupe")
    private boolean withDedupe;

    @Transient
    @JsonProperty("bDedupeFlag")
    private boolean dedupeFlag;

    @JsonProperty("bLoginAccepted")
    private boolean loginAccepted;

    @JsonProperty("sInitiatedBy")
    private String initiatedBy;

    @JsonProperty(value = "bIsCaseInitiated")
    private boolean isCaseInitiated;

    @JsonProperty(value = "sInitiatedByRole")
    private String initiatedByRole;

    public String getInitiatedBy() {
        return initiatedBy;
    }

    public void setInitiatedBy(String initiatedBy) {
        this.initiatedBy = initiatedBy;
    }

    public boolean isCaseInitiated() {
        return isCaseInitiated;
    }

    public void setCaseInitiated(boolean caseInitiated) {
        isCaseInitiated = caseInitiated;
    }

    public String getInitiatedByRole() {
        return initiatedByRole;
    }

    public void setInitiatedByRole(String initiatedByRole) {
        this.initiatedByRole = initiatedByRole;
    }

    public boolean isLoginAccepted() {
        return loginAccepted;
    }

    public void setLoginAccepted(boolean loginAccepted) {
        this.loginAccepted = loginAccepted;
    }

    public boolean isWithDedupe() {
        return withDedupe;
    }

    public void setWithDedupe(boolean withDedupe) {
        this.withDedupe = withDedupe;
    }

    public boolean isDedupeFlag() {
        return dedupeFlag;
    }

    public void setDedupeFlag(boolean dedupeFlag) {
        this.dedupeFlag = dedupeFlag;
    }

    public String getEventType() {  return eventType;   }

    public void setEventType(String eventType) {    this.eventType = eventType; }

	/*
	 * public List<PersonalDiscussion> getPersonalDiscussionList() { return
	 * personalDiscussionList; }
	 * 
	 * public void setPersonalDiscussionList(List<PersonalDiscussion>
	 * personalDiscussionList) { this.personalDiscussionList =
	 * personalDiscussionList; }
	 */

    public String getSuspiciousActivity() {
        return suspiciousActivity;
    }

    public void setSuspiciousActivity(String suspiciousActivity) {
        this.suspiciousActivity = suspiciousActivity;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

	/*
	 * public List<CoApplicant> getCoApplicant() { return coApplicant; }
	 * 
	 * public void setCoApplicant(List<CoApplicant> coApplicant) { this.coApplicant
	 * = coApplicant; }
	 * 
	 * public Application getApplication() { return application; }
	 * 
	 * public void setApplication(Application application) { this.application =
	 * application; }
	 * 
	 * public GstDetails getGstDetails() { return gstDetails; }
	 * 
	 * public void setGstDetails(GstDetails gstDetails) { this.gstDetails =
	 * gstDetails; }
	 * 
	 * public PersonalDiscussion getPersonalDiscussion() { return
	 * personalDiscussion; }
	 * 
	 * public void setPersonalDiscussion(PersonalDiscussion personalDiscussion) {
	 * this.personalDiscussion = personalDiscussion; }
	 */

    public String getCharacterAgency() {
        return characterAgency;
    }

    public void setCharacterAgency(String characterAgency) {
        this.characterAgency = characterAgency;
    }

    public String getCharacterStatus() {
        return characterStatus;
    }

    public void setCharacterStatus(String characterStatus) {
        this.characterStatus = characterStatus;
    }

    public String getCapabilityAgency() {
        return capabilityAgency;
    }

    public void setCapabilityAgency(String capabilityAgency) {
        this.capabilityAgency = capabilityAgency;
    }

    public String getCapabilityStatus() {
        return capabilityStatus;
    }

    public void setCapabilityStatus(String capabilityStatus) {
        this.capabilityStatus = capabilityStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ScoreRequest{");
        sb.append("applicant=").append(applicant);
       
    
        sb.append(", suspiciousActivity='").append(suspiciousActivity).append('\'');
      
        sb.append('}');
        return sb.toString();
    }

	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
	 * == null || getClass() != o.getClass()) return false;
	 * 
	 * Request request = (Request) o;
	 * 
	 * if (applicant != null ? !applicant.equals(request.applicant) :
	 * request.applicant != null) return false; \ if (suspiciousActivity != null ?
	 * !suspiciousActivity.equals(request.suspiciousActivity) :
	 * request.suspiciousActivity != null) return false; return gstDetails != null ?
	 * gstDetails.equals(request.gstDetails) : request.gstDetails == null; }
	 */

  /*  @Override
    public int hashCode() {
        int result = applicant != null ? applicant.hashCode() : 0;
        result = 31 * result + (coApplicant != null ? coApplicant.hashCode() : 0);
        result = 31 * result + (application != null ? application.hashCode() : 0);
        result = 31 * result + (suspiciousActivity != null ? suspiciousActivity.hashCode() : 0);
        result = 31 * result + (gstDetails != null ? gstDetails.hashCode() : 0);
        return result;
    */}

