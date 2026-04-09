package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35642a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f35643b;

    public y6(boolean z10, int i) {
        this.f35642a = i;
        this.f35643b = z10;
    }

    public final boolean a() {
        return this.f35643b;
    }

    public final int b() {
        return this.f35642a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return this.f35642a == y6Var.f35642a && this.f35643b == y6Var.f35643b;
    }

    public final int hashCode() {
        return (this.f35643b ? 1231 : 1237) + (this.f35642a * 31);
    }

    public final String toString() {
        return "AdQualityVerifierNetworkConfiguration(usagePercent=" + this.f35642a + ", disabled=" + this.f35643b + ")";
    }
}
