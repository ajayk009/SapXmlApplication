package com.softcell.gonogo.model.contact;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.data.annotation.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author prateek
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Phone implements Serializable {
    @JsonProperty("sPhoneType")
    private String phoneType;

    @JsonProperty("sAreaCode")
    private String areaCode;

    @JsonProperty("sCountryCode")
    private String countryCode;

    @JsonProperty("sPhoneNumber")
    private String phoneNumber;

    @JsonProperty("sPhoneNumber1")
    private String phoneNumber1;

    /**
     * Newly Added attributes for hdfs
     */
    @JsonProperty("sExt")
    private String extension;

    /**
     * Newly Added attributes for sbfc
     */
    @JsonProperty("bVerified")
    private boolean verified;

    @JsonProperty("bRegisterWithBank")
    private boolean registerWithBank;

    @JsonProperty("sOtherPhoneNumber")
    private String otherPhoneNumber;

    @JsonProperty("sMobileType")
    private String mobileType;

    @JsonIgnore
    @Transient
    private List<Character> phoneNo = new ArrayList<>();

    public List<Character> getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(List<Character> phoneNo) {
        this.phoneNo = phoneNo;
    }


    public boolean isRegisterWithBank() {   return registerWithBank;    }

    public void setRegisterWithBank(boolean registerWithBank) { this.registerWithBank = registerWithBank;   }

    public String getOtherPhoneNumber() {   return otherPhoneNumber;    }

    public void setOtherPhoneNumber(String otherPhoneNumber) {  this.otherPhoneNumber = otherPhoneNumber;   }

    public boolean isVerified() {   return verified;    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileType() {
        return mobileType;
    }

    public void setMobileType(String mobileType) {
        this.mobileType = mobileType;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Phone [phoneType=");
        builder.append(phoneType);
        builder.append(", areaCode=");
        builder.append(areaCode);
        builder.append(", countryCode=");
        builder.append(countryCode);
        builder.append(", phoneNumber=");
        builder.append(phoneNumber);
        builder.append(", extension=");
        builder.append(extension);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;

        Phone phone = (Phone) o;

        if (isVerified() != phone.isVerified()) return false;
        if (isRegisterWithBank() != phone.isRegisterWithBank()) return false;
        if (getPhoneType() != null ? !getPhoneType().equals(phone.getPhoneType()) : phone.getPhoneType() != null)
            return false;
        if (getAreaCode() != null ? !getAreaCode().equals(phone.getAreaCode()) : phone.getAreaCode() != null)
            return false;
        if (getCountryCode() != null ? !getCountryCode().equals(phone.getCountryCode()) : phone.getCountryCode() != null)
            return false;
        if (getPhoneNumber() != null ? !getPhoneNumber().equals(phone.getPhoneNumber()) : phone.getPhoneNumber() != null)
            return false;
        if (getExtension() != null ? !getExtension().equals(phone.getExtension()) : phone.getExtension() != null)
            return false;
        if (getOtherPhoneNumber() != null ? !getOtherPhoneNumber().equals(phone.getOtherPhoneNumber()) : phone.getOtherPhoneNumber() != null)
            return false;
        return getMobileType() != null ? getMobileType().equals(phone.getMobileType()) : phone.getMobileType() == null;
    }
}
