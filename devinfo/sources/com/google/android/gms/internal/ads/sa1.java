package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sa1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15940a;

    /* renamed from: b, reason: collision with root package name */
    public final ja1 f15941b;

    public sa1(int i4, ja1 ja1Var) {
        this.f15940a = i4;
        this.f15941b = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f15941b != ja1.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sa1)) {
            return false;
        }
        sa1 sa1Var = (sa1) obj;
        return sa1Var.f15940a == this.f15940a && sa1Var.f15941b == this.f15941b;
    }

    public final int hashCode() {
        return Objects.hash(sa1.class, Integer.valueOf(this.f15940a), 12, 16, this.f15941b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15941b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i4 = this.f15940a;
        StringBuilder sb2 = new StringBuilder(je.u.l(length + 30 + length2 + 10 + length3, 15, String.valueOf(i4).length(), 10));
        sb2.append("AesGcm Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", 12-byte IV, 16-byte tag, and ");
        sb2.append(i4);
        sb2.append("-byte key)");
        return sb2.toString();
    }
}
