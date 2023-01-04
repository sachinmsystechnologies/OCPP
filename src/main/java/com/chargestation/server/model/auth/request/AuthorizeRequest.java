package com.chargestation.server.model.auth.request;

import java.util.ArrayList;

public class AuthorizeRequest {

    private IdToken idToken;
    private CustomData customData;

    public IdToken getIdToken() {
        return idToken;
    }

    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public ArrayList<Iso15118CertificateHashDatum> getIso15118CertificateHashData() {
        return iso15118CertificateHashData;
    }

    public void setIso15118CertificateHashData(ArrayList<Iso15118CertificateHashDatum> iso15118CertificateHashData) {
        this.iso15118CertificateHashData = iso15118CertificateHashData;
    }

    private String certificate;
    private ArrayList<Iso15118CertificateHashDatum> iso15118CertificateHashData;

}
