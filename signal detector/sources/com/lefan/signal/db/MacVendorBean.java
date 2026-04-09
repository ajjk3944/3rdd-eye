package com.lefan.signal.db;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public final class MacVendorBean {
    private String brand;
    private int id;
    private String mac;

    public final String getBrand() {
        return this.brand;
    }

    public final int getId() {
        return this.id;
    }

    public final String getMac() {
        return this.mac;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setMac(String str) {
        this.mac = str;
    }
}
