package com.lefan.signal.ui.noise;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public final class NoiseBean implements Serializable {
    private String address;
    private float avgValue;
    private int id;
    private Double lat;
    private Double lon;
    private float maxValue;
    private float minValue;
    private List<Float> step;
    private long time;

    public final String getAddress() {
        return this.address;
    }

    public final float getAvgValue() {
        return this.avgValue;
    }

    public final int getId() {
        return this.id;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLon() {
        return this.lon;
    }

    public final float getMaxValue() {
        return this.maxValue;
    }

    public final float getMinValue() {
        return this.minValue;
    }

    public final List<Float> getStep() {
        return this.step;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final void setAvgValue(float f2) {
        this.avgValue = f2;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLat(Double d6) {
        this.lat = d6;
    }

    public final void setLon(Double d6) {
        this.lon = d6;
    }

    public final void setMaxValue(float f2) {
        this.maxValue = f2;
    }

    public final void setMinValue(float f2) {
        this.minValue = f2;
    }

    public final void setStep(List<Float> list) {
        this.step = list;
    }

    public final void setTime(long j6) {
        this.time = j6;
    }
}
