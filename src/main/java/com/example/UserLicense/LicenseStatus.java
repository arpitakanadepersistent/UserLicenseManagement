package com.example.UserLicense;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

public class LicenseStatus {

    private String licenseKey;

    private String licenseKeyStatus;

    private long licenseId;

    private long orderId;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public LicenseStatus(long licenseId) {
        super();
        this.licenseId = licenseId;
        this.licenseKeyStatus = "NOT CONSUMED";
    }

    public LicenseStatus() {
        super();
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getLicenseKeyStatus() {
        return licenseKeyStatus;
    }

    public void setLicenseKeyStatus(String licenseKeyStatus) {
        this.licenseKeyStatus = licenseKeyStatus;
    }

    public long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(long licenseId) {
        this.licenseId = licenseId;
    }
}
