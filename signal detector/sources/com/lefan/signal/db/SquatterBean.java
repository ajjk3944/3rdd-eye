package com.lefan.signal.db;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
public final class SquatterBean implements Serializable {
    private String brand;
    private String host;
    private int id;
    private String ip;
    private boolean isKnown;
    private boolean isMy;
    private String mac;
    private int type;

    public final String getBrand() {
        return this.brand;
    }

    public final String getHost() {
        return this.host;
    }

    public final int getId() {
        return this.id;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getMac() {
        return this.mac;
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isKnown() {
        return this.isKnown;
    }

    public final boolean isMy() {
        return this.isMy;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setHost(String str) {
        this.host = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setIp(String str) {
        this.ip = str;
    }

    public final void setKnown(boolean z6) {
        this.isKnown = z6;
    }

    public final void setMac(String str) {
        this.mac = str;
    }

    public final void setMy(boolean z6) {
        this.isMy = z6;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
