package com.lefan.signal.network.webSpeed;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public final class WebSpeedBean {
    private int id;
    private boolean isLoad;
    private boolean isLoading;
    private String logo;
    private String name;
    private double speed;
    private String url;

    public final int getId() {
        return this.id;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getName() {
        return this.name;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isLoad() {
        return this.isLoad;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setLoad(boolean z6) {
        this.isLoad = z6;
    }

    public final void setLoading(boolean z6) {
        this.isLoading = z6;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSpeed(double d6) {
        this.speed = d6;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
