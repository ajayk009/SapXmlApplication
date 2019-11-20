package com.softcell.gonogo.model.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yogeshb
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Name implements Serializable {

	@JsonProperty("sFirstName")
	// @NotBlank(groups =
	// {UpdateReferencesRequest.FetchGrp.class,BankingDetailsRequest.FetchGrp.class})
	private String firstName;

	@JsonProperty("sMiddleName")
	private String middleName;

	@JsonProperty("sLastName")
	// @NotBlank(groups =
	// {UpdateReferencesRequest.FetchGrp.class,BankingDetailsRequest.FetchGrp.class})
	private String lastName;

	@JsonProperty("sPrefix")
	private String prefix;

	@JsonProperty("sSuffix")
	private String suffix;

	@JsonProperty("sCompleteName")
	private String completeName;

	@JsonProperty("sNameTransferor")
	private String nameTransferor;

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * Method return the applicants full name in the format: Prefix FirstName
	 * MiddleName LastName Suffix
	 * 
	 * @return
	 */

	public String getFullName() {
		StringBuilder stringBuilder = new StringBuilder();
		if (StringUtils.isNotEmpty(this.prefix)) {
			stringBuilder.append(this.prefix).append(" ");
		}
		if (StringUtils.isNotEmpty(this.firstName)) {
			stringBuilder.append(this.firstName).append(" ");
		}
		if (StringUtils.isNotEmpty(this.middleName)) {
			stringBuilder.append(this.middleName).append(" ");
		}
		if (StringUtils.isNotEmpty(this.lastName)) {
			stringBuilder.append(this.lastName).append(" ");
		}
		if (StringUtils.isNotEmpty(this.suffix)) {
			stringBuilder.append(this.suffix);
		}
		return stringBuilder.toString();
	}

	public String getCompleteName() {
		if (StringUtils.isNotEmpty(this.firstName)) {
			StringBuilder stringBuilder = new StringBuilder();
			if (StringUtils.isNotEmpty(this.firstName)) {
				stringBuilder.append(this.firstName).append(" ");
			}
			if (StringUtils.isNotEmpty(this.middleName)) {
				stringBuilder.append(this.middleName).append(" ");
			}
			if (StringUtils.isNotEmpty(this.lastName)) {
				stringBuilder.append(this.lastName);
			}
			return stringBuilder.toString();
		} else {
			return StringUtils.replace(completeName, "  ", " ");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name [firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", prefix=");
		builder.append(prefix);
		builder.append(", suffix=");
		builder.append(suffix);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Name))
			return false;

		Name name = (Name) o;

		if (getFirstName() != null ? !getFirstName().equals(name.getFirstName()) : name.getFirstName() != null)
			return false;
		if (getMiddleName() != null ? !getMiddleName().equals(name.getMiddleName()) : name.getMiddleName() != null)
			return false;
		if (getLastName() != null ? !getLastName().equals(name.getLastName()) : name.getLastName() != null)
			return false;
		if (getPrefix() != null ? !getPrefix().equals(name.getPrefix()) : name.getPrefix() != null)
			return false;
		if (getSuffix() != null ? !getSuffix().equals(name.getSuffix()) : name.getSuffix() != null)
			return false;
		return getCompleteName() != null ? getCompleteName().equals(name.getCompleteName())
				: name.getCompleteName() == null;
	}

}
