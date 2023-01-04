package com.chargestation.server.model.transactionevent.request;

import lombok.Data;

import java.util.ArrayList;
@Data
public class TransactionEventRequest {
    private String eventType;
    private String timestamp;
    private String triggerReason;
    private int seqNo;
    private TransactionInfo transactionInfo;
    private CustomData customData;
    private ArrayList<MeterValue> meterValue;
    private boolean offline;
    private int numberOfPhasesUsed;
    private int cableMaxCurrent;
    private int reservationId;
    private Evse evse;
    private IdToken idToken;

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTriggerReason() {
        return triggerReason;
    }

    public void setTriggerReason(String triggerReason) {
        this.triggerReason = triggerReason;
    }

    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }

    public ArrayList<MeterValue> getMeterValue() {
        return meterValue;
    }

    public void setMeterValue(ArrayList<MeterValue> meterValue) {
        this.meterValue = meterValue;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public int getNumberOfPhasesUsed() {
        return numberOfPhasesUsed;
    }

    public void setNumberOfPhasesUsed(int numberOfPhasesUsed) {
        this.numberOfPhasesUsed = numberOfPhasesUsed;
    }

    public int getCableMaxCurrent() {
        return cableMaxCurrent;
    }

    public void setCableMaxCurrent(int cableMaxCurrent) {
        this.cableMaxCurrent = cableMaxCurrent;
    }

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public Evse getEvse() {
        return evse;
    }

    public void setEvse(Evse evse) {
        this.evse = evse;
    }

    public IdToken getIdToken() {
        return idToken;
    }

    public void setIdToken(IdToken idToken) {
        this.idToken = idToken;
    }
}
