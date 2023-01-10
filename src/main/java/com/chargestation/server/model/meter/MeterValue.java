package com.chargestation.server.model.meter;

import java.util.ArrayList;

public class MeterValue {
    private String timestamp;

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

    private ArrayList<SampledValue> sampledValue;
    private CustomData customData;
}
