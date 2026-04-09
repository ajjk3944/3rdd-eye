package com.yandex.mobile.ads.impl;

import N7.G8;

/* loaded from: classes3.dex */
public final class yg2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35798a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35799b;

    public yg2(int i, int i10) {
        this.f35798a = i;
        this.f35799b = i10;
    }

    public final int a() {
        return this.f35799b;
    }

    public final int b() {
        return this.f35798a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg2)) {
            return false;
        }
        yg2 yg2Var = (yg2) obj;
        return this.f35798a == yg2Var.f35798a && this.f35799b == yg2Var.f35799b;
    }

    public final int hashCode() {
        return this.f35799b + (this.f35798a * 31);
    }

    public final String toString() {
        return G8.r("ViewSize(width=", this.f35798a, ", height=", this.f35799b, ")");
    }
}
