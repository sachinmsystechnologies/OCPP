package com.chargestation.server.model.common;

import com.fasterxml.jackson.databind.JsonNode;

public class OCCPServerMessage {


    private String chargingState;
    private int timeSpentCharging;
    private String stoppedReason;
    private String emvID;
    private String triggerReason;
    private String eventType;

    private String unit;
    private int multiplier;

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

}
