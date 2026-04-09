package com.yandex.mobile.ads.impl;

import N7.G8;

/* loaded from: classes3.dex */
public final class zg2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f36494a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36495b;

    public zg2(int i, int i10) {
        this.f36494a = i;
        this.f36495b = i10;
    }

    public final int a() {
        return this.f36495b;
    }

    public final int b() {
        return this.f36494a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zg2)) {
            return false;
        }
        zg2 zg2Var = (zg2) obj;
        return this.f36494a == zg2Var.f36494a && this.f36495b == zg2Var.f36495b;
    }

    public final int hashCode() {
        return this.f36495b + (this.f36494a * 31);
    }

    public final String toString() {
        return G8.r("ViewSize(width=", this.f36494a, ", height=", this.f36495b, ")");
    }
}
