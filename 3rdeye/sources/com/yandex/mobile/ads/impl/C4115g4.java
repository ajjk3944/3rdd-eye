package com.yandex.mobile.ads.impl;

import N7.G8;

/* renamed from: com.yandex.mobile.ads.impl.g4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4115g4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f27536a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27537b;

    public C4115g4(int i, int i10) {
        this.f27536a = i;
        this.f27537b = i10;
    }

    public final int a() {
        return this.f27536a;
    }

    public final int b() {
        return this.f27537b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4115g4)) {
            return false;
        }
        C4115g4 c4115g4 = (C4115g4) obj;
        return this.f27536a == c4115g4.f27536a && this.f27537b == c4115g4.f27537b;
    }

    public final int hashCode() {
        return this.f27537b + (this.f27536a * 31);
    }

    public final String toString() {
        return G8.r("AdInfo(adGroupIndex=", this.f27536a, ", adIndexInAdGroup=", this.f27537b, ")");
    }
}
