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
public class Email implements Serializable {

    @JsonProperty("sEmailType")
    private String emailType;

    @JsonProperty("sEmailAddr")
    private String emailAddress;

    @JsonProperty("bVerified")
    private boolean verified;

    @JsonProperty("bDomainCheck")
    private boolean domainCheck;

    @JsonIgnore
    @Transient
    private List<Character> emailID = new ArrayList<>();

    public List<Character> getEmailID() {
        return emailID;
    }

    public boolean isDomainCheck() {
        return domainCheck;
    }

    public void setDomainCheck(boolean domainCheck) {
        this.domainCheck = domainCheck;
    }

    public void setEmailID(List<Character> emailID) {
        this.emailID = emailID;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getEmailType() {
        return emailType;
    }

    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Email [emailType=");
        builder.append(emailType);
        builder.append(", emailAddress=");
        builder.append(emailAddress);
        builder.append("]");
        return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email)) return false;

        Email email = (Email) o;

        if (isVerified() != email.isVerified()) return false;
        if (getEmailType() != null ? !getEmailType().equals(email.getEmailType()) : email.getEmailType() != null)
            return false;
        return getEmailAddress() != null ? getEmailAddress().equals(email.getEmailAddress()) : email.getEmailAddress() == null;
    }
}
