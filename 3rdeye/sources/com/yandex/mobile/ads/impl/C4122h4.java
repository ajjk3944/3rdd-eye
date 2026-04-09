package com.yandex.mobile.ads.impl;

import N7.G8;

/* renamed from: com.yandex.mobile.ads.impl.h4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4122h4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28090a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28091b;

    public C4122h4(int i, int i10) {
        this.f28090a = i;
        this.f28091b = i10;
    }

    public final int a() {
        return this.f28090a;
    }

    public final int b() {
        return this.f28091b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4122h4)) {
            return false;
        }
        C4122h4 c4122h4 = (C4122h4) obj;
        return this.f28090a == c4122h4.f28090a && this.f28091b == c4122h4.f28091b;
    }

    public final int hashCode() {
        return this.f28091b + (this.f28090a * 31);
    }

    public final String toString() {
        return G8.r("AdInfo(adGroupIndex=", this.f28090a, ", adIndexInAdGroup=", this.f28091b, ")");
    }
}
