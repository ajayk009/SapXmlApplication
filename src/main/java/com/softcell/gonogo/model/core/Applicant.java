package com.softcell.gonogo.model.core;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.softcell.gonogo.model.address.CustomerAddress;
import com.softcell.gonogo.model.contact.Email;
import com.softcell.gonogo.model.contact.Phone;
import com.softcell.gonogo.model.core.Name;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.annotation.Transient;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.*;

/**
 * @author yogeshb
 */
public class Applicant implements Serializable {

	@JsonProperty("sApplID")
	private String applicantId;

	// Applicant /Coapplicant /Guarantor / Group of Companies
	@JsonProperty("sEntityType")
	private String entityType = "Primary";

	@JsonProperty("oApplName")
	private Name applicantName;

	@JsonProperty("oFatherName")
	private Name fatherName;

	@JsonProperty("oSpouseName")
	private Name spouseName;

	@JsonProperty("oMotherName")
	private Name motherName;

	@JsonProperty("sMothersMaidenName")
	private String mothersMaidenName;

	@JsonProperty("sReligion")
	private String religion;

	@JsonProperty("sCaste")
	private String caste;

	@JsonProperty("sApplGndr")
	private String gender;

	@JsonProperty("sDob")
	@Past
	private String dateOfBirth;

	@JsonProperty("iAge")
	private int age;

	@JsonProperty("sMarStat")
	private String maritalStatus;

	@JsonProperty("sNationality")
	private String nationality;

	@JsonProperty("sOtherNationality")
	private String sOthrNationality;

	@JsonProperty("sResiStatus")
	private String residenceStatus;

	@JsonProperty("sDesignation")
	private String designation;

	@JsonProperty("bSameAbove")
	private boolean residenceAddSameAsAbove;

	@JsonProperty("aAddr")
	private List<CustomerAddress> address;

	@JsonProperty("aPhone")
	private List<Phone> phone;

	@JsonProperty("aEmail")
	private List<Email> email;

	@JsonProperty("iNoOfDep")
	private int noOfDependents;

	@JsonProperty("iNoOfChildren")
	private int iNoOfChildren;

	@JsonProperty("iEarnMem")
	private int noOfEarningMembers;

	@JsonProperty("iFamilyMem")
	private int noOfFamilyMembers;

	@JsonProperty("sEdu")
	private String education;

	@JsonProperty("sCreditCardNum")
	private String creditCardNumber;

	@JsonProperty("aCreditCardLnAccNumbers")
	private List<String> creditCardLnAccNumbers;

	@JsonProperty("bMobVer")
	private boolean mobileVerified;

	@JsonProperty("bAdharVer")
	@Field("addharVerified")
	private boolean aadhaarVerified;

	@JsonProperty("sHasBankAccount")
	private String hasBankAccount;

	// Individual/Proprietorship/Partnership/Pvt Ltd/Ltd
	@JsonProperty("sType")
	private String applicantType;

	@JsonProperty("sApplicantType")
	private String customerType;

	@JsonProperty("bConsentToCall")
	private boolean consentToCall;

	@JsonProperty("sContactPerson")
	private String contactPerson;

	@JsonProperty("sGstNo")
	private String gstNo;

	@JsonProperty("bGstStatus")
	private boolean gstStatus;

	@JsonProperty("iPartnerDirector")
	private int partnerDirector;

	// Whether verified or not
	@JsonProperty("bTanStatus")
	private boolean tanStatus;

	// Tax Identification Number
	@JsonProperty("sTinNo")
	private String tinNo;

	@JsonProperty("sTanNo")
	private String tanNo;

	@JsonProperty("bMinor")
	private boolean minor;

	@JsonProperty("sPlaceOfBirth")
	private String placeOfBirth;

	@JsonProperty("bPhysicallyHandicapped")
	private boolean physicallyHandicapped;

	@JsonProperty("sOtherNatureOccupation")
	private String otherNatureOccupation;

	// TODO : Migrate to
	@JsonProperty("bCreditVidyaFlag")
	private boolean creditVidyaFlag;

	@JsonProperty("sPropertyNature")
	private String propertyNature;

	@JsonProperty("iAgeDuringMatOfLoan")
	private int ageDuringMaturityOfLoan;

	@JsonProperty("sCustomerID")
	private String customerID;

	@JsonProperty("bGurantees")
	private boolean guarantees = true;

	@JsonProperty("sPDCDetails")
	private String pdcDetails;

	@JsonProperty("dStakeHolding")
	private double stakeHolding;

	// for sending to sobre
	@JsonProperty("sCurrentStage")
	private String currentStage;

	@JsonProperty("sUdyogAdhaar")
	private String udyogAdhaar;

	@JsonProperty("bUdyogVerified")
	private boolean udyogVerified;

	@JsonProperty("sDoi")
	@Past
	private String doi;

	@JsonProperty("sRemark")
	private String remark;

	@JsonProperty("aGstNoValues")
	private List<String> gstNoValues;

	@JsonProperty("aStakeHolder")
	private List<String> stakeHolders;

	@JsonProperty("sTrackRecord")
	private String trackRecord;

	@JsonProperty("sGroupCode")
	private String groupcode;

	// for ABMU
	@JsonProperty("bCreditCard")
	private boolean creditCard;

	@JsonProperty("aSavingBankName")
	private List<String> savingbankName;

	@JsonProperty("bApplicantCompleteness")
	private boolean applicantCompleteness;

	@JsonProperty("sReferencePersonName")
	private String referencePersonName;

	@JsonProperty("sReferencePersonMobile")
	private String referencePersonMobile;

	@JsonProperty("aPSLSub")
	private List<String> pslSubList;

	@JsonProperty("sPSL")
	private String psl;

	@JsonProperty("sPrefCommChannel")
	private String prefCommChannel;

	@JsonProperty("sPrefAddrCorr")
	private String prefAddrCorr;

	@JsonProperty("sPreferredLanguage")
	private String preferredLanguage;

	@JsonProperty("sSpecialProfileIndicator")
	private String specialProfileIndicator;

	@JsonProperty("aRelativeName")
	private List<Name> relativeNameList;

	@JsonProperty("sPlaceBirth")
	private String placeBirth;

	@JsonProperty("sCOB")
	private String cob;

	@JsonProperty("sMinority")
	private String minority;

	@JsonProperty("sPhysicallyChallenged")
	private String physicallyChallenged;

	// ABMUFIELD
	@JsonProperty("sSalaryBankName")
	private String salaryBankName;

	@JsonProperty("bNumRegWithBank")
	boolean isNumRegWithBank = false;

	/**
	 * this is testing field for ABMU delete after
	 * 
	 * @return
	 */

	@JsonProperty("sPanValidation")
	private String panValidation;

	@JsonProperty("sBureauOneScore")
	private String bureauOneScore;

	@JsonProperty("sCibilScore")
	private String cibilScore;

	@JsonProperty("aFaceMatchDetailsKeys")
	private List<String> faceMatchDetailsKeysList;

	@JsonProperty("sEPFO")
	private String epfo;

