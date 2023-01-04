package com.chargestation.server.model.statusnotification.response;

public class StatusNotificationResponse {

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }


    private CustomData customData;
}
