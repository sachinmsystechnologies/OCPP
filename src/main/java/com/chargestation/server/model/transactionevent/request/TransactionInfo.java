package com.chargestation.server.model.transactionevent.request;

import lombok.Data;

@Data
public class TransactionInfo {

    private String transactionId;
    private CustomData customData;
    private String chargingState;
    private int timeSpentCharging;
    private String stoppedReason;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
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

    public int getRemoteStartId() {
        return remoteStartId;
    }

    public void setRemoteStartId(int remoteStartId) {
        this.remoteStartId = remoteStartId;
    }

    private int remoteStartId;

}
