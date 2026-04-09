package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ux {

    /* renamed from: a, reason: collision with root package name */
    private final String f34234a;

    /* renamed from: b, reason: collision with root package name */
    private final vx f34235b;

    public ux(String sdkVersion, vx sdkIntegrationStatusData) {
        kotlin.jvm.internal.l.f(sdkVersion, "sdkVersion");
        kotlin.jvm.internal.l.f(sdkIntegrationStatusData, "sdkIntegrationStatusData");
        this.f34234a = sdkVersion;
        this.f34235b = sdkIntegrationStatusData;
    }

    public final vx a() {
        return this.f34235b;
    }

    public final String b() {
        return this.f34234a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux)) {
            return false;
        }
        ux uxVar = (ux) obj;
        return kotlin.jvm.internal.l.b(this.f34234a, uxVar.f34234a) && kotlin.jvm.internal.l.b(this.f34235b, uxVar.f34235b);
    }

    public final int hashCode() {
        return this.f34235b.hashCode() + (this.f34234a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f34234a + ", sdkIntegrationStatusData=" + this.f34235b + ")";
    }
}
