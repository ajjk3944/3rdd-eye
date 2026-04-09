package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class o6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f31204a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31205b;

    public o6(boolean z10, int i) {
        this.f31204a = i;
        this.f31205b = z10;
    }

    public final boolean a() {
        return this.f31205b;
    }

    public final int b() {
        return this.f31204a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return this.f31204a == o6Var.f31204a && this.f31205b == o6Var.f31205b;
    }

    public final int hashCode() {
        return (this.f31205b ? 1231 : 1237) + (this.f31204a * 31);
    }

    public final String toString() {
        return "AdQualityVerificationNetworkConfiguration(usagePercent=" + this.f31204a + ", disabled=" + this.f31205b + ")";
    }
}
