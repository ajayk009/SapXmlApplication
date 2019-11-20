package com.softcell.gonogo.model.request.core;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import org.springframework.data.annotation.Transient;

/**
 * @author kishor
 */

public class Header implements Serializable {

	@JsonProperty("sAppID")
	private String applicationId;

	@JsonProperty("sInstID")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.FetchGrp.class, Header.FetchWithDealerCriteriaGrp.class,
			Header.DsaGrp.class, Header.InstWithProductGrp.class, Header.InsertWithoutDealerGrp.class,
			Header.InstWithDsaGrp.class, Header.InstDealerProductGrp.class, Header.InsertGroup.class })
	private String institutionId;

	@JsonProperty("sSourceID")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.DsaGrp.class, Header.InsertWithoutDealerGrp.class })
	private String sourceId;

	@JsonProperty("sAppSource")
	@NotEmpty(groups = { Header.AppSourceGrp.class, Header.InsertGrp.class, Header.DsaGrp.class,
			Header.InsertWithoutDealerGrp.class })
	private String applicationSource;

	@JsonProperty("sReqType")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.DsaGrp.class, Header.InsertWithoutDealerGrp.class,
			Header.InsertGroup.class })
	private String requestType;

	@JsonProperty("dtSubmit")
	@CreatedDate
	private Date dateTime = new Date();

	@JsonProperty("sDsaId")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.DsaGrp.class, Header.InsertWithoutDealerGrp.class,
			Header.InstWithDsaGrp.class, Header.InsertGroup.class })
	private String dsaId;

	@JsonProperty("sCroId")
	private String croId;

	@JsonProperty("sDealerId")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.FetchWithDealerCriteriaGrp.class, Header.DsaGrp.class,
			Header.InstDealerProductGrp.class })
	private String dealerId;

	@JsonProperty("sBranchCode")
	private String branchCode;

	@Transient
	@JsonProperty("sLoginId")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.FetchGrp.class, Header.FetchWithDealerCriteriaGrp.class,
			Header.DsaGrp.class, Header.InstWithProductGrp.class, Header.InsertWithoutDealerGrp.class,
			Header.InstWithDsaGrp.class, Header.InstDealerProductGrp.class, Header.InsertGroup.class })
	private String loggedInUserId;

	@Transient
	@JsonProperty("sLoginRole")
	@NotEmpty(groups = { Header.InsertGrp.class, Header.FetchGrp.class, Header.FetchWithDealerCriteriaGrp.class,
			Header.DsaGrp.class, Header.InstWithProductGrp.class, Header.InsertWithoutDealerGrp.class,
			Header.InstWithDsaGrp.class, Header.InstDealerProductGrp.class, Header.InsertGroup.class })
	private String loggedInUserRole;

	@JsonProperty("sZone")
	private String zone;

	@JsonProperty("sBaseBranch")
	private String baseBranch;

	@JsonProperty("sUserRole")
	private String userRole;

	@JsonProperty("sUserName")
	private String userName;

	@JsonProperty("sLoginIdFullName")
	private String loginIdFullName;

	@JsonProperty("sPassword")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getBaseBranch() {
		return baseBranch;
	}

	public void setBaseBranch(String baseBranch) {
		this.baseBranch = baseBranch;
	}

	/**
	 * @return the deviceInfo
	 */

	/**
	 * @param deviceInfo the deviceInfo to set
	 */

	public String getDealerId() {
		return dealerId;
	}

	public void setDealerId(String dealerId) {
		this.dealerId = dealerId;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(String institutionId) {
		this.institutionId = institutionId;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getApplicationSource() {
		return applicationSource;
	}

	public void setApplicationSource(String applicationSource) {
		this.applicationSource = applicationSource;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getDsaId() {
		return dsaId;
	}

	public void setDsaId(String dsaId) {
		this.dsaId = dsaId;
	}

	public String getCroId() {
		return croId;
	}

	public void setCroId(String croId) {
		this.croId = croId;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getLoggedInUserId() {
		return loggedInUserId;
	}

	public void setLoggedInUserId(String loggedInUserId) {
		this.loggedInUserId = loggedInUserId;
	}

	public String getLoggedInUserRole() {
		return loggedInUserRole;
	}

	public void setLoggedInUserRole(String loggedInUserRole) {
		this.loggedInUserRole = loggedInUserRole;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
	 * == null || getClass() != o.getClass()) return false;
	 * 
	 * Header header = (Header) o;
	 * 
	 * if (applicationId != null ? !applicationId.equals(header.applicationId) :
	 * header.applicationId != null) return false; if (institutionId != null ?
	 * !institutionId.equals(header.institutionId) : header.institutionId != null)
	 * return false; if (sourceId != null ? !sourceId.equals(header.sourceId) :
	 * header.sourceId != null) return false; if (applicationSource != null ?
	 * !applicationSource.equals(header.applicationSource) :
	 * header.applicationSource != null) return false; if (requestType != null ?
	 * !requestType.equals(header.requestType) : header.requestType != null) return
	 * false; if (dateTime != null ? !dateTime.equals(header.dateTime) :
	 * header.dateTime != null) return false; if (dsaId != null ?
	 * !dsaId.equals(header.dsaId) : header.dsaId != null) return false; if (croId
	 * != null ? !croId.equals(header.croId) : header.croId != null) return false;
	 * if (dealerId != null ? !dealerId.equals(header.dealerId) : header.dealerId !=
	 * null) return false; if (branchCode != null ?
	 * !branchCode.equals(header.branchCode) : header.branchCode != null) return
	 * false; if (zone != null ? !zone.equals(header.zone) : header.zone != null)
	 * return false; if (product != header.product) return false; return deviceInfo
	 * != null ? deviceInfo.equals(header.deviceInfo) : header.deviceInfo == null; }
	 */

	@Override
	public int hashCode() {
		int result = applicationId != null ? applicationId.hashCode() : 0;
		result = 31 * result + (institutionId != null ? institutionId.hashCode() : 0);
		result = 31 * result + (sourceId != null ? sourceId.hashCode() : 0);
		result = 31 * result + (applicationSource != null ? applicationSource.hashCode() : 0);
		result = 31 * result + (requestType != null ? requestType.hashCode() : 0);
		result = 31 * result + (dateTime != null ? dateTime.hashCode() : 0);
		result = 31 * result + (dsaId != null ? dsaId.hashCode() : 0);
		result = 31 * result + (croId != null ? croId.hashCode() : 0);
		result = 31 * result + (dealerId != null ? dealerId.hashCode() : 0);
		result = 31 * result + (branchCode != null ? branchCode.hashCode() : 0);
		result = 31 * result + (zone != null ? zone.hashCode() : 0);
	
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Header{");
		sb.append("applicationId='").append(applicationId).append('\'');
		sb.append(", institutionId='").append(institutionId).append('\'');
		sb.append(", sourceId='").append(sourceId).append('\'');
		sb.append(", applicationSource='").append(applicationSource).append('\'');
		sb.append(", requestType='").append(requestType).append('\'');
		sb.append(", dateTime=").append(dateTime);
		sb.append(", dsaId='").append(dsaId).append('\'');
		sb.append(", croId='").append(croId).append('\'');
		sb.append(", dealerId='").append(dealerId).append('\'');
		sb.append(", branchCode='").append(branchCode).append('\'');
	
		sb.append('}');
		return sb.toString();
	}

	public String getLoginIdFullName() {
		return loginIdFullName;
	}

	public void setLoginIdFullName(String loginIdFullName) {
		this.loginIdFullName = loginIdFullName;
	}

	public interface InsertGrp {
	}

	public interface FetchGrp {
	}

	public interface FetchWithDealerCriteriaGrp {
	}

	public interface AppSourceGrp {
	}

	public interface InstWithProductGrp {
	}

	public interface DsaGrp {
	}

	public interface InsertWithoutDealerGrp {
	}

	public interface InstWithDsaGrp {

	}

	public interface InstDealerProductGrp {

	}

	public interface InstWithBranchGrp {

	}

	public interface InsertGroup {

	}
}
