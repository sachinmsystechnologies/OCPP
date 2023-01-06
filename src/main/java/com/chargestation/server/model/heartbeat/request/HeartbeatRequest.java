package com.chargestation.server.model.heartbeat.request;

import com.chargestation.server.model.transactionevent.request.CustomData;

public class HeartbeatRequest {
    private CustomData customData;

    public CustomData getCustomData() {
        return customData;
    }

    public void setCustomData(CustomData customData) {
        this.customData = customData;
    }
}
