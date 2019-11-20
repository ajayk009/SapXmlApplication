package com.softcell.gonogo.model.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * @author kishorp This class extends 'Address', It is related with Customer
 *         Address.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerAddress extends Address implements Serializable {

    @JsonProperty("sAccm")
    private String accommodation;

    /**
     * city and address in years
     */
    @JsonProperty("iTimeAtAddr")
    private int timeAtAddress;

    @JsonProperty("sTimeAtAddrSince")
    private String timeAtAddressSince;

    @JsonProperty("iTimeAtCity")
    private int timeAtCitys;

    @JsonProperty("sAddrType")
    private String addressType;

    @JsonProperty("sResAddrType")
    private String residenceAddressType;

    @JsonProperty("sResOthers")
    private String resOthers;

    @JsonProperty("sOfficeType")
    private String officeType;

    @JsonProperty("bSameAbove")
    private boolean sameAsAbove;

    @JsonProperty("bSameAsPrimaryAppl")
    private boolean sameAsPrimaryAppl;
    /**
     * city and address in months
     */

    @JsonProperty("iMonthAtCity")
    private int monthAtCity;

    @JsonProperty("iMonthAtAddr")
    private int monthAtAddress;

    @JsonProperty("dRentAmt")
    private double rentAmount;

    @JsonProperty("sFlatNo")
    private String flatNo;

    @JsonProperty("sStreet")
    private String street;

    @JsonProperty("sLocality")
    private String locality;

    @JsonProperty("sLine3")
    private String line;

    @JsonProperty("sArea")
    private String area;

    /**
     * Newly Added attributes of hdfs
     */
    @JsonProperty("iYearAtCity")
    private int yearAtCity;

    /**
     * newly added field to find Negative Area purpose.
     */
    @JsonProperty("sNegativeArea")
    private String negativeArea;

    @JsonProperty("sNegativeAreaReason")
    private String negativeAreaReason;

    @JsonProperty("bNegativeAreaNotApplicableFlag")
    private boolean negativeAreaNotApplicableFlag;

    @JsonProperty("dLatitude")
    private double latitude;

    @JsonProperty("dLongitude")
    private double longitude;

    @JsonProperty("sLandLine")
    private String landLine;

    @JsonProperty("sLocation")
    private String location;

    @JsonProperty("sAddrArea")
    private String addrArea;

    @JsonProperty("sProofOfAddr")
    private String proofOfAddr;

    @JsonProperty("sShopPremise")
    private String shopPremise;

    @JsonProperty("dShopVintage")
    private double shopVintage;

    @JsonProperty("sOwnedBy")
    private String ownedBy;

    @JsonProperty("dEquipmentValue")
    private double equipmentValue;

    @JsonProperty("sWingNo")
    private String wingNo;

    @JsonProperty("bSameAsCoAppl")
    private boolean sameAsCoAppl;


    public boolean isSameAsPrimaryAppl() {
        return sameAsPrimaryAppl;
    }

    public void setSameAsPrimaryAppl(boolean sameAsPrimaryAppl) {
        this.sameAsPrimaryAppl = sameAsPrimaryAppl;
    }


    public String getsWingNo() {
        return wingNo;
    }

    public void setsWingNo(String wingNo) {
        this.wingNo = wingNo;
    }

    public int getTimeAtCitys() {
        return timeAtCitys;
    }

    public void setTimeAtCitys(int timeAtCitys) {
        this.timeAtCitys = timeAtCitys;
    }

    public String getShopPremise() {
        return shopPremise;
    }

    public void setShopPremise(String shopPremise) {
        this.shopPremise = shopPremise;
    }

    public double getShopVintage() {
        return shopVintage;
    }

    public void setShopVintage(double shopVintage) {
        this.shopVintage = shopVintage;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public double getEquipmentValue() {
        return equipmentValue;
    }

    public void setEquipmentValue(double equipmentValue) {
        this.equipmentValue = equipmentValue;
    }

    public String getProofOfAddr() {
        return proofOfAddr;
    }

    public void setProofOfAddr(String proofOfAddr) {
        this.proofOfAddr = proofOfAddr;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getNegativeAreaReason() {
        return negativeAreaReason;
    }

    public void setNegativeAreaReason(String negativeAreaReason) {
        this.negativeAreaReason = negativeAreaReason;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public int getTimeAtAddress() {
        return timeAtAddress;
    }

    public void setTimeAtAddress(int timeAtAddress) {
        this.timeAtAddress = timeAtAddress;
    }

    public String getTimeAtAddressSince() {        return timeAtAddressSince;    }

    public void setTimeAtAddressSince(String timeAtAddressSince) {
        this.timeAtAddressSince = timeAtAddressSince;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType.toUpperCase();
    }

    public String getResidenceAddressType() {
        return residenceAddressType;
    }

    public void setResidenceAddressType(String residenceAddressType) {
        this.residenceAddressType = residenceAddressType;
    }

    public boolean isSameAsAbove() {
        return sameAsAbove;
    }

    public void setSameAsAbove(boolean sameAsAbove) {
        this.sameAsAbove = sameAsAbove;
    }

    public String getOfficeType() {
        return officeType;
    }

    public void setOfficeType(String officeType) {
        this.officeType = officeType;
    }

    public int getMonthAtCity() {
        return monthAtCity;
    }

    public void setMonthAtCity(int monthAtCity) {
        this.monthAtCity = monthAtCity;
    }

    public int getMonthAtAddress() {
        return monthAtAddress;
    }

    public void setMonthAtAddress(int monthAtAddress) {
        this.monthAtAddress = monthAtAddress;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getYearAtCity() {
        return yearAtCity;
    }

    public void setYearAtCity(int yearAtCity) {
        this.yearAtCity = yearAtCity;
    }

    public String getNegativeArea() {
        return negativeArea;
    }
    public void setNegativeArea(String negativeArea) {
        this.negativeArea = negativeArea;
    }

    public boolean isNegativeAreaNotApplicableFlag() {
        return negativeAreaNotApplicableFlag;
    }

    public void setNegativeAreaNotApplicableFlag(boolean negativeAreaNotApplicableFlag) {
        this.negativeAreaNotApplicableFlag = negativeAreaNotApplicableFlag;
    }

    public double getLatitude() { return latitude; }

    public void setLatitude(double latitude) { this.latitude = latitude; }

    public double getLongitude() { return longitude; }

    public void setLongitude(double longitude) { this.longitude = longitude; }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddrArea() {
        return addrArea;
    }

    public void setAddrArea(String addrArea) {
        this.addrArea = addrArea;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isSameAsCoAppl() {
        return sameAsCoAppl;
    }

    public void setSameAsCoAppl(boolean sameAsCoAppl) {
        this.sameAsCoAppl = sameAsCoAppl;
    }

    public String getResOthers() {
        return resOthers;
    }

    public void setResOthers(String resOthers) {
        this.resOthers = resOthers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerAddress{");
        sb.append("accommodation='").append(accommodation).append('\'');
        sb.append(", timeAtAddress=").append(timeAtAddress);
        sb.append(", addressType='").append(addressType).append('\'');
        sb.append(", residenceAddressType='").append(residenceAddressType).append('\'');
        sb.append(", officeType='").append(officeType).append('\'');
        sb.append(", monthAtCity=").append(monthAtCity);
        sb.append(", monthAtAddress=").append(monthAtAddress);
        sb.append(", rentAmount=").append(rentAmount);
        sb.append(", flatNo='").append(flatNo).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", locality='").append(locality).append('\'');
        sb.append(", yearAtCity=").append(yearAtCity);
        sb.append(", negativeArea='").append(negativeArea).append('\'');
        sb.append(", negativeAreaReason='").append(negativeAreaReason).append('\'');
        sb.append(", negativeAreaNotApplicableFlag=").append(negativeAreaNotApplicableFlag).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude=").append(longitude);
        sb.append('}');
        return sb.toString();
    }

    public interface FetchGrp{

    }

    public String getCompleteAddress() {
        return super.toString();
    }
    
    public String getNormalAddress(){
    	return super.toNormalString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerAddress)) return false;
        if (!super.equals(o)) return false;

        CustomerAddress that = (CustomerAddress) o;

        if (getTimeAtAddress() != that.getTimeAtAddress()) return false;
        if (getTimeAtCitys() != that.getTimeAtCitys()) return false;
        if (isSameAsAbove() != that.isSameAsAbove()) return false;
        if (getMonthAtCity() != that.getMonthAtCity()) return false;
        if (getMonthAtAddress() != that.getMonthAtAddress()) return false;
        if (Double.compare(that.getRentAmount(), getRentAmount()) != 0) return false;
        if (getYearAtCity() != that.getYearAtCity()) return false;
        if (isNegativeAreaNotApplicableFlag() != that.isNegativeAreaNotApplicableFlag()) return false;
        if (Double.compare(that.getLatitude(), getLatitude()) != 0) return false;
        if (Double.compare(that.getLongitude(), getLongitude()) != 0) return false;
        if (Double.compare(that.getShopVintage(), getShopVintage()) != 0) return false;
        if (Double.compare(that.getEquipmentValue(), getEquipmentValue()) != 0) return false;
        if (getAccommodation() != null ? !getAccommodation().equals(that.getAccommodation()) : that.getAccommodation() != null)
            return false;
        if (getAddressType() != null ? !getAddressType().equals(that.getAddressType()) : that.getAddressType() != null)
            return false;
        if (getResidenceAddressType() != null ? !getResidenceAddressType().equals(that.getResidenceAddressType()) : that.getResidenceAddressType() != null)
            return false;
        if (getOfficeType() != null ? !getOfficeType().equals(that.getOfficeType()) : that.getOfficeType() != null)
            return false;
        if (getFlatNo() != null ? !getFlatNo().equals(that.getFlatNo()) : that.getFlatNo() != null) return false;
        if (getStreet() != null ? !getStreet().equals(that.getStreet()) : that.getStreet() != null) return false;
        if (getLocality() != null ? !getLocality().equals(that.getLocality()) : that.getLocality() != null)
            return false;
        if (getLine() != null ? !getLine().equals(that.getLine()) : that.getLine() != null) return false;
        if (getArea() != null ? !getArea().equals(that.getArea()) : that.getArea() != null) return false;
        if (getNegativeArea() != null ? !getNegativeArea().equals(that.getNegativeArea()) : that.getNegativeArea() != null)
            return false;
        if (getNegativeAreaReason() != null ? !getNegativeAreaReason().equals(that.getNegativeAreaReason()) : that.getNegativeAreaReason() != null)
            return false;
        if (getLandLine() != null ? !getLandLine().equals(that.getLandLine()) : that.getLandLine() != null)
            return false;
        if (getLocation() != null ? !getLocation().equals(that.getLocation()) : that.getLocation() != null)
            return false;
        if (getAddrArea() != null ? !getAddrArea().equals(that.getAddrArea()) : that.getAddrArea() != null)
            return false;
        if (getProofOfAddr() != null ? !getProofOfAddr().equals(that.getProofOfAddr()) : that.getProofOfAddr() != null)
            return false;
        if (getShopPremise() != null ? !getShopPremise().equals(that.getShopPremise()) : that.getShopPremise() != null)
            return false;
        if (isSameAsCoAppl() != that.isSameAsCoAppl()) return false;
        return getOwnedBy() != null ? getOwnedBy().equals(that.getOwnedBy()) : that.getOwnedBy() == null;
    }
}