	@JsonProperty("sNicCode")
	private String nicCode;

	@JsonProperty("sIndustry")
	private String industry;

	@JsonProperty("sNameOfOrg")
	private String nameOfOrg;

	@JsonProperty("sProductMade")
	private String ProductMade;

	@JsonProperty("sChangeInCompName")
	private String ChangeInCompName;

	@JsonProperty("aMainMachinesInstalled")
	private List<String> MainMachinesInstalled;
	/**
	 * ABFL fields
	 */

	@JsonProperty("sCollege")
	private String college;

	@JsonProperty("sOrgSector")
	private String orgSector;

	@JsonProperty("sTypeOfBusnes")
	private String typeOfBusnes;

	@JsonProperty("sOrgIndustry")
	private String orgIndustry;

	@JsonProperty("sOrgItem")
	private String orgItem;

	@JsonProperty("sCustNetWorth")
	private String custNetWorth;

	@JsonProperty("sNetWorthDate")
	private String snetWorthDate;

	@JsonProperty("sSrcOfNetWorth")
	private String srcOfNetWorth;

	@JsonProperty("sCustRiskRating")
	private String custRiskRating;

	@JsonProperty("sKycRenewlDate")
	private String kycRenewlDate;

	@JsonProperty("sPreferedLangOfComm")
	private String preferedLangOfComm;

	@JsonProperty("sRelatedToAbflEmployee")
	private String relatedToAbflEmployee;

	@JsonProperty("sRelEmpName")
	private String relEmpName;

	@JsonProperty("sRelEmpDesignation")
	private String relEmpDesignation;

	@JsonProperty("sEmpDtlStaff")
	private String empDtlStaff;

	@JsonProperty("sEmpDtlGroupId")
	private String empDtlGroupId;

	@JsonProperty("sEmpDtlGroupName")
	private String empDtlGroupName;

	@JsonProperty("sKycAvailable")
	private String kycAvailable;

	@JsonProperty("sKycUidNo")
	private String kycUidNo;

	@JsonProperty("sKycEnrollNo")
	private String kycEnrollNo;

	@JsonProperty("sKycEnrollDate")
	private String kycEnrollDate;

	@JsonProperty("sKycEnrollTime")
	private String kycEnrollTime;

	@JsonProperty("sEmpIndustryType")
	private String empIndustryType;

	@JsonProperty("sEmpSalariedSector")
	private String empSalariedSector;

	@JsonProperty("sNoOfSalariedEmp")
	private String noOfSalariedEmp;

	@JsonProperty("sEmpRetireAge")
	private String empRetireAge;

	@JsonProperty("sSalariedEmpStatus")
	private String salariedEmpStatus;

	@JsonProperty("sSalariedEmpId")
	private String salariedEmpId;

	@JsonProperty("sSalariedEmpDept")
	private String salariedEmpDept;

	@JsonProperty("sSalariedEmpDesi")
	private String salariedEmpDesi;

	@JsonProperty("sSalariedEmpFrom")
	private String salariedEmpFrom;

	@JsonProperty("sContactDtlEmailId")
	private String contactDtlEmailId;

	@JsonProperty("sSelfEmpSector")
	private String selfEmpSector;

	@JsonProperty("sSelfEmpNatureOfBusns")
	private String selfEmpNatureOfBusns;

	@JsonProperty("sSelfEmpNoOfPartners")
	private String selfEmpNoOfPartners;

	@JsonProperty("sSelfEmpOwnership")
	private String selfEmpOwnership;

	@JsonProperty("sSelfNoOfEmp")
	private String selfNoOfEmp;

	@JsonProperty("sSelfEmpApplicantDesi")
	private String selfEmpApplicantDesi;

	@JsonProperty("bCautionProfile")
	private boolean cautionProfile;

	@JsonProperty("bGeolocation")
	private boolean geoLocation;

	@JsonProperty("bBusnesGeolocation")
	private boolean businessGeoLocation;

	@JsonProperty("sRelatedToEmp")
	private String relatedToEmp;

	@JsonProperty("sEmpName")
	private String empName;

	@JsonProperty("sEmpDesignation")
	private String empDesignation;

	@JsonProperty("sOtherVDs")
	private String otherVDs;

	@JsonProperty("bNonFinance")
	private boolean nonFinance;

	// AVFS
	@JsonProperty("bDedupeStat")
	private boolean dedupestat;

	@JsonProperty("sPrefMailingAddress")
	private String prefMailingAddress;

	@JsonProperty("oDependency")
	private HashMap<String, Object> dependency;

	@JsonProperty("sResidentialStatus")
	private String residentialStatus;

	@JsonProperty("sOccupationType")
	private String occupatonType;

	@JsonProperty("sTaxIdNumber")
	private boolean taxIdNumber;

	@JsonProperty("bPhysicalConsent")
	private boolean bPhysicalConsent;

	@JsonProperty("sRmName")
	private String rmName;

	@JsonProperty("sRmMobileNumber")
	private String rmMobileNumber;

	@JsonProperty("sSubConstitution")
	private String subConstitution;

	@JsonProperty("sFleetPivot")
	private String fleetPivot;

	@JsonProperty("sMajorMachineRemarks")
	private String majorMachineRemarks;

	@JsonProperty("sIECCode")
	private String iECCode;

	@JsonProperty("bIECVerified")
	private boolean iECVerified;

	@JsonProperty("sESICNumber")
	private String eSICNumber;

	@JsonProperty("bGstExmpted")
	private boolean gstExmpted;

	// avfs
	@JsonProperty("sVirtualAadhaar")
	private String virtualAadhaar;

	public boolean isGstExmpted() {
		return gstExmpted;
	}

	public void setGstExmpted(boolean gstExmpted) {
		this.gstExmpted = gstExmpted;
	}

	@JsonProperty("bDeclarationAffidavitRequired")
	private boolean declarationAffidavitRequired;

	public boolean isDeclarationAffidavitRequired() {
		return declarationAffidavitRequired;
	}

	public void setDeclarationAffidavitRequired(boolean declarationAffidavitRequired) {
		this.declarationAffidavitRequired = declarationAffidavitRequired;
	}

	public boolean isDedupestat() {
		return dedupestat;
	}

