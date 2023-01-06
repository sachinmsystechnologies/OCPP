package com.chargestation.server.model.transactionevent.request;

import lombok.Data;

import java.util.ArrayList;
@Data
public class MeterValue {

    private String timestamp;
    private ArrayList<SampledValue> sampledValue;
    private CustomData customData;

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public ArrayList<SampledValue> getSampledValue() {
        return sampledValue;
    }
    public void setSampledValue(ArrayList<SampledValue> sampledValue) {
        this.sampledValue = sampledValue;
    }
    public CustomData getCustomData() {
        return customData;
    }
    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }



}
