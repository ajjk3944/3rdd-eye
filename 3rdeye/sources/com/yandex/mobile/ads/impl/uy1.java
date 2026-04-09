package com.yandex.mobile.ads.impl;

import N7.G8;

/* loaded from: classes3.dex */
public final class uy1 implements Comparable<uy1> {

    /* renamed from: b, reason: collision with root package name */
    private final int f34251b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34252c;

    public uy1(int i, int i10) {
        this.f34251b = i;
        this.f34252c = i10;
    }

    public final int a() {
        return this.f34252c;
    }

    public final int b() {
        return this.f34251b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(uy1 uy1Var) {
        uy1 other = uy1Var;
        kotlin.jvm.internal.l.f(other, "other");
        return kotlin.jvm.internal.l.h(this.f34251b * this.f34252c, other.f34251b * other.f34252c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy1)) {
            return false;
        }
        uy1 uy1Var = (uy1) obj;
        return this.f34251b == uy1Var.f34251b && this.f34252c == uy1Var.f34252c;
    }

    public final int hashCode() {
        return this.f34252c + (this.f34251b * 31);
    }

    public final String toString() {
        return G8.r("Size(width=", this.f34251b, ", height=", this.f34252c, ")");
    }
}
