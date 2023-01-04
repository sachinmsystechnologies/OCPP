package com.chargestation.server.model.transactionevent.request;

import lombok.Data;

import java.util.ArrayList;
@Data
public class IdToken {

    private String idToken;
    private String type;

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

    private CustomData customData;
    private ArrayList<AdditionalInfo> additionalInfo;
}
