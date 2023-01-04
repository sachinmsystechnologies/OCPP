package com.chargestation.server.model.transactionevent.response;

import lombok.Data;

@Data
public class TransactionEventResponse {
    private CustomData customData;
    private double totalCost;
    private int chargingPriority;
    private IdTokenInfo idTokenInfo;

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public int getChargingPriority() {
        return chargingPriority;
    }

    public void setChargingPriority(int chargingPriority) {
        this.chargingPriority = chargingPriority;
    }

    public IdTokenInfo getIdTokenInfo() {
        return idTokenInfo;
    }

    public void setIdTokenInfo(IdTokenInfo idTokenInfo) {
        this.idTokenInfo = idTokenInfo;
    }

    public UpdatedPersonalMessage getUpdatedPersonalMessage() {
        return updatedPersonalMessage;
    }

    public void setUpdatedPersonalMessage(UpdatedPersonalMessage updatedPersonalMessage) {
        this.updatedPersonalMessage = updatedPersonalMessage;
    }

    private UpdatedPersonalMessage updatedPersonalMessage;
}
