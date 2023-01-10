package com.chargestation.server.model.meter;

import lombok.Data;

@Data
public class CustomData {
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    private String vendorId;
}
