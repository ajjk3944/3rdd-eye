package com.applovin.mediation.nativeAds.adPlacer;

import N7.H7;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f21985a;

    /* renamed from: b, reason: collision with root package name */
    private String f21986b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f21987c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f21988d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f21989e = 256;

    /* renamed from: f, reason: collision with root package name */
    private int f21990f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f21985a = str;
    }

    public void addFixedPosition(int i) {
        this.f21987c.add(Integer.valueOf(i));
    }

    public String getAdUnitId() {
        return this.f21985a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f21987c;
    }

    public int getMaxAdCount() {
        return this.f21989e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f21990f;
    }

    public String getPlacement() {
        return this.f21986b;
    }

    public int getRepeatingInterval() {
        return this.f21988d;
    }

    public boolean hasValidPositioning() {
        return !this.f21987c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f21988d >= 2;
    }

    public void resetFixedPositions() {
        this.f21987c.clear();
    }

    public void setMaxAdCount(int i) {
        this.f21989e = i;
    }

    public void setMaxPreloadedAdCount(int i) {
        this.f21990f = i;
    }

    public void setPlacement(String str) {
        this.f21986b = str;
    }

    public void setRepeatingInterval(int i) {
        if (i >= 2) {
            this.f21988d = i;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i);
            return;
        }
        this.f21988d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i + ", which is less than minimum value of 2");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdPlacerSettings{adUnitId='");
        sb.append(this.f21985a);
        sb.append("', fixedPositions=");
        sb.append(this.f21987c);
        sb.append(", repeatingInterval=");
        sb.append(this.f21988d);
        sb.append(", maxAdCount=");
        sb.append(this.f21989e);
        sb.append(", maxPreloadedAdCount=");
        return H7.p(sb, this.f21990f, '}');
    }
}
