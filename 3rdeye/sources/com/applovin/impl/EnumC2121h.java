package com.applovin.impl;

/* renamed from: com.applovin.impl.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2121h {
    PUBLISHER_INITIATED("publisher_initiated"),
    SEQUENTIAL_OR_PRECACHE("sequential_or_precache"),
    REFRESH("refresh"),
    EXPONENTIAL_RETRY("exponential_retry"),
    EXPIRED("expired"),
    NATIVE_AD_PLACER("native_ad_placer");


    /* renamed from: a, reason: collision with root package name */
    private final String f19462a;

    EnumC2121h(String str) {
        this.f19462a = str;
    }

    public String b() {
        return this.f19462a;
    }
}
