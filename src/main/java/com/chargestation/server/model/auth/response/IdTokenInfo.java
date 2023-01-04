package com.chargestation.server.model.auth.response;

import java.util.ArrayList;

public class IdTokenInfo {

    private String status;
    private CustomData customData;
    private String cacheExpiryDateTime;
    private int chargingPriority;
    private String language1;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public String getCacheExpiryDateTime() {
        return cacheExpiryDateTime;
    }

    public void setCacheExpiryDateTime(String cacheExpiryDateTime) {
        this.cacheExpiryDateTime = cacheExpiryDateTime;
    }

    public int getChargingPriority() {
        return chargingPriority;
    }

    public void setChargingPriority(int chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    public String getLanguage1() {
        return language1;
    }

    public void setLanguage1(String language1) {
        this.language1 = language1;
    }

    public ArrayList getEvseId() {
        return evseId;
    }

    public void setEvseId(ArrayList evseId) {
        this.evseId = evseId;
    }

    public GroupIdToken getGroupIdToken() {
        return groupIdToken;
    }

    public void setGroupIdToken(GroupIdToken groupIdToken) {
        this.groupIdToken = groupIdToken;
    }

    public String getLanguage2() {
        return language2;
    }

    public void setLanguage2(String language2) {
        this.language2 = language2;
    }

    public PersonalMessage getPersonalMessage() {
        return personalMessage;
    }

    public void setPersonalMessage(PersonalMessage personalMessage) {
        this.personalMessage = personalMessage;
    }

    private ArrayList evseId;
    private GroupIdToken groupIdToken;
    private String language2;
    private PersonalMessage personalMessage;
}
