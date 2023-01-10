package com.chargestation.server.model.common;

import com.fasterxml.jackson.databind.JsonNode;

public class OCPPResponse {

    private String emvID;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String triggerReason;
    private String eventType;
    private String message;
}
