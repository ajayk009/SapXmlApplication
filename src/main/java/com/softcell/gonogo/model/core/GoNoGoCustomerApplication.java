package com.softcell.gonogo.model.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.softcell.gonogo.model.request.ApplicationRequest;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.*;

/**
 * @author kishorp\ This Class is used to process GoNoGo Application. After
 *         Saving into database.
 */
@Document(collection = "goNoGoCustomerApplication")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoNoGoCustomerApplication {

	/*
	 * @JsonProperty("oIntrmStat") private InterimStatus intrimStatus = new
	 * InterimStatus();
	 */

	/* Map storing completed steps and info related to completion */
	/*
	 * @JsonProperty("oCompletedExecution") private Map<String, CompletionInfo>
	 * completed = new LinkedHashMap();
	 */

	@Id
	@JsonProperty("sRefID")
	private String gngRefId;

	@JsonProperty("sParentID")
	private String parentID;

	@JsonProperty("sRootID")
	private String rootID;

	private int productSequenceNumber;

	@JsonProperty("dDate")
	private Date dateTime = new Date();

	@JsonProperty("sAppStat")
	private String applicationStatus;

	@JsonProperty("bStatFlag")
	private boolean statusFlag;

	@JsonProperty("iReInitCount")
	private int reInitiateCount;

	@JsonProperty("bReAppraiseReq")
	private boolean reappraiseReq;

	@JsonIgnore
	private int reProcessCount;

	@JsonProperty("sReInitRmk")
	private String reInitiateRemark;

	@JsonProperty("sAgreementNum")
	private String agreementNum;

	@JsonProperty("bEditable")
	private boolean editable = true;

	@JsonProperty("sGoldRole")
	private String goldRole;

	private String assignedQueueGroupId;

	// Track access status of application by user
	/*
	 * @JsonProperty("oAllocationStatus") private AllocationInfo allocationInfo;
	 */

	/*
	 * @JsonProperty("aAllocationStatus") private List<AllocationInfo>
	 * allocationInfoList = new ArrayList<>();
	 * 
	 * @JsonProperty("oAppReq") private ApplicationRequest applicationRequest;
	 * 
	 * @JsonProperty("oCompRes") private volatile ComponentResponse
	 * applicantComponentResponse = new ComponentResponse();
	 * 
	 * @JsonProperty("aCompRes") private List<ComponentResponse>
	 * applicantComponentResponseList;
	 *//**
		 * Credit Risk officer decisions list
		 *//*
			 * @JsonProperty("aCroDec") private List<CroDecision> croDecisions;
			 * 
			 * @JsonProperty("oTvrDetails") private TvrDetails tvrDetails;
			 */

	@JsonProperty("bNegPinCodeFlag")
	private boolean negativePincode;
	/*
	 * @JsonProperty("oWorkFlowDetail") private WorkFlowDetails workFlowDetails;
	 */
	/**
	 * This property is used by multiple thread same time. so it has been
	 * initialized.
	 */
	/*
	 * @JsonProperty("aAppScoRslt") private Vector<ModuleOutcome> applScoreVector =
	 * new Vector<ModuleOutcome>();
	 */
	/**
	 * Just use to store log and status of application for audit purpose
	 */
	/*
	 * @Transient private ApplicationLog applicationLog = new ApplicationLog();
	 * 
	 * private ComponentStatus componentStatus;
	 */

	@JsonProperty("aDeDupe")
	private Set<String> dedupedApplications;

	/*
	 * @JsonProperty("aCroJustification") private List<CroJustification>
	 * croJustification;
	 * 
	 * @JsonProperty("oLosDtls") private LOSDetails losDetails;
	 * 
	 * @JsonProperty("oInvDtls") private InvoiceDetails invoiceDetails;
	 * 
	 * @JsonProperty("oDisbDtls") private DisbursementDetails disbursementDetails;
	 */

	@JsonProperty("bDeviation")
	private boolean deviation;

	/*
	 * @Transient private Lead lead;
	 */

	@JsonProperty("sSource")
	private String source;

	@Transient
	private boolean callMbSobreForLead;

	@JsonProperty("sCalculatedExcel")
	private String calculatedExcel;

	/**
	 * for Sending Data to Mis Report Specific to fiveStar
	 */

	/* private CaseSpecificData caseSpecificdata; */

	/**
	 * for cancel and withdrawal cases in abfl
	 */
	@JsonProperty("bWithdrawal")
	private boolean withdrawal;

	@JsonProperty("bChqCancel")
	private boolean cancel;

	@JsonProperty("bLoanCancel")
	private boolean loanCancel;

	/*
	 * @JsonProperty("oPostDisbData") PostDisbActionData postDisbActionData;
	 */

//    @JsonProperty("oTatInfo")
//    private TatInfo tatInfo;
//
//    public TatInfo getTatInfo() {
//        return tatInfo;
//    }
//
//    public void setTatInfo(TatInfo tatInfo) {
//        this.tatInfo = tatInfo;
//    }
	@Transient
	private double updatedLoanAmt;

	/**
	 * this Field contain last updated date for that case
	 * 
	 * @return
	 */

	@JsonProperty("dtLastUpdateDate")
	private Date lastUpdatedDate;

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public double getUpdatedLoanAmt() {
		return updatedLoanAmt;
	}

	public void setUpdatedLoanAmt(double updatedLoanAmt) {
		this.updatedLoanAmt = updatedLoanAmt;
	}

	public boolean isLoanCancel() {
		return loanCancel;
	}

	public void setLoanCancel(boolean loanCancel) {
		this.loanCancel = loanCancel;
	}
	/*
	 * public PostDisbActionData getPostDisbActionData() { return
	 * postDisbActionData; }
	 * 
	 * public void setPostDisbActionData(PostDisbActionData postDisbActionData) {
	 * this.postDisbActionData = postDisbActionData; }
	 */

	public boolean isWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(boolean withdrawal) {
		this.withdrawal = withdrawal;
	}

	public boolean isCancel() {
		return cancel;
	}

	public void setCancel(boolean cancel) {
		this.cancel = cancel;
	}
	/*
	 * public CaseSpecificData getCaseSpecificdata() { return caseSpecificdata; }
	 * 
	 * public void setCaseSpecificdata(CaseSpecificData caseSpecificdata) {
	 * this.caseSpecificdata = caseSpecificdata; }
	 */

	/**
	 * @return deviation flag for fivestar
	 */

	public boolean isDeviation() {
		return deviation;
	}

	public void setDeviation(boolean deviation) {
		this.deviation = deviation;
	}

	/**
	 * @return the noOfReTry
	 */
	public int getReInitiateCount() {
		return reInitiateCount;
	}

	/**
	 * @param reInitiateCount the noOfReTry to set
	 */
	public void setReInitiateCount(int reInitiateCount) {
		this.reInitiateCount = reInitiateCount;
	}

	/**
	 * @return the reInitiateRemark
	 */
	public String getReInitiateRemark() {
		return reInitiateRemark;
	}

	/**
	 * @param reInitiateRemark the reInitiateRemark to set
	 */
	public void setReInitiateRemark(String reInitiateRemark) {
		this.reInitiateRemark = reInitiateRemark;
	}

	public String getAgreementNum() {
		return agreementNum;
	}

	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public String getGoldRole() {
		return goldRole;
	}

	public void setGoldRole(String goldRole) {
		this.goldRole = goldRole;
	}

	public String getAssignedQueueGroupId() {
		return assignedQueueGroupId;
	}

	public void setAssignedQueueGroupId(String assignedQueueGroupId) {
		this.assignedQueueGroupId = assignedQueueGroupId;
	}

	/*
	 * public AllocationInfo getAllocationInfo() { return allocationInfo; }
	 * 
	 * public void setAllocationInfo(AllocationInfo allocationInfo) {
	 * this.allocationInfo = allocationInfo; }
	 */

	/*
	 * public List<AllocationInfo> getAllocationInfoList() { return
	 * allocationInfoList; }
	 * 
	 * public void setAllocationInfoList(List<AllocationInfo> allocationInfoList) {
	 * this.allocationInfoList = allocationInfoList; }
	 */

	/*
	 * public List<CroJustification> getCroJustification() { return
	 * croJustification; }
	 * 
	 * public void setCroJustification(List<CroJustification> croJustification) {
	 * this.croJustification = croJustification; }
	 * 
	 * public ApplicationLog getApplicationLog() { return applicationLog; }
	 * 
	 * public void setApplicationLog(ApplicationLog applicationLog) {
	 * this.applicationLog = applicationLog; }
	 */

	public Set<String> getDedupedApplications() {
		return dedupedApplications;
	}

	public void setDedupedApplications(Set<String> dedupedApplications) {
		this.dedupedApplications = dedupedApplications;
	}

	/*
	 * public ComponentStatus getComponentStatus() { return componentStatus; }
	 * 
	 * public void setComponentStatus(ComponentStatus componentStatus) {
	 * this.componentStatus = componentStatus; }
	 * 
	 * public Vector<ModuleOutcome> getApplScoreVector() { return applScoreVector; }
	 * 
	 * public void setApplScoreVector(Vector<ModuleOutcome> applScoreVector) {
	 * this.applScoreVector = applScoreVector; }
	 * 
	 * public List<CroDecision> getCroDecisions() { return croDecisions; }
	 * 
	 * public void setCroDecisions(List<CroDecision> croDecisions) {
	 * this.croDecisions = croDecisions; }
	 * 
	 * public TvrDetails getTvrDetails() { return tvrDetails; }
	 * 
	 * public void setTvrDetails(TvrDetails tvrDetails) { this.tvrDetails =
	 * tvrDetails; }
	 * 
	 * public InterimStatus getIntrimStatus() { return intrimStatus; }
	 * 
	 * public void setIntrimStatus(InterimStatus intrimStatus) { this.intrimStatus =
	 * intrimStatus; }
	 */

	/**
	 * @return the reProcessCount
	 */
	public int getReProcessCount() {
		return reProcessCount;
	}

	/**
	 * @param reProcessCount the reProcessCount to set
	 */
	public void setReProcessCount(int reProcessCount) {
		this.reProcessCount = reProcessCount;
	}

	/*
	 * public ApplicationRequest getApplicationRequest() { return
	 * applicationRequest; }
	 * 
	 * public void setApplicationRequest(ApplicationRequest applicationRequest) {
	 * this.applicationRequest = applicationRequest; }
	 * 
	 * public ComponentResponse getApplicantComponentResponse() { return
	 * applicantComponentResponse; }
	 * 
	 * public void setApplicantComponentResponse(ComponentResponse
	 * applicantComponentResponse) { this.applicantComponentResponse =
	 * applicantComponentResponse; }
	 * 
	 * public List<ComponentResponse> getApplicantComponentResponseList() { return
	 * applicantComponentResponseList; }
	 * 
	 * public void setApplicantComponentResponseList(List<ComponentResponse>
	 * applicantComponentResponseList) { this.applicantComponentResponseList =
	 * applicantComponentResponseList; }
	 */

	public String getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(String applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public String getGngRefId() {
		return gngRefId;
	}

	public void setGngRefId(String gngRefId) {
		this.gngRefId = gngRefId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(boolean statusFlag) {
		this.statusFlag = statusFlag;
	}

	public boolean isNegativePincode() {
		return negativePincode;
	}

	public void setNegativePincode(boolean negativePincode) {
		this.negativePincode = negativePincode;
	}

	/*
	 * public LOSDetails getLosDetails() { return losDetails; }
	 * 
	 * public void setLosDetails(LOSDetails losDetails) { this.losDetails =
	 * losDetails;
	 */

	/**
	 * @return the workFlowDetails
	 */
	/*
	 * public WorkFlowDetails getWorkFlowDetails() { return workFlowDetails; }
	 */

	/**
	 * @param workFlowDetails the workFlowDetails to set
	 */
	/*
	 * public void setWorkFlowDetails(WorkFlowDetails workFlowDetails) {
	 * this.workFlowDetails = workFlowDetails; }
	 * 
	 * public InvoiceDetails getInvoiceDetails() { return invoiceDetails; }
	 * 
	 * public void setInvoiceDetails(InvoiceDetails invoiceDetails) {
	 * this.invoiceDetails = invoiceDetails; }
	 */

	/**
	 * @return the isReappraiseReq
	 */
	public boolean isReappraiseReq() {
		return reappraiseReq;
	}

	/**
	 * @param isReappraiseReq the isReappraiseReq to set
	 */
	public void setReappraiseReq(boolean isReappraiseReq) {
		this.reappraiseReq = isReappraiseReq;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public String getRootID() {
		return rootID;
	}

	public void setRootID(String rootID) {
		this.rootID = rootID;
	}

	public int getProductSequenceNumber() {
		return productSequenceNumber;
	}

	public void setProductSequenceNumber(int productSequenceNumber) {
		this.productSequenceNumber = productSequenceNumber;
	}

	/*
	 * public DisbursementDetails getDisbursementDetails() { return
	 * disbursementDetails; }
	 * 
	 * public void setDisbursementDetails(DisbursementDetails disbursementDetails) {
	 * this.disbursementDetails = disbursementDetails; }
	 * 
	 * public Map<String, CompletionInfo> getCompleted() { return completed; }
	 */

	public boolean isCallMbSobreForLead() {
		return callMbSobreForLead;
	}

	public void setCallMbSobreForLead(boolean callMbSobreForLead) {
		this.callMbSobreForLead = callMbSobreForLead;
	}

	/*
	 * public void setCompleted(Map<String, CompletionInfo> completed) {
	 * this.completed = completed; }
	 * 
	 * public Lead getLead() { return lead; }
	 * 
	 * public void setLead(Lead lead) { this.lead = lead; }
	 */

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCalculatedExcel() {
		return calculatedExcel;
	}

	public void setCalculatedExcel(String calculatedExcel) {
		this.calculatedExcel = calculatedExcel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GoNoGoCustomerApplication [gngRefId=");
		builder.append(gngRefId);
		builder.append(", parentID=");
		builder.append(parentID);
		builder.append(", rootID=");
		builder.append(rootID);
		builder.append(", productSequenceNumber=");
		builder.append(productSequenceNumber);
		builder.append(", dateTime=");
		builder.append(dateTime);
		builder.append(", applicationStatus=");
		builder.append(applicationStatus);
		builder.append(", statusFlag=");
		builder.append(statusFlag);
		builder.append(", reInitiateCount=");
		builder.append(reInitiateCount);
		builder.append(", reappraiseReq=");
		builder.append(reappraiseReq);
		builder.append(", reInitiateRemark=");
		builder.append(reInitiateRemark);
		builder.append(", agreementNum=");
		builder.append(agreementNum);
		builder.append(", applicationRequest=");
	
		builder.append(", applicantComponentResponse=");
	
		builder.append(", applicantComponentResponseList=");
		
		builder.append(", intrimStatus=");
	
		builder.append(", croDecisions=");

		builder.append(", negativePincode=");
		builder.append(negativePincode);
		builder.append(", workFlowDetails=");
		
		builder.append(", applScoreVector=");
		
		builder.append(", applicationLog=");
		
		builder.append(", componentStatus=");
	
		builder.append(", dedupedApplications=");
		builder.append(dedupedApplications);
		builder.append(", croJustification=");
	
		builder.append(", losDetails=");
	
		builder.append(", invoiceDetails=");
	
		builder.append("]");
		return builder.toString();
	}

	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if
	 * (!(o instanceof GoNoGoCustomerApplication)) return false; if
	 * (!super.equals(o)) return false; GoNoGoCustomerApplication that =
	 * (GoNoGoCustomerApplication) o; return getProductSequenceNumber() ==
	 * that.getProductSequenceNumber() && isStatusFlag() == that.isStatusFlag() &&
	 * getReInitiateCount() == that.getReInitiateCount() && isReappraiseReq() ==
	 * that.isReappraiseReq() && getReProcessCount() == that.getReProcessCount() &&
	 * isNegativePincode() == that.isNegativePincode() //&&
	 * Objects.equals(getIntrimStatus(), that.getIntrimStatus()) &&
	 * Objects.equals(getGngRefId(), that.getGngRefId()) &&
	 * Objects.equals(getParentID(), that.getParentID()) &&
	 * Objects.equals(getRootID(), that.getRootID()) &&
	 * Objects.equals(getDateTime(), that.getDateTime()) &&
	 * Objects.equals(getApplicationStatus(), that.getApplicationStatus()) &&
	 * Objects.equals(getReInitiateRemark(), that.getReInitiateRemark()) &&
	 * Objects.equals(getAgreementNum(), that.getAgreementNum())
	 * 
	 * }
	 */

	/*
	 * @Override public int hashCode() { return Objects.hash(super.hashCode(),
	 * getIntrimStatus(), getGngRefId(), getParentID(), getRootID(),
	 * getProductSequenceNumber(), getDateTime(), getApplicationStatus(),
	 * isStatusFlag(), getReInitiateCount(), isReappraiseReq(), getReProcessCount(),
	 * getReInitiateRemark(), getAgreementNum(), getApplicationRequest(),
	 * getApplicantComponentResponse(), getApplicantComponentResponseList(),
	 * getCroDecisions(), isNegativePincode(), getWorkFlowDetails(),
	 * getApplScoreVector(), getApplicationLog(), getComponentStatus(),
	 * getDedupedApplications(), getCroJustification(), getLosDetails(),
	 * getInvoiceDetails()); }
	 */
}
