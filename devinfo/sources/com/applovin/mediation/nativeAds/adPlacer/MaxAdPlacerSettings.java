package com.applovin.mediation.nativeAds.adPlacer;

import com.applovin.impl.sdk.o;
import d.h;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f6414a;

    /* renamed from: b, reason: collision with root package name */
    private String f6415b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f6416c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f6417d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f6418e = 256;

    /* renamed from: f, reason: collision with root package name */
    private int f6419f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f6414a = str;
    }

    public void addFixedPosition(int i4) {
        this.f6416c.add(Integer.valueOf(i4));
    }

    public String getAdUnitId() {
        return this.f6414a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f6416c;
    }

    public int getMaxAdCount() {
        return this.f6418e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f6419f;
    }

    public String getPlacement() {
        return this.f6415b;
    }

    public int getRepeatingInterval() {
        return this.f6417d;
    }

    public boolean hasValidPositioning() {
        return !this.f6416c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f6417d >= 2;
    }

    public void resetFixedPositions() {
        this.f6416c.clear();
    }

    public void setMaxAdCount(int i4) {
        this.f6418e = i4;
    }

    public void setMaxPreloadedAdCount(int i4) {
        this.f6419f = i4;
    }

    public void setPlacement(String str) {
        this.f6415b = str;
    }

    public void setRepeatingInterval(int i4) {
        if (i4 >= 2) {
            this.f6417d = i4;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i4);
            return;
        }
        this.f6417d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i4 + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb2.append(this.f6414a);
        sb2.append("', fixedPositions=");
        sb2.append(this.f6416c);
        sb2.append(", repeatingInterval=");
        sb2.append(this.f6417d);
        sb2.append(", maxAdCount=");
        sb2.append(this.f6418e);
        sb2.append(", maxPreloadedAdCount=");
        return h.u(sb2, this.f6419f, '}');
    }
}
