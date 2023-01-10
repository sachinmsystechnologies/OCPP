package com.chargestation.server.model.common;

import com.fasterxml.jackson.databind.JsonNode;

public class OCCPServerMessage {

    //Generic
    private String emvID;
    private String triggerReason;
    private String eventType;

    ///Boot
    private String chargingStationModel;
    private String bootStatus;

    ///Auth
    private String authorizationStatus;

    ///Transaction
    private String transactionId;
    private String chargingState;
    private int timeSpentCharging;
    private String stoppedReason;
    private String meterValue;

    //Notification
    private String ConnectorStatus;
    //HB
    private String currentTime;

    public String getMeterValue() {
        return meterValue;
    }

    public void setMeterValue(String meterValue) {
        this.meterValue = meterValue;
    }




    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public String getConnectorStatus() {
        return ConnectorStatus;
    }
    public void setConnectorStatus(String connectorStatus) {
        ConnectorStatus = connectorStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAuthorizationStatus() {
        return authorizationStatus;
    }
    public void setAuthorizationStatus(String authorizationStatus) {
        this.authorizationStatus = authorizationStatus;
    }

    public String getBootStatus() {
        return bootStatus;
    }

    public void setBootStatus(String bootStatus) {
        this.bootStatus = bootStatus;
    }

    public String getChargingStationModel() {
        return chargingStationModel;
    }

    public void setChargingStationModel(String chargingStationModel) {
        this.chargingStationModel = chargingStationModel;
    }

    public String getChargingState() {
        return chargingState;
    }

    public void setChargingState(String chargingState) {
        this.chargingState = chargingState;
    }

    public int getTimeSpentCharging() {
        return timeSpentCharging;
    }

    public void setTimeSpentCharging(int timeSpentCharging) {
        this.timeSpentCharging = timeSpentCharging;
    }

    public String getStoppedReason() {
        return stoppedReason;
    }

    public void setStoppedReason(String stoppedReason) {
        this.stoppedReason = stoppedReason;
    }

    public String getEmvID() {
        return emvID;
    }

    public void setEmvID(String emvID) {
        this.emvID = emvID;
    }

    public String getTriggerReason() {
        return triggerReason;
    }

    public void setTriggerReason(String triggerReason) {
        this.triggerReason = triggerReason;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }


}
