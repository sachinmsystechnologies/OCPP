package com.chargestation.server.model.transactionevent.request;

import lombok.Data;

@Data
public class UnitOfMeasure {

    private CustomData customData;
    private String unit;
    private int multiplier;

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
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
