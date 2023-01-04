package com.chargestation.server.model.transactionevent.response;

import lombok.Data;

import java.util.ArrayList;
@Data
public class GroupIdToken {

    private String idToken;
    private String type;
    private CustomData customData;
    private ArrayList<AdditionalInfo> additionalInfo;

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public ArrayList<AdditionalInfo> getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(ArrayList<AdditionalInfo> additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
