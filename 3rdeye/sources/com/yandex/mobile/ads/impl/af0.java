package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class af0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24634a;

    public af0(boolean z10) {
        this.f24634a = z10;
    }

    public final boolean a() {
        return this.f24634a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af0) && this.f24634a == ((af0) obj).f24634a;
    }

    public final int hashCode() {
        return this.f24634a ? 1231 : 1237;
    }

    public final String toString() {
        return "HandledAction(shouldTrackClick=" + this.f24634a + ")";
    }
}
