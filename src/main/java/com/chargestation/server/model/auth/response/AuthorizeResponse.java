package com.chargestation.server.model.auth.response;

public class AuthorizeResponse {

    private IdTokenInfo idTokenInfo;
    private CustomData customData;

    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public String getCertificateStatus() {
        return certificateStatus;
    }

    public void setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
    }

    private String certificateStatus;
}
