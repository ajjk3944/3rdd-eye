package com.lefan.signal.db;

import U4.b;
import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import q5.i;

@Keep
/* loaded from: classes.dex */
public final class CellInfoBean implements Serializable {
    private String address;
    private String cell_id;
    private int id;
    private boolean isRegistered;
    private Double latitude;
    private Double longitude;
    private double radius;
    private List<b> cellInfoItems = new ArrayList();
    private int connectionStatus = -1;
    private boolean isIntent = true;

    public final String getAddress() {
        return this.address;
    }

    public final List<b> getCellInfoItems() {
        return this.cellInfoItems;
    }

    public final String getCell_id() {
        return this.cell_id;
    }

    public final int getConnectionStatus() {
        return this.connectionStatus;
    }

    public final int getId() {
        return this.id;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final double getRadius() {
        return this.radius;
    }

    public final boolean isIntent() {
        return this.isIntent;
    }

    public final boolean isRegistered() {
        return this.isRegistered;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setCellInfoItems(List<b> list) {
        i.e(list, "<set-?>");
        this.cellInfoItems = list;
    }

    public final void setCell_id(String str) {
        this.cell_id = str;
    }

    public final void setConnectionStatus(int i) {
        this.connectionStatus = i;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setIntent(boolean z6) {
        this.isIntent = z6;
    }

    public final void setLatitude(Double d6) {
        this.latitude = d6;
    }

    public final void setLongitude(Double d6) {
        this.longitude = d6;
    }

    public final void setRadius(double d6) {
        this.radius = d6;
    }

    public final void setRegistered(boolean z6) {
        this.isRegistered = z6;
    }
}
