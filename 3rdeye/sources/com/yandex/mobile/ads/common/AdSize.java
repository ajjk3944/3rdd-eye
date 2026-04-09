package com.yandex.mobile.ads.common;

import N7.G8;

/* loaded from: classes3.dex */
public final class AdSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f23989a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23990b;

    public AdSize(int i, int i10) {
        this.f23989a = i;
        this.f23990b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdSize.class.equals(obj.getClass())) {
            AdSize adSize = (AdSize) obj;
            if (this.f23989a == adSize.f23989a && this.f23990b == adSize.f23990b) {
                return true;
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.f23990b;
    }

    public final int getWidth() {
        return this.f23989a;
    }

    public int hashCode() {
        return (this.f23989a * 31) + this.f23990b;
    }

    public String toString() {
        return G8.r("AdSize (width=", this.f23989a, ", height=", this.f23990b, ")");
    }
}
