package com.softcell.gonogo.model.address;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Transient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

    /**
 * @author kishorp
 *         The basic residential details of customer. like city, pin state country,state.
 *         Line 1, Line 2, City, Pin code,  state and country are mandatory  fields.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Serializable {

    @JsonProperty("sLine1")
    private String addressLine1;

    @JsonProperty("sLine2")
    private String addressLine2;

    @JsonProperty("sCity")
    private String city;

    @JsonProperty("iPinCode")
    private long pin;

    @JsonProperty("sState")
    private String state;

    @JsonProperty("sCountry")
    private String country;

    /**
     * Newly Added attributes of DMI
     */
    @JsonProperty("sLandLoard")
    private String landLoard;

    /**
     * Newly Added attributes of hdfs
     */
    @JsonProperty("sLine3")
    private String line3;

    @JsonProperty("sLine4")
    private String line4;

    @JsonProperty("sVillage")
    private String village;

    @JsonProperty("sTaluka")
    private String taluka;

    @JsonProperty("sDistrict")
    private String district;

    @JsonProperty("fDistFrom")
    private float distanceFrom;

    @JsonProperty("sLandMark")
    private String landMark;

    @JsonProperty("sOutOfGeoLimit")
    private String outOfGeoLimit;

    /**
     +     * Newly Added attributes of Sbfc-Pl
     +     */

    @JsonProperty("sLandLine")
    private String landLineNumber;

    @JsonProperty("sExtNo")
    private String extensionNumber;

    @JsonProperty("sTimeAtCity")
    private String timeAtCity;

    @JsonProperty("sTimeAtAddr")
    private String timeAtAddr;

    @JsonProperty("dTimeAtAddr")
    private double timeAtAddrss;

    @JsonProperty("sOGL")
    private String ogl;

    @JsonProperty("sFI")
    private String fi;

    @JsonProperty("sSTD")
    private String std;

    @JsonProperty("sExtension")
    private String extension;

    @JsonProperty("sPostOffice")
    private String postOffice;

    @JsonProperty("sBuildingName")
    private String buildingName;

    @JsonProperty("sPlotNo")
    private String plotNo;

    @JsonProperty("sAddressSameAs")
    private String addressSameAs;

    @JsonProperty("sCountryCode")
    private String countryCode;
    @JsonIgnore
    @Transient
    private List<Character> l1 = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> l2 = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> stateName = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> cityName = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> districtName = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> pincode = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> landmarkName = new ArrayList<>();
    @JsonIgnore
    @Transient
    private List<Character> tAtAddress = new ArrayList<>();

    @JsonProperty("sVerified")
    private String verified;

    @JsonProperty("sEmailAddr")
    private String emailId;

    @JsonProperty("sPhoneNumber")
    private String phoneNumber;

    public String getCountryCode() {    return countryCode; }

    public void setCountryCode(String countryCode) {    this.countryCode = countryCode; }

    public String getAddressSameAs() {  return addressSameAs;   }

    public void setAddressSameAs(String addressSameAs) {    this.addressSameAs = addressSameAs; }

    public String getBuildingName() {   return buildingName;   }

    public void setBuildingName(String buildingName) {  this.buildingName = buildingName;   }

    public String getPlotNo() { return plotNo;  }

    public void setPlotNo(String plotNo) {  this.plotNo = plotNo;   }


    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getTimeAtCity() { return timeAtCity;  }

    public void setTimeAtCity(String timeAtCity) {  this.timeAtCity = timeAtCity;   }

    public double getTimeAtAddrss() {
        return timeAtAddrss;
    }

    public void setTimeAtAddrss(double timeAtAddrss) {
        this.timeAtAddrss = timeAtAddrss;
    }

    public String getTimeAtAddr() { return timeAtAddr;  }

    public void setTimeAtAddr(String timeAtAddr) {  this.timeAtAddr = timeAtAddr;   }

    public String getLandLineNumber() { return landLineNumber;  }

    public void setLandLineNumber(String landLineNumber) {  this.landLineNumber = landLineNumber;   }

    public String getLandLoard() {  return landLoard;   }

    public void setLandLoard(String landLoard) {
        this.landLoard = landLoard;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getOutOfGeoLimit() {
        return outOfGeoLimit;
    }

    public void setOutOfGeoLimit(String outOfGeoLimit) {
        this.outOfGeoLimit = outOfGeoLimit;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPin() {
        return pin;
    }

    public void setPin(long pin) {
        this.pin = pin;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public String getLine4() {
        return line4;
    }

    public void setLine4(String line4) {
        this.line4 = line4;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public float getDistanceFrom() {
        return distanceFrom;
    }

    public void setDistanceFrom(float distanceFrom) {
        this.distanceFrom = distanceFrom;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getOgl() {
        return ogl;
    }

    public void setOgl(String ogl) {
        this.ogl = ogl;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

        public List<Character> getL1() {
            return l1;
        }

        public void setL1(List<Character> l1) {
            this.l1 = l1;
        }

        public List<Character> getL2() {
            return l2;
        }

        public void setL2(List<Character> l2) {
            this.l2 = l2;
        }

        public List<Character> getStateName() {
            return stateName;
        }

        public void setStateName(List<Character> stateName) {
            this.stateName = stateName;
        }

        public List<Character> getCityName() {
            return cityName;
        }

        public void setCityName(List<Character> cityName) {
            this.cityName = cityName;
        }

        public List<Character> getDistrictName() {
            return districtName;
        }

        public void setDistrictName(List<Character> districtName) {
            this.districtName = districtName;
        }

        public List<Character> getPincode() {
            return pincode;
        }

        public void setPincode(List<Character> pincode) {
            this.pincode = pincode;
        }

        public List<Character> getLandmarkName() {
            return landmarkName;
        }

        public void setLandmarkName(List<Character> landmarkName) {
            this.landmarkName = landmarkName;
        }

        public List<Character> gettAtAddress() {
            return tAtAddress;
        }

        public void settAtAddress(List<Character> tAtAddress) {
            this.tAtAddress = tAtAddress;
        }

        public String getVerified() {
            return verified;
        }

        public void setVerified(String verified) {
            this.verified = verified;
        }

        public String getEmailId() {return emailId;}

        public void setEmailId(String emailId) {this.emailId = emailId;}

        public String getPhoneNumber() {return phoneNumber;}

        public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

        @Override
        public String toString() 
        {
            return "Address [addressLine1=" + addressLine1 + ", addressLine2="
                   + addressLine2 + ", city=" + city + ", pin=" + pin + ", state="
                   + state + ", country=" + country + ", line3=" + line3
                   + ", line4=" + line4 + ", village=" + village + ", district="
                   + district + ", distanceFrom=" + distanceFrom + ", landMark="
                   + landMark + "]";
        }
        
        public String toNormalString()
        {
            return "" + buildingName + "," + plotNo + "," + addressLine1 + ","
                    + addressLine2 + ", City:" + city + ", Pincode:" + pin + ", State:"
                    + state + "";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Address)) return false;

            Address address = (Address) o;

            if (getPin() != address.getPin()) return false;
            if (Float.compare(address.getDistanceFrom(), getDistanceFrom()) != 0) return false;
            if (Double.compare(address.getTimeAtAddrss(), getTimeAtAddrss()) != 0) return false;
            if (getAddressLine1() != null ? !getAddressLine1().equals(address.getAddressLine1()) : address.getAddressLine1() != null)
                return false;
            if (getAddressLine2() != null ? !getAddressLine2().equals(address.getAddressLine2()) : address.getAddressLine2() != null)
                return false;
            if (getCity() != null ? !getCity().equals(address.getCity()) : address.getCity() != null) return false;
            if (getState() != null ? !getState().equals(address.getState()) : address.getState() != null) return false;
            if (getCountry() != null ? !getCountry().equals(address.getCountry()) : address.getCountry() != null)
                return false;
            if (getLandLoard() != null ? !getLandLoard().equals(address.getLandLoard()) : address.getLandLoard() != null)
                return false;
            if (getLine3() != null ? !getLine3().equals(address.getLine3()) : address.getLine3() != null) return false;
            if (getLine4() != null ? !getLine4().equals(address.getLine4()) : address.getLine4() != null) return false;
            if (getVillage() != null ? !getVillage().equals(address.getVillage()) : address.getVillage() != null)
                return false;
            if (getTaluka() != null ? !getTaluka().equals(address.getTaluka()) : address.getTaluka() != null)
                return false;
            if (getDistrict() != null ? !getDistrict().equals(address.getDistrict()) : address.getDistrict() != null)
                return false;
            if (getLandMark() != null ? !getLandMark().equals(address.getLandMark()) : address.getLandMark() != null)
                return false;
            if (getOutOfGeoLimit() != null ? !getOutOfGeoLimit().equals(address.getOutOfGeoLimit()) : address.getOutOfGeoLimit() != null)
                return false;
            if (getLandLineNumber() != null ? !getLandLineNumber().equals(address.getLandLineNumber()) : address.getLandLineNumber() != null)
                return false;
            if (getExtensionNumber() != null ? !getExtensionNumber().equals(address.getExtensionNumber()) : address.getExtensionNumber() != null)
                return false;
            if (getTimeAtCity() != null ? !getTimeAtCity().equals(address.getTimeAtCity()) : address.getTimeAtCity() != null)
                return false;
            if (getTimeAtAddr() != null ? !getTimeAtAddr().equals(address.getTimeAtAddr()) : address.getTimeAtAddr() != null)
                return false;
            if (getOgl() != null ? !getOgl().equals(address.getOgl()) : address.getOgl() != null) return false;
            if (getFi() != null ? !getFi().equals(address.getFi()) : address.getFi() != null) return false;
            if (getStd() != null ? !getStd().equals(address.getStd()) : address.getStd() != null) return false;
            if (getExtension() != null ? !getExtension().equals(address.getExtension()) : address.getExtension() != null)
                return false;
            if (getPostOffice() != null ? !getPostOffice().equals(address.getPostOffice()) : address.getPostOffice() != null)
                return false;
            if (getBuildingName() != null ? !getBuildingName().equals(address.getBuildingName()) : address.getBuildingName() != null)
                return false;
            if (getPlotNo() != null ? !getPlotNo().equals(address.getPlotNo()) : address.getPlotNo() != null)
                return false;
            if (getAddressSameAs() != null ? !getAddressSameAs().equals(address.getAddressSameAs()) : address.getAddressSameAs() != null)
                return false;
            if (getCountryCode() != null ? !getCountryCode().equals(address.getCountryCode()) : address.getCountryCode() != null)
                return false;
            if (getL1() != null ? !getL1().equals(address.getL1()) : address.getL1() != null) return false;
            if (getL2() != null ? !getL2().equals(address.getL2()) : address.getL2() != null) return false;
            if (getStateName() != null ? !getStateName().equals(address.getStateName()) : address.getStateName() != null)
                return false;
            if (getCityName() != null ? !getCityName().equals(address.getCityName()) : address.getCityName() != null)
                return false;
            if (getDistrictName() != null ? !getDistrictName().equals(address.getDistrictName()) : address.getDistrictName() != null)
                return false;
            if (getPincode() != null ? !getPincode().equals(address.getPincode()) : address.getPincode() != null)
                return false;
            if (getLandmarkName() != null ? !getLandmarkName().equals(address.getLandmarkName()) : address.getLandmarkName() != null)
                return false;
            if (gettAtAddress() != null ? !gettAtAddress().equals(address.gettAtAddress()) : address.gettAtAddress() != null)
                return false;
            return getVerified() != null ? getVerified().equals(address.getVerified()) : address.getVerified() == null;
        }
    }
