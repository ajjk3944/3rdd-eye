package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cx {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f25795a;

    public cx(boolean z10) {
        this.f25795a = z10;
    }

    public final boolean a() {
        return this.f25795a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx) && this.f25795a == ((cx) obj).f25795a;
    }

    public final int hashCode() {
        return this.f25795a ? 1231 : 1237;
    }

    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f25795a + ")";
    }
}
