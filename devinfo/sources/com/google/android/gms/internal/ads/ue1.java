package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ue1 extends xe1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17192a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17193b;

    /* renamed from: c, reason: collision with root package name */
    public final te1 f17194c;

    /* renamed from: d, reason: collision with root package name */
    public final se1 f17195d;

    public ue1(int i4, int i10, te1 te1Var, se1 se1Var) {
        this.f17192a = i4;
        this.f17193b = i10;
        this.f17194c = te1Var;
        this.f17195d = se1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f17194c != te1.f16801e;
    }

    public final int b() {
        te1 te1Var = te1.f16801e;
        int i4 = this.f17193b;
        te1 te1Var2 = this.f17194c;
        if (te1Var2 == te1Var) {
            return i4;
        }
        if (te1Var2 == te1.f16798b || te1Var2 == te1.f16799c || te1Var2 == te1.f16800d) {
            return i4 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ue1)) {
            return false;
        }
        ue1 ue1Var = (ue1) obj;
        return ue1Var.f17192a == this.f17192a && ue1Var.b() == b() && ue1Var.f17194c == this.f17194c && ue1Var.f17195d == this.f17195d;
    }

    public final int hashCode() {
        return Objects.hash(ue1.class, Integer.valueOf(this.f17192a), Integer.valueOf(this.f17193b), this.f17194c, this.f17195d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17194c);
        String strValueOf2 = String.valueOf(this.f17195d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i4 = this.f17193b;
        int length3 = String.valueOf(i4).length();
        int i10 = this.f17192a;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i10).length() + 10);
        je.u.B(sb2, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        r5.c.q(i4, i10, ", ", "-byte tags, and ", sb2);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