	public void setDedupestat(boolean dedupestat) {
		this.dedupestat = dedupestat;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String geteSICNumber() {
		return eSICNumber;
	}

	public void seteSICNumber(String eSICNumber) {
		this.eSICNumber = eSICNumber;
	}

	public String getiECCode() {
		return iECCode;
	}

	public void setiECCode(String iECCode) {
		this.iECCode = iECCode;
	}

	public boolean isiECVerified() {
		return iECVerified;
	}

	public void setiECVerified(boolean iECVerified) {
		this.iECVerified = iECVerified;
	}

	@JsonIgnore
	@Transient
	private List<Character> applName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> fName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> mName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> dob = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> doIncorp = new ArrayList<>();

	public List<Character> getDoIncorp() {
		return doIncorp;
	}

	public void setDoIncorp(List<Character> doIncorp) {
		this.doIncorp = doIncorp;
	}

	@JsonIgnore
	@Transient
	private List<Character> gstNumChar = new ArrayList<>();

	public List<Character> getGstNumChar() {
		return gstNumChar;
	}

	public void setGstNumChar(List<Character> gstNumChar) {
		this.gstNumChar = gstNumChar;
	}

	@JsonIgnore
	@Transient
	private List<Character> mobile;
	@JsonIgnore
	@Transient
	private List<Character> emailId;

	public List<Character> getEmailId() {
		return emailId;
	}

	public void setEmailId(List<Character> emailId) {
		this.emailId = emailId;
	}

	@JsonIgnore
	@Transient
	private List<Character> aadharNo = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> panNo = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> udyogNo = new ArrayList<>();

	@JsonProperty("sSSINo")
	private String ssiNo;

	@JsonProperty("dShareholdingPercent")
	private double shareholdingPercent;

	@JsonProperty("sCccNumber")
	private String cccNumber;

	@JsonProperty("bPdxExisting")
	private boolean posidexExistngCustmr;

	// TMF
	@JsonProperty("sBPNO")
	private String bpNumber;

	@JsonProperty("sOthIncomeSrc")
	private String othIncomeSrc;

	@JsonProperty("sTypeOfIncome")
	private String typeOfIncome;

	@JsonProperty("iBusinessTurnOvr")
	private Integer businessTurnOvr;

	@JsonProperty("iMonthlyIncome")
	private Integer monthlyIncome;

	@JsonProperty("sClassification")
	private String classification;

	@JsonProperty("sExistingTMFLCustomer")
	private String existingTMFLCust;

	@JsonProperty("sGstRegObtn")
	private String gstRegObtn;

	@JsonProperty("bIncomeTobeConsider")
	private boolean incomeTobeConsider;

	@JsonProperty("btoBeContacted")
	private boolean toBeContacted;

	@JsonProperty("sGreenChannel")
	private String greenChannel;

	@JsonProperty("sOtherDesignation")
	private String otherDesignation;

	@JsonProperty("sBusinessStability")
	private String businessStability;

	@JsonProperty("dRegNo")
	private double regNo;

	@JsonProperty("sRegWithAuthority")
	private String regWithAuthority;

	@JsonProperty("sRegistrationNo")
	private String registrationNo;

	@JsonProperty("dTrustees")
	private double trustees;

	@JsonProperty("dPartnersNo")
	private double partnersNo;

	@JsonProperty("dMembersNo")
	private double membersNo;

	@JsonProperty("dAnnualIncome")
	private double annualIncome;

	@JsonProperty("dDirectorsNo")
	private double directorsNo;

	@JsonProperty("sAgriLand")
	private String agriLand;

	@JsonProperty("sExistingLoanAccNumber")
	private String existingLoanAccNumber;

	@JsonProperty("sDedupeParameterName")
	private String dedupeParameterName;

	@JsonProperty("sDirectorName")
	private String directorName;

	@JsonProperty("sExecutiveSummary")
	private String executiveSummary;

	@JsonProperty("sDedupeStatus")
	private String dedupeStatus;

	@JsonProperty("aDedupeMatchValue")
	private List<String> dedupeMatchValue;

	@JsonProperty("bVerified")
	private boolean verified;

	@JsonProperty("bApplAddFromSign")
	private boolean applAddFromSign;

	public boolean isApplAddFromSign() {
		return applAddFromSign;
	}

	public void setApplAddFromSign(boolean applAddFromSign) {
		this.applAddFromSign = applAddFromSign;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	@JsonIgnore
	@Transient
	private List<Character> religionName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> casteName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> preferredLanguageName = new ArrayList<>();
	@JsonIgnore
	@Transient
	private List<Character> cobName = new ArrayList<>();

	public boolean isBusinessGeoLocation() {
		return businessGeoLocation;
	}

	public void setBusinessGeoLocation(boolean businessGeoLocation) {
		this.businessGeoLocation = businessGeoLocation;
	}

	@JsonProperty("sBusinessDetail")
	private String businessDetail;

	@JsonProperty("sCINSearch")
	private String cinSearch;

	public String getCampaignNameOthers() {
		return campaignNameOthers;
	}

	public void setCampaignNameOthers(String campaignNameOthers) {
		this.campaignNameOthers = campaignNameOthers;
	}

	@JsonProperty("sCampaignName_others")
	private String campaignNameOthers;

	public String getCinSearch() {
		return cinSearch;
	}

	public void setCinSearch(String cinSearch) {
		this.cinSearch = cinSearch;
	}

	public String getBusinessDetail() {
		return businessDetail;
	}

	public void setBusinessDetail(String businessDetail) {
		this.businessDetail = businessDetail;
	}

	public List<Character> getCobName() {
		return cobName;
	}

	public void setCobName(List<Character> cobName) {
		this.cobName = cobName;
	}

	public List<Character> getReligionName() {
		return religionName;
	}

	public void setReligionName(List<Character> religionName) {
		this.religionName = religionName;
	}

	public List<Character> getCasteName() {
		return casteName;
	}

	public void setCasteName(List<Character> casteName) {
		this.casteName = casteName;
	}

	public List<Character> getPreferredLanguageName() {
		return preferredLanguageName;
	}

	public void setPreferredLanguageName(List<Character> preferredLanguageName) {
		this.preferredLanguageName = preferredLanguageName;
	}

	@Transient
	@JsonProperty("sReplaceCustId")
	private String replaceCustId;

	@JsonProperty("sPotentialId")
	private String potentialId;

	@JsonProperty("sMigratedCustId")
	private String migratedCustId;

	@JsonProperty("sSource")
	public String sourceSystem;

	// Fields for HDFC

	@JsonProperty("dEquipmentValue")
	private double equipmentValue;

	@JsonProperty("sUploadStatement")
	private String uploadStatement;

	/**
	 * for Efl dedupe
	 */
	@JsonProperty("bHasChange")
	private boolean runDedupe;

	@JsonProperty("sUAN")
	public String uan;

	@JsonProperty("bUANVerified")
	public boolean uanVerified;

	@JsonProperty("bImaCertificateChk")
	public boolean imaCertificateChk;

	@JsonProperty("sSpecilization")
	public String specilization;

	@JsonProperty("sTypeOfPractice")
	public String typeOfPractice;

	// For EFL

	@Transient
	@JsonProperty("sCaseId")
	private String caseId;

	// for Abfl cmr flag for cibil
	@JsonProperty("bBureauScore")
	private boolean cibilTrigger;

	@JsonProperty("bCMR")
	private boolean cmr;

	@JsonProperty("bCoOperative")
	private boolean coOperative;

	// for Abfl posidex error
	@JsonProperty("sPosidexError")
	public String posidexError;

	// for TMFL applicant level fiStatus
	@JsonProperty("sFiStatus")
	private String fiStatus;

	@JsonProperty("sRiskCat")
	private String riskCat;

	@JsonProperty("sRelativeType")
	private String relativeType;

	@JsonProperty("sBueroRemarks")
	private String bueroRemarks;

	public String getBueroRemarks() {
		return bueroRemarks;
	}

	public void setBueroRemarks(String bueroRemarks) {
		this.bueroRemarks = bueroRemarks;
	}

	public String getOrgSector() {
		return orgSector;
	}

	public void setOrgSector(String orgSector) {
		this.orgSector = orgSector;
	}

	public String getTypeOfBusnes() {
		return typeOfBusnes;
	}

	public void setTypeOfBusnes(String typeOfBusnes) {
		this.typeOfBusnes = typeOfBusnes;
	}

	public String getOrgIndustry() {
		return orgIndustry;
	}

	public void setOrgIndustry(String orgIndustry) {
		this.orgIndustry = orgIndustry;
	}

	public String getOrgItem() {
		return orgItem;
	}

	public void setOrgItem(String orgItem) {
		this.orgItem = orgItem;
	}

	public String getCustNetWorth() {
		return custNetWorth;
	}

	public void setCustNetWorth(String custNetWorth) {
		this.custNetWorth = custNetWorth;
	}

	public String getSnetWorthDate() {
		return snetWorthDate;
	}

	public void setSnetWorthDate(String snetWorthDate) {
		this.snetWorthDate = snetWorthDate;
	}

	public String getSrcOfNetWorth() {
		return srcOfNetWorth;
	}

	public void setSrcOfNetWorth(String srcOfNetWorth) {
		this.srcOfNetWorth = srcOfNetWorth;
	}

	public String getCustRiskRating() {
		return custRiskRating;
	}

	public void setCustRiskRating(String custRiskRating) {
		this.custRiskRating = custRiskRating;
	}

	public String getKycRenewlDate() {
		return kycRenewlDate;
	}

	public void setKycRenewlDate(String kycRenewlDate) {
		this.kycRenewlDate = kycRenewlDate;
	}

	public String getPreferedLangOfComm() {
		return preferedLangOfComm;
	}

	public void setPreferedLangOfComm(String preferedLangOfComm) {
		this.preferedLangOfComm = preferedLangOfComm;
	}

	public String getRelatedToAbflEmployee() {
		return relatedToAbflEmployee;
	}

	public void setRelatedToAbflEmployee(String relatedToAbflEmployee) {
		this.relatedToAbflEmployee = relatedToAbflEmployee;
	}

	public String getVirtualAadhaar() {
		return virtualAadhaar;
	}

	public void setVirtualAadhaar(String virtualAadhaar) {
		this.virtualAadhaar = virtualAadhaar;
	}

	public String getRelEmpName() {
		return relEmpName;
	}

	public void setRelEmpName(String relEmpName) {
		this.relEmpName = relEmpName;
	}

	public String getRelEmpDesignation() {
		return relEmpDesignation;
	}

	public void setRelEmpDesignation(String relEmpDesignation) {
		this.relEmpDesignation = relEmpDesignation;
	}

	public String getEmpDtlStaff() {
		return empDtlStaff;
	}

	public void setEmpDtlStaff(String empDtlStaff) {
		this.empDtlStaff = empDtlStaff;
	}

	public String getEmpDtlGroupId() {
		return empDtlGroupId;
	}

	public void setEmpDtlGroupId(String empDtlGroupId) {
		this.empDtlGroupId = empDtlGroupId;
	}

	public String getEmpDtlGroupName() {
		return empDtlGroupName;
	}

	public void setEmpDtlGroupName(String empDtlGroupName) {
		this.empDtlGroupName = empDtlGroupName;
	}

	public String getKycAvailable() {
		return kycAvailable;
	}

	public void setKycAvailable(String kycAvailable) {
		this.kycAvailable = kycAvailable;
	}

	public String getKycUidNo() {
		return kycUidNo;
	}

	public void setKycUidNo(String kycUidNo) {
		this.kycUidNo = kycUidNo;
	}

	public String getKycEnrollNo() {
		return kycEnrollNo;
	}

	public void setKycEnrollNo(String kycEnrollNo) {
		this.kycEnrollNo = kycEnrollNo;
	}

	public String getKycEnrollDate() {
		return kycEnrollDate;
	}

	public void setKycEnrollDate(String kycEnrollDate) {
		this.kycEnrollDate = kycEnrollDate;
	}

	public String getKycEnrollTime() {
		return kycEnrollTime;
	}

	public void setKycEnrollTime(String kycEnrollTime) {
		this.kycEnrollTime = kycEnrollTime;
	}

	public String getEmpIndustryType() {
		return empIndustryType;
	}

	public void setEmpIndustryType(String empIndustryType) {
		this.empIndustryType = empIndustryType;
	}

	public String getEmpSalariedSector() {
		return empSalariedSector;
	}

	public void setEmpSalariedSector(String empSalariedSector) {
		this.empSalariedSector = empSalariedSector;
	}

	public String getNoOfSalariedEmp() {
		return noOfSalariedEmp;
	}

	public void setNoOfSalariedEmp(String noOfSalariedEmp) {
		this.noOfSalariedEmp = noOfSalariedEmp;
	}

	public String getEmpRetireAge() {
		return empRetireAge;
	}

	public void setEmpRetireAge(String empRetireAge) {
		this.empRetireAge = empRetireAge;
	}

	public String getSalariedEmpStatus() {
		return salariedEmpStatus;
	}

	public void setSalariedEmpStatus(String salariedEmpStatus) {
		this.salariedEmpStatus = salariedEmpStatus;
	}

	public String getSalariedEmpId() {
		return salariedEmpId;
	}

	public void setSalariedEmpId(String salariedEmpId) {
		this.salariedEmpId = salariedEmpId;
	}

	public String getSalariedEmpDept() {
		return salariedEmpDept;
	}

	public void setSalariedEmpDept(String salariedEmpDept) {
		this.salariedEmpDept = salariedEmpDept;
	}

	public String getSalariedEmpDesi() {
		return salariedEmpDesi;
	}

	public void setSalariedEmpDesi(String salariedEmpDesi) {
		this.salariedEmpDesi = salariedEmpDesi;
	}

	public String getSalariedEmpFrom() {
		return salariedEmpFrom;
	}

	public void setSalariedEmpFrom(String salariedEmpFrom) {
		this.salariedEmpFrom = salariedEmpFrom;
	}

	public String getContactDtlEmailId() {
		return contactDtlEmailId;
	}

	public void setContactDtlEmailId(String contactDtlEmailId) {
		this.contactDtlEmailId = contactDtlEmailId;
	}

	public String getSelfEmpSector() {
		return selfEmpSector;
	}

	public void setSelfEmpSector(String selfEmpSector) {
		this.selfEmpSector = selfEmpSector;
	}

	public String getSelfEmpNatureOfBusns() {
		return selfEmpNatureOfBusns;
	}

	public void setSelfEmpNatureOfBusns(String selfEmpNatureOfBusns) {
		this.selfEmpNatureOfBusns = selfEmpNatureOfBusns;
	}

	public String getSelfEmpNoOfPartners() {
		return selfEmpNoOfPartners;
	}

	public void setSelfEmpNoOfPartners(String selfEmpNoOfPartners) {
		this.selfEmpNoOfPartners = selfEmpNoOfPartners;
	}

	public String getSelfEmpOwnership() {
		return selfEmpOwnership;
	}

	public void setSelfEmpOwnership(String selfEmpOwnership) {
		this.selfEmpOwnership = selfEmpOwnership;
	}

	public String getSelfNoOfEmp() {
		return selfNoOfEmp;
	}

	public void setSelfNoOfEmp(String selfNoOfEmp) {
		this.selfNoOfEmp = selfNoOfEmp;
	}

	public String getSelfEmpApplicantDesi() {
		return selfEmpApplicantDesi;
	}

	public void setSelfEmpApplicantDesi(String selfEmpApplicantDesi) {
		this.selfEmpApplicantDesi = selfEmpApplicantDesi;
	}

	public boolean isCautionProfile() {
		return cautionProfile;
	}

	public void setCautionProfile(boolean cautionProfile) {
		this.cautionProfile = cautionProfile;
	}

	public boolean isGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(boolean geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getRelatedToEmp() {
		return relatedToEmp;
	}

	public void setRelatedToEmp(String relatedToEmp) {
		this.relatedToEmp = relatedToEmp;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getOtherVDs() {
		return otherVDs;
	}

	public void setOtherVDs(String otherVDs) {
		this.otherVDs = otherVDs;
	}

	public String getGroupcode() {
		return groupcode;
	}

	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getUploadStatement() {
		return uploadStatement;
	}

	public void setUploadStatement(String uploadStatement) {
		this.uploadStatement = uploadStatement;
	}

	public String getPosidexError() {
		return posidexError;
	}

	public void setPosidexError(String posidexError) {
		this.posidexError = posidexError;
	}

	public boolean isCibilTrigger() {
		return cibilTrigger;
	}

	public void setCibilTrigger(boolean cibilTrigger) {
		this.cibilTrigger = cibilTrigger;
	}

	public boolean isCmr() {
		return cmr;
	}

	public void setCmr(boolean cmr) {
		this.cmr = cmr;
	}

	public String getCaseId() {
		return caseId;
	}

	public void setCaseId(String caseId) {
		this.caseId = caseId;
	}

	public String getTypeOfPractice() {
		return typeOfPractice;
	}

	public void setTypeOfPractice(String typeOfPractice) {
		this.typeOfPractice = typeOfPractice;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public boolean isImaCertificateChk() {
		return imaCertificateChk;
	}

	public void setImaCertificateChk(boolean imaCertificateChk) {
		this.imaCertificateChk = imaCertificateChk;
	}

	public boolean isRunDedupe() {
		return runDedupe;
	}

	public void setRunDedupe(boolean runDedupe) {
		this.runDedupe = runDedupe;
	}

	public double getEquipmentValue() {
		return equipmentValue;
	}

	public void setEquipmentValue(double equipmentValue) {
		this.equipmentValue = equipmentValue;
	}

	public String getExecutiveSummary() {
		return executiveSummary;
	}

	public void setExecutiveSummary(String executiveSummary) {
		this.executiveSummary = executiveSummary;
	}

	public String getOtherDesignation() {
		return otherDesignation;
	}

	public void setOtherDesignation(String otherDesignation) {
		this.otherDesignation = otherDesignation;
	}

	public String getDedupeParameterName() {
		return dedupeParameterName;
	}

	public void setDedupeParameterName(String dedupeParameterName) {
		this.dedupeParameterName = dedupeParameterName;
	}

	public String getExistingLoanAccNumber() {
		return existingLoanAccNumber;
	}

	public void setExistingLoanAccNumber(String existingLoanAccNumber) {
		this.existingLoanAccNumber = existingLoanAccNumber;
	}

	public String getSourceSystem() {
		return sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public String getPotentialId() {
		return potentialId;
	}

	public void setPotentialId(String potentialId) {
		this.potentialId = potentialId;
	}

	public String getMigratedCustId() {
		return migratedCustId;
	}

	public void setMigratedCustId(String migratedCustId) {
		this.migratedCustId = migratedCustId;
	}

	public String getReplaceCustId() {
		return replaceCustId;
	}

	public void setReplaceCustId(String replaceCustId) {
		this.replaceCustId = replaceCustId;
	}

	public String getGreenChannel() {
		return greenChannel;
	}

	public void setGreenChannel(String greenChannel) {
		this.greenChannel = greenChannel;
	}

	public boolean isIncomeTobeCoonsider() {
		return incomeTobeConsider;
	}

	public void setIncomeTobeCoonsider(boolean incomeTobeCoonsider) {
		this.incomeTobeConsider = incomeTobeCoonsider;
	}

	public String getCccNumber() {
		return cccNumber;
	}

	public void setCccNumber(String cccNumber) {
		this.cccNumber = cccNumber;
	}

	public String getOthIncomeSrc() {
		return othIncomeSrc;
	}

	public void setOthIncomeSrc(String othIncomeSrc) {
		this.othIncomeSrc = othIncomeSrc;
	}

	public String getTypeOfIncome() {
		return typeOfIncome;
	}

	public void setTypeOfIncome(String typeOfIncome) {
		this.typeOfIncome = typeOfIncome;
	}

	public String getMajorMachineRemarks() {
		return majorMachineRemarks;
	}

	public void setMajorMachineRemarks(String majorMachineRemarks) {
		this.majorMachineRemarks = majorMachineRemarks;
	}

	public String getSubConstitution() {
		return subConstitution;
	}

	public void setSubConstitution(String subConstitution) {
		this.subConstitution = subConstitution;
	}

	public String getRmName() {
		return rmName;
	}

	public void setRmName(String rmName) {
		this.rmName = rmName;
	}

	public String getRmMobileNumber() {
		return rmMobileNumber;
	}

	public void setRmMobileNumber(String rmMobileNumber) {
		this.rmMobileNumber = rmMobileNumber;
	}

	public boolean isbPhysicalConsent() {
		return bPhysicalConsent;
	}

	public void setbPhysicalConsent(boolean bPhysicalConsent) {
		this.bPhysicalConsent = bPhysicalConsent;
	}

	public String getChangeInCompName() {
		return ChangeInCompName;
	}

	public void setChangeInCompName(String changeInCompName) {
		ChangeInCompName = changeInCompName;
	}

	public String getProductMade() {
		return ProductMade;
	}

	public void setProductMade(String productMade) {
		ProductMade = productMade;
	}

	public List<String> getMainMachinesInstalled() {
		return MainMachinesInstalled;
	}

	public void setMainMachinesInstalled(List<String> mainMachinesInstalled) {
		MainMachinesInstalled = mainMachinesInstalled;
	}

	public HashMap<String, Object> getDependency() {
		return dependency;
	}

	public void setDependency(HashMap<String, Object> dependency) {
		this.dependency = dependency;
	}

	public String getNicCode() {
		return nicCode;
	}

	public String getIndustry() {
		return industry;
	}

	public String getNameOfOrg() {
		return nameOfOrg;
	}

	public boolean isTaxIdNumber() {
		return taxIdNumber;
	}

	public void setTaxIdNumber(boolean taxIdNumber) {
		this.taxIdNumber = taxIdNumber;
	}

	public String getOccupatonType() {
		return occupatonType;
	}

	public void setOccupatonType(String occupatonType) {
		this.occupatonType = occupatonType;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public String getPrefMailingAddress() {
		return prefMailingAddress;
	}

	public void setPrefMailingAddress(String prefMailingAddress) {
		this.prefMailingAddress = prefMailingAddress;
	}

	public String getPanValidation() {
		return panValidation;
	}

	public void setPanValidation(String panValidation) {
		this.panValidation = panValidation;
	}

	public String getBureauOneScore() {
		return bureauOneScore;
	}

	public void setBureauOneScore(String bureauOneScore) {
		this.bureauOneScore = bureauOneScore;
	}

	public String getCibilScore() {
		return cibilScore;
	}

	public void setCibilScore(String cibilScore) {
		this.cibilScore = cibilScore;
	}

	public boolean isNumRegWithBank() {
		return isNumRegWithBank;
	}

	public void setNumRegWithBank(boolean numRegWithBank) {
		isNumRegWithBank = numRegWithBank;
	}

	public List<String> getStakeHolders() {
		return stakeHolders;
	}

	public void setStakeHolders(List<String> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public String getReferencePersonName() {
		return referencePersonName;
	}

	public void setReferencePersonName(String referencePersonName) {
		this.referencePersonName = referencePersonName;
	}

	public String getReferencePersonMobile() {
		return referencePersonMobile;
	}

	public void setReferencePersonMobile(String referencePersonMobile) {
		this.referencePersonMobile = referencePersonMobile;
	}

	public List<String> getSavingbankName() {
		return savingbankName;
	}

	public void setSavingbankName(List<String> savingbankName) {
		this.savingbankName = savingbankName;
	}

	public boolean isCreditCard() {
		return creditCard;
	}

	public void setCreditCard(boolean creditCard) {
		this.creditCard = creditCard;
	}

	public String getCurrentStage() {
		return currentStage;
	}

	public void setCurrentStage(String currentStage) {
		this.currentStage = currentStage;
	}

	public String getPropertyNature() {
		return propertyNature;
	}

	public void setPropertyNature(String propertyNature) {
		this.propertyNature = propertyNature;
	}

	public String getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(String applicantId) {
		this.applicantId = applicantId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public Name getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(Name applicantName) {
		this.applicantName = applicantName;
	}

	public Name getFatherName() {
		return fatherName;
	}

	public void setFatherName(Name fatherName) {
		this.fatherName = fatherName;
	}

	public Name getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(Name spouseName) {
		this.spouseName = spouseName;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public boolean isResidenceAddSameAsAbove() {
		return residenceAddSameAsAbove;
	}

	public void setResidenceAddSameAsAbove(boolean residenceAddSameAsAbove) {
		this.residenceAddSameAsAbove = residenceAddSameAsAbove;
	}

	public List<CustomerAddress> getAddress() {
		return address;
	}

	public void setAddress(List<CustomerAddress> address) {
		this.address = address;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	public List<Email> getEmail() {
		return email;
	}

	public void setEmail(List<Email> email) {
		this.email = email;
	}

	public int getNoOfDependents() {
		return noOfDependents;
	}

	public void setNoOfDependents(int noOfDependents) {
		this.noOfDependents = noOfDependents;
	}

	public int getNoOfEarningMembers() {
		return noOfEarningMembers;
	}

	public void setNoOfEarningMembers(int noOfEarningMembers) {
		this.noOfEarningMembers = noOfEarningMembers;
	}

	public int getNoOfFamilyMembers() {
		return noOfFamilyMembers;
	}

	public void setNoOfFamilyMembers(int noOfFamilyMembers) {
		this.noOfFamilyMembers = noOfFamilyMembers;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public List<String> getCreditCardLnAccNumbers() {
		return creditCardLnAccNumbers;
	}

	public void setCreditCardLnAccNumbers(List<String> creditCardLnAccNumbers) {
		this.creditCardLnAccNumbers = creditCardLnAccNumbers;
	}

	public boolean isMobileVerified() {
		return mobileVerified;
	}

	public void setMobileVerified(boolean mobileVerified) {
		this.mobileVerified = mobileVerified;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public boolean isAadhaarVerified() {
		return aadhaarVerified;
	}

	public void setAadhaarVerified(boolean aadhaarVerified) {
		this.aadhaarVerified = aadhaarVerified;
	}

	public Name getMotherName() {
		return motherName;
	}

	public void setMotherName(Name motherName) {
		this.motherName = motherName;
	}

	public boolean isConsentToCall() {
		return consentToCall;
	}

	public void setConsentToCall(boolean consentToCall) {
		this.consentToCall = consentToCall;
	}

	public String getMothersMaidenName() {
		return mothersMaidenName;
	}

	public void setMothersMaidenName(String mothersMaidenName) {
		this.mothersMaidenName = mothersMaidenName;
	}

	public String getHasBankAccount() {
		return hasBankAccount;
	}

	public void setHasBankAccount(String hasBankAccount) {
		this.hasBankAccount = hasBankAccount;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getGroupCode() {
		return groupcode;
	}

	public void setGroupCode(String groupcode) {
		this.groupcode = groupcode;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getTanNo() {
		return tanNo;
	}

	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}

	public boolean isGstStatus() {
		return gstStatus;
	}

	public void setGstStatus(boolean gstStatus) {
		this.gstStatus = gstStatus;
	}

	public boolean isMinor() {
		return minor;
	}

	public void setMinor(boolean minor) {
		this.minor = minor;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public boolean isPhysicallyHandicapped() {
		return physicallyHandicapped;
	}

	public void setPhysicallyHandicapped(boolean physicallyHandicapped) {
		this.physicallyHandicapped = physicallyHandicapped;
	}

	public String getOtherNatureOccupation() {
		return otherNatureOccupation;
	}

	public void setOtherNatureOccupation(String otherNatureOccupation) {
		this.otherNatureOccupation = otherNatureOccupation;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getsOthrNationality() {
		return sOthrNationality;
	}

	public void setsOthrNationality(String sOthrNationality) {
		this.sOthrNationality = sOthrNationality;
	}

	public String getResidenceStatus() {
		return residenceStatus;
	}

	public void setResidenceStatus(String residenceStatus) {
		this.residenceStatus = residenceStatus;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getiNoOfChildren() {
		return iNoOfChildren;
	}

	public void setiNoOfChildren(int iNoOfChildren) {
		this.iNoOfChildren = iNoOfChildren;
	}

	public boolean isCreditVidyaFlag() {
		return creditVidyaFlag;
	}

	public void setCreditVidyaFlag(boolean creditVidyaFlag) {
		this.creditVidyaFlag = creditVidyaFlag;
	}

	public int getAgeDuringMaturityOfLoan() {
		return ageDuringMaturityOfLoan;
	}

	public void setAgeDuringMaturityOfLoan(int ageDuringMaturityOfLoan) {
		this.ageDuringMaturityOfLoan = ageDuringMaturityOfLoan;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public boolean isGuarantees() {
		return guarantees;
	}

	public void setGuarantees(boolean guarantees) {
		this.guarantees = guarantees;
	}

	public String getPdcDetails() {
		return pdcDetails;
	}

	public void setPdcDetails(String pdcDetails) {
		this.pdcDetails = pdcDetails;
	}

	public double getStakeHolding() {
		return stakeHolding;
	}

	public void setStakeHolding(double stakeHolding) {
		this.stakeHolding = stakeHolding;
	}

	public int getPartnerDirector() {
		return partnerDirector;
	}

	public void setPartnerDirector(int partnerDirector) {
		this.partnerDirector = partnerDirector;
	}

	public boolean isTanStatus() {
		return tanStatus;
	}

	public void setTanStatus(boolean tanStatus) {
		this.tanStatus = tanStatus;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getUdyogAdhaar() {
		return udyogAdhaar;
	}

	public void setUdyogAdhaar(String udyogAdhaar) {
		this.udyogAdhaar = udyogAdhaar;
	}

	public boolean isUdyogVerified() {
		return udyogVerified;
	}

	public void setUdyogVerified(boolean udyogVerified) {
		this.udyogVerified = udyogVerified;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<String> getStakeHolder() {
		return stakeHolders;
	}

	public void setStakeHolder(List<String> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public String getTrackRecord() {
		return trackRecord;
	}

	public void setTrackRecord(String trackRecord) {
		this.trackRecord = trackRecord;
	}

	public List<String> getPslSubList() {
		return pslSubList;
	}

	public void setPslSubList(List<String> pslSubList) {
		this.pslSubList = pslSubList;
	}

	public String getPsl() {
		return psl;
	}

	public void setPsl(String psl) {
		this.psl = psl;
	}

	public String getPrefCommChannel() {
		return prefCommChannel;
	}

	public void setPrefCommChannel(String prefCommChannel) {
		this.prefCommChannel = prefCommChannel;
	}

	public String getPrefAddrCorr() {
		return prefAddrCorr;
	}

	public void setPrefAddrCorr(String prefAddrCorr) {
		this.prefAddrCorr = prefAddrCorr;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getSpecialProfileIndicator() {
		return specialProfileIndicator;
	}

	public void setSpecialProfileIndicator(String specialProfileIndicator) {
		this.specialProfileIndicator = specialProfileIndicator;
	}

	public List<Name> getRelativeNameList() {
		return relativeNameList;
	}

	public void setRelativeNameList(List<Name> relativeNameList) {
		this.relativeNameList = relativeNameList;
	}

	public String getPlaceBirth() {
		return placeBirth;
	}

	public void setPlaceBirth(String placeBirth) {
		this.placeBirth = placeBirth;
	}

	public String getCob() {
		return cob;
	}

	public void setCob(String cob) {
		this.cob = cob;
	}

	public String getSalaryBankName() {
		return salaryBankName;
	}

	public void setSalaryBankName(String salaryBankName) {
		this.salaryBankName = salaryBankName;
	}

	public List<String> getFaceMatchDetailsKeysList() {
		return faceMatchDetailsKeysList;
	}

	public void setFaceMatchDetailsKeysList(List<String> faceMatchDetailsKeysList) {
		this.faceMatchDetailsKeysList = faceMatchDetailsKeysList;
	}

	public boolean isApplicantCompleteness() {
		return applicantCompleteness;
	}

	public void setApplicantCompleteness(boolean applicantCompleteness) {
		this.applicantCompleteness = applicantCompleteness;
	}

	public String getMinority() {
		return minority;
	}

	public void setMinority(String minority) {
		this.minority = minority;
	}

	public String getPhysicallyChallenged() {
		return physicallyChallenged;
	}

	public void setPhysicallyChallenged(String physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}

	public String getEpfo() {
		return epfo;
	}

	public void setEpfo(String epfo) {
		this.epfo = epfo;
	}

	public void setNicCode(String nicCode) {
		this.nicCode = nicCode;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public void setNameOfOrg(String nameOfOrg) {
		this.nameOfOrg = nameOfOrg;
	}

	public String getFleetPivot() {
		return fleetPivot;
	}

	public void setFleetPivot(String fleetPivot) {
		this.fleetPivot = fleetPivot;
	}

	public List<Character> getApplName() {
		return applName;
	}

	public void setApplName(List<Character> applName) {
		this.applName = applName;
	}

	public List<Character> getfName() {
		return fName;
	}

	public void setfName(List<Character> fName) {
		this.fName = fName;
	}

	public List<Character> getmName() {
		return mName;
	}

	public void setmName(List<Character> mName) {
		this.mName = mName;
	}

	public List<Character> getDob() {
		return dob;
	}

	public void setDob(List<Character> dob) {
		this.dob = dob;
	}

	public List<Character> getMobile() {
		return mobile;
	}

	public void setMobile(List<Character> mobile) {
		this.mobile = mobile;
	}

	public List<Character> getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(List<Character> aadharNo) {
		this.aadharNo = aadharNo;
	}

	public List<Character> getPanNo() {
		return panNo;
	}

	public void setPanNo(List<Character> panNo) {
		this.panNo = panNo;
	}

	public List<Character> getUdyogNo() {
		return udyogNo;
	}

	public void setUdyogNo(List<Character> udyogNo) {
		this.udyogNo = udyogNo;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getSsiNo() {
		return ssiNo;
	}

	public void setSsiNo(String ssiNo) {
		this.ssiNo = ssiNo;

	}

	public double getShareholdingPercent() {
		return shareholdingPercent;
	}

	public void setShareholdingPercent(double shareholdingPercent) {
		this.shareholdingPercent = shareholdingPercent;
	}

	public String getBpNumber() {
		return bpNumber;
	}

	public void setBpNumber(String bpNumber) {
		this.bpNumber = bpNumber;
	}

	public Integer getBusinessTurnOvr() {
		return businessTurnOvr;
	}

	public void setBusinessTurnOvr(Integer businessTurnOvr) {
		this.businessTurnOvr = businessTurnOvr;
	}

	public String getExistingTMFLCust() {
		return existingTMFLCust;
	}

	public void setExistingTMFLCust(String existingTMFLCust) {
		this.existingTMFLCust = existingTMFLCust;
	}

	public String getGstRegObtn() {
		return gstRegObtn;
	}

	public void setGstRegObtn(String gstRegObtn) {
		this.gstRegObtn = gstRegObtn;
	}

	public boolean isPosidexExistngCustmr() {
		return posidexExistngCustmr;
	}

	public void setPosidexExistngCustmr(boolean posidexExistngCustmr) {
		this.posidexExistngCustmr = posidexExistngCustmr;
	}

	public boolean isIncomeTobeConsider() {
		return incomeTobeConsider;
	}

	public void setIncomeTobeConsider(boolean incomeTobeConsider) {
		this.incomeTobeConsider = incomeTobeConsider;
	}

	public String getBusinessStability() {
		return businessStability;
	}

	public void setBusinessStability(String businessStability) {
		this.businessStability = businessStability;
	}

	public double getRegNo() {
		return regNo;
	}

	public void setRegNo(double regNo) {
		this.regNo = regNo;
	}

	public String getRegWithAuthority() {
		return regWithAuthority;
	}

	public void setRegWithAuthority(String regWithAuthority) {
		this.regWithAuthority = regWithAuthority;
	}

	public double getTrustees() {
		return trustees;
	}

	public void setTrustees(double trustees) {
		this.trustees = trustees;
	}

	public double getPartnersNo() {
		return partnersNo;
	}

	public void setPartnersNo(double partnersNo) {
		this.partnersNo = partnersNo;
	}

	public double getMembersNo() {
		return membersNo;
	}

	public void setMembersNo(double membersNo) {
		this.membersNo = membersNo;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public double getDirectorsNo() {
		return directorsNo;
	}

	public void setDirectorsNo(double directorsNo) {
		this.directorsNo = directorsNo;
	}

	public String getAgriLand() {
		return agriLand;
	}

	public void setAgriLand(String agriLand) {
		this.agriLand = agriLand;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public Integer getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Integer monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public List<String> getGstNoValues() {
		return gstNoValues;
	}

	public void setGstNoValues(List<String> gstNoValues) {
		this.gstNoValues = gstNoValues;
	}

	public boolean isToBeContacted() {
		return toBeContacted;
	}

	public void setToBeContacted(boolean toBeContacted) {
		this.toBeContacted = toBeContacted;
	}

	public String getUan() {
		return uan;
	}

	public void setUan(String uan) {
		this.uan = uan;
	}

	public boolean isUanVerified() {
		return uanVerified;
	}

	public void setUanVerified(boolean uanVerified) {
		this.uanVerified = uanVerified;
	}

	public List<String> getDedupeMatchValue() {
		return dedupeMatchValue;
	}

	public void setDedupeMatchValue(List<String> dedupeMatchValue) {
		this.dedupeMatchValue = dedupeMatchValue;
	}

	public String getDedupeStatus() {
		return dedupeStatus;
	}

	public void setDedupeStatus(String dedupeStatus) {
		this.dedupeStatus = dedupeStatus;
	}

	public String getFiStatus() {
		return fiStatus;
	}

	public void setFiStatus(String fiStatus) {
		this.fiStatus = fiStatus;
	}

	public String getRiskCat() {
		return riskCat;
	}

	public void setRiskCat(String riskCat) {
		this.riskCat = riskCat;
	}

	public String getRelativeType() {
		return relativeType;
	}

	public void setRelativeType(String relativeType) {
		this.relativeType = relativeType;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Applicant{");
		sb.append("applicantId='").append(applicantId).append('\'');
		sb.append(", entityType=").append(entityType);
		sb.append(", applicantName=").append(applicantName);
		sb.append(", fatherName=").append(fatherName);
		sb.append(", spouseName=").append(spouseName);
		sb.append(", motherName=").append(motherName);
		sb.append(", mothersMaidenName='").append(mothersMaidenName).append('\'');
		sb.append(", religion='").append(religion).append('\'');
		sb.append(", gender='").append(gender).append('\'');
		sb.append(", dateOfBirth='").append(dateOfBirth).append('\'');
		sb.append(", age=").append(age);
		sb.append(", maritalStatus='").append(maritalStatus).append('\'');
		sb.append(", nationality='").append(nationality).append('\'');

		sb.append(", residenceAddSameAsAbove=").append(residenceAddSameAsAbove);
		sb.append(", address=").append(address);
		sb.append(", phone=").append(phone);
		sb.append(", email=").append(email);

		sb.append(", noOfDependents=").append(noOfDependents);
		sb.append(", noOfEarningMembers=").append(noOfEarningMembers);
		sb.append(", noOfFamilyMembers=").append(noOfFamilyMembers);

		sb.append(", education='").append(education).append('\'');
		sb.append(", creditCardNumber='").append(creditCardNumber).append('\'');
		sb.append(", creditCardLnAccNumbers=").append(creditCardLnAccNumbers);
		sb.append(", mobileVerified=").append(mobileVerified);
		sb.append(", aadhaarVerified=").append(aadhaarVerified);
		sb.append(", hasBankAccount='").append(hasBankAccount).append('\'');

		sb.append(", applicantType='").append(applicantType).append('\'');
		sb.append(", consentToCall=").append(consentToCall);

		sb.append(", contactPerson=").append(contactPerson);
		sb.append(", tanNo=").append(tanNo);
		sb.append(", gstNo=").append(gstNo);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Applicant applicant = (Applicant) o;
		return Objects.equals(age, applicant.age)
				&& Objects.equals(residenceAddSameAsAbove, applicant.residenceAddSameAsAbove)
				&& Objects.equals(noOfDependents, applicant.noOfDependents)
				&& Objects.equals(noOfEarningMembers, applicant.noOfEarningMembers)
				&& Objects.equals(noOfFamilyMembers, applicant.noOfFamilyMembers)
				&& Objects.equals(mobileVerified, applicant.mobileVerified)
				&& Objects.equals(aadhaarVerified, applicant.aadhaarVerified)
				&& Objects.equals(consentToCall, applicant.consentToCall)
				&& Objects.equals(applicantId, applicant.applicantId)
				&& Objects.equals(applicantName, applicant.applicantName)
				&& Objects.equals(fatherName, applicant.fatherName) && Objects.equals(spouseName, applicant.spouseName)
				&& Objects.equals(motherName, applicant.motherName)
				&& Objects.equals(mothersMaidenName, applicant.mothersMaidenName)
				&& Objects.equals(religion, applicant.religion) && Objects.equals(gender, applicant.gender)
				&& Objects.equals(dateOfBirth, applicant.dateOfBirth)
				&& Objects.equals(maritalStatus, applicant.maritalStatus) &&

				Objects.equals(address, applicant.address) && Objects.equals(phone, applicant.phone)
				&& Objects.equals(email, applicant.email) &&

				Objects.equals(education, applicant.education)
				&& Objects.equals(creditCardNumber, applicant.creditCardNumber)
				&& Objects.equals(creditCardLnAccNumbers, applicant.creditCardLnAccNumbers)
				&& Objects.equals(hasBankAccount, applicant.hasBankAccount) &&

				Objects.equals(applicantType, applicant.applicantType) &&

				Objects.equals(contactPerson, applicant.contactPerson) && Objects.equals(gstNo, applicant.gstNo)
				&& Objects.equals(tanNo, applicant.tanNo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(applicantId, applicantName, fatherName, spouseName, motherName, mothersMaidenName, religion,
				gender, dateOfBirth, age, maritalStatus, residenceAddSameAsAbove, address, phone, email, noOfDependents,
				noOfEarningMembers, noOfFamilyMembers, education, creditCardNumber, creditCardLnAccNumbers,
				mobileVerified, aadhaarVerified, hasBankAccount, consentToCall);
	}

	public boolean isNonFinance() {
		return nonFinance;
	}

	public void setNonFinance(boolean nonFinance) {
		this.nonFinance = nonFinance;
	}
}