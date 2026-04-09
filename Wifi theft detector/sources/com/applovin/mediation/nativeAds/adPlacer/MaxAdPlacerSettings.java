package com.applovin.mediation.nativeAds.adPlacer;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.o;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class MaxAdPlacerSettings {
    public static final int MIN_REPEATING_INTERVAL = 2;

    /* renamed from: a, reason: collision with root package name */
    private final String f8896a;

    /* renamed from: b, reason: collision with root package name */
    private String f8897b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8898c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    private int f8899d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f8900e = 256;

    /* renamed from: f, reason: collision with root package name */
    private int f8901f = 4;

    public MaxAdPlacerSettings(String str) {
        this.f8896a = str;
    }

    public void addFixedPosition(int i10) {
        this.f8898c.add(Integer.valueOf(i10));
    }

    public String getAdUnitId() {
        return this.f8896a;
    }

    public Set<Integer> getFixedPositions() {
        return this.f8898c;
    }

    public int getMaxAdCount() {
        return this.f8900e;
    }

    public int getMaxPreloadedAdCount() {
        return this.f8901f;
    }

    @Nullable
    public String getPlacement() {
        return this.f8897b;
    }

    public int getRepeatingInterval() {
        return this.f8899d;
    }

    public boolean hasValidPositioning() {
        return !this.f8898c.isEmpty() || isRepeatingEnabled();
    }

    public boolean isRepeatingEnabled() {
        return this.f8899d >= 2;
    }

    public void resetFixedPositions() {
        this.f8898c.clear();
    }

    public void setMaxAdCount(int i10) {
        this.f8900e = i10;
    }

    public void setMaxPreloadedAdCount(int i10) {
        this.f8901f = i10;
    }

    public void setPlacement(@Nullable String str) {
        this.f8897b = str;
    }

    public void setRepeatingInterval(int i10) {
        if (i10 >= 2) {
            this.f8899d = i10;
            o.g("MaxAdPlacerSettings", "Repeating interval set to " + i10);
            return;
        }
        this.f8899d = 0;
        o.j("MaxAdPlacerSettings", "Repeating interval has been disabled, since it has been set to " + i10 + ", which is less than minimum value of 2");
    }

    @NonNull
    public String toString() {
        return "MaxAdPlacerSettings{adUnitId='" + this.f8896a + "', fixedPositions=" + this.f8898c + ", repeatingInterval=" + this.f8899d + ", maxAdCount=" + this.f8900e + ", maxPreloadedAdCount=" + this.f8901f + '}';
    }
}
