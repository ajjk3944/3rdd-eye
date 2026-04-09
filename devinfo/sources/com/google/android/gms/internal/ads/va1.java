package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class va1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f17575a;

    /* renamed from: b, reason: collision with root package name */
    public final ka1 f17576b;

    public va1(int i4, ka1 ka1Var) {
        this.f17575a = i4;
        this.f17576b = ka1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f17576b != ka1.f13101h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof va1)) {
            return false;
        }
        va1 va1Var = (va1) obj;
        return va1Var.f17575a == this.f17575a && va1Var.f17576b == this.f17576b;
    }

    public final int hashCode() {
        return Objects.hash(va1.class, Integer.valueOf(this.f17575a), this.f17576b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17576b);
        int length = strValueOf.length();
        int i4 = this.f17575a;
        StringBuilder sb2 = new StringBuilder(length + 33 + String.valueOf(i4).length() + 10);
        sb2.append("AesGcmSiv Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i4);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
