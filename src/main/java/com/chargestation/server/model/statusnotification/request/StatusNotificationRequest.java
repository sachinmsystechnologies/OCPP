package com.chargestation.server.model.statusnotification.request;

import lombok.Data;

@Data
public class StatusNotificationRequest {

    private String timestamp;
    private String connectorStatus;
    private int evseId;
    private int connectorId;
    private CustomData customData;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getConnectorStatus() {
        return connectorStatus;
    }

    public void setConnectorStatus(String connectorStatus) {
        this.connectorStatus = connectorStatus;
    }

    public int getEvseId() {
        return evseId;
    }

    public void setEvseId(int evseId) {
        this.evseId = evseId;
    }

    public int getConnectorId() {
        return connectorId;
    }

    public void setConnectorId(int connectorId) {
        this.connectorId = connectorId;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }



}
