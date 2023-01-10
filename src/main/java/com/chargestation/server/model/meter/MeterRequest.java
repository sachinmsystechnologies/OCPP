package com.chargestation.server.model.meter;

import java.util.ArrayList;

public class MeterRequest {

    private int evseId;

    public int getEvseId() {
        return evseId;
    }

    public void setEvseId(int evseId) {
        this.evseId = evseId;
    }

    public ArrayList<MeterValue> getMeterValue() {
        return meterValue;
    }

    public void setMeterValue(ArrayList<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    private ArrayList<MeterValue> meterValue;
    private CustomData customData;
}
