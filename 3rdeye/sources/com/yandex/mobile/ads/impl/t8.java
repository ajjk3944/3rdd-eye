package com.yandex.mobile.ads.impl;

import N7.G8;

/* loaded from: classes3.dex */
public final class t8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33477a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33478b;

    public t8(int i, int i10) {
        this.f33477a = i;
        this.f33478b = i10;
    }

    public final int a() {
        return this.f33478b;
    }

    public final int b() {
        return this.f33477a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return this.f33477a == t8Var.f33477a && this.f33478b == t8Var.f33478b;
    }

    public final int hashCode() {
        return this.f33478b + (this.f33477a * 31);
    }

    public final String toString() {
        return G8.r("AdSize(width=", this.f33477a, ", height=", this.f33478b, ")");
    }
}
