package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xz1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f35551a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35552b;

    /* renamed from: c, reason: collision with root package name */
    private final int f35553c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35554d;

    /* renamed from: e, reason: collision with root package name */
    private final int f35555e;

    public xz1(int i, int i10, int i11, int i12) {
        this.f35551a = i;
        this.f35552b = i10;
        this.f35553c = i11;
        this.f35554d = i12;
        this.f35555e = i11 * i12;
    }

    public final int a() {
        return this.f35555e;
    }

    public final int b() {
        return this.f35554d;
    }

    public final int c() {
        return this.f35553c;
    }

    public final int d() {
        return this.f35551a;
    }

    public final int e() {
        return this.f35552b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz1)) {
            return false;
        }
        xz1 xz1Var = (xz1) obj;
        return this.f35551a == xz1Var.f35551a && this.f35552b == xz1Var.f35552b && this.f35553c == xz1Var.f35553c && this.f35554d == xz1Var.f35554d;
    }

    public final int hashCode() {
        return this.f35554d + sx1.a(this.f35553c, sx1.a(this.f35552b, this.f35551a * 31, 31), 31);
    }

    public final String toString() {
        int i = this.f35551a;
        int i10 = this.f35552b;
        int i11 = this.f35553c;
        int i12 = this.f35554d;
        StringBuilder sbI = androidx.work.s.i("SmartCenter(x=", i, ", y=", i10, ", width=");
        sbI.append(i11);
        sbI.append(", height=");
        sbI.append(i12);
        sbI.append(")");
        return sbI.toString();
    }
}
