package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26132a;

    public dd(boolean z10) {
        this.f26132a = z10;
    }

    public final boolean a() {
        return this.f26132a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd) && this.f26132a == ((dd) obj).f26132a;
    }

    public final int hashCode() {
        return this.f26132a ? 1231 : 1237;
    }

    public final String toString() {
        return "AnalyticsIntegrationConfiguration(advertisingIdentifiersTracking=" + this.f26132a + ")";
    }
}
