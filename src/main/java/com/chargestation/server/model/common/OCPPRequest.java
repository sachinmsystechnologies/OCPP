package com.chargestation.server.model.common;

import com.fasterxml.jackson.databind.JsonNode;

public class OCPPRequest {

    private String emvID;
    private String triggerReason;
    private JsonNode data;
    private String eventType;

    public JsonNode getData() {
        return data;
    }

    public void setData(JsonNode data) {
        this.data = data;
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
