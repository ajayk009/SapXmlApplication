package com.softcell.gonogo.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.softcell.gonogo.model.request.core.Header;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * This is specific to DMZ
 *
 * @author bhuvneshk
 */
public class DmzRequest {


    @JsonProperty("oHeader")
    @NotNull(groups = {Header.FetchGrp.class, Header.InstWithProductGrp.class})
    @Valid
    private Header header;

    @JsonProperty("sRefID")
    @NotEmpty(groups = {DmzRequest.FetchGrp.class})
    private String gonogoRefId;

    @JsonProperty("sActionName")
    @NotNull(groups = {DmzRequest.ConnectDealer.class})
    private ActionName actionName;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public String getGonogoRefId() {
        return gonogoRefId;
    }

    public void setGonogoRefId(String gonogoRefId) {
        this.gonogoRefId = gonogoRefId;
    }

    public ActionName getActionName() {
        return actionName;
    }

    public void setActionName(ActionName actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DmzRequest{");
        sb.append("header=").append(header);
        sb.append(", gonogoRefId='").append(gonogoRefId).append('\'');
        sb.append(", actionName=").append(actionName);
        sb.append('}');
        return sb.toString();
    }

    public interface FetchGrp {
    }

    public interface ConnectDealer {
    }

}
