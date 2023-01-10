package com.chargestation.server.model.meter;

public class SignedMeterValue {

    private String signedMeterData;
    private String signingMethod;

    public String getSignedMeterData() {
        return signedMeterData;
    }

    public void setSignedMeterData(String signedMeterData) {
        this.signedMeterData = signedMeterData;
    }

    public String getSigningMethod() {
        return signingMethod;
    }

    public void setSigningMethod(String signingMethod) {
        this.signingMethod = signingMethod;
    }

    public String getEncodingMethod() {
        return encodingMethod;
    }

    public void setEncodingMethod(String encodingMethod) {
        this.encodingMethod = encodingMethod;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    private String encodingMethod;
    private String publicKey;
    private CustomData customData;
}
