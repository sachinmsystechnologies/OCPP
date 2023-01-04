package com.chargestation.server.model.auth.response;

public class AdditionalInfo {

    private String additionalIdToken;
    private String type;
    private CustomData customData;

    public String getAdditionalIdToken() {
        return additionalIdToken;
    }

    public void setAdditionalIdToken(String additionalIdToken) {
        this.additionalIdToken = additionalIdToken;
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
}
