package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ThirdPartyException
{

	
	 @JsonProperty("sType")
	    private String type;

	    @JsonProperty("sMsg")
	    private String message;

	    public String getType() {
	        return type;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public static Builder builder(){
	        return new Builder();
	    }

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("SerialNumberValidationException{");
	        sb.append("type='").append(type).append('\'');
	        sb.append(", message='").append(message).append('\'');
	        sb.append('}');
	        return sb.toString();
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;

	        ThirdPartyException that = (ThirdPartyException) o;

	        if (type != null ? !type.equals(that.type) : that.type != null) return false;
	        return message != null ? message.equals(that.message) : that.message == null;
	    }

	    @Override
	    public int hashCode() {
	        int result = type != null ? type.hashCode() : 0;
	        result = 31 * result + (message != null ? message.hashCode() : 0);
	        return result;
	    }

	    public static class Builder {

	        private ThirdPartyException error = new ThirdPartyException();

	        public ThirdPartyException build() {
	            return error;
	        }

	        public Builder type(String type) {
	            this.error.type = type;
	            return this;
	        }

	        public Builder message(String message) {
	            this.error.message = message;
	            return this;
	        }
	    }
}
