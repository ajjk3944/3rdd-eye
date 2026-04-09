package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class la1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13435b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13436c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13437d;

    /* renamed from: e, reason: collision with root package name */
    public final ka1 f13438e;

    /* renamed from: f, reason: collision with root package name */
    public final ja1 f13439f;

    public la1(int i4, int i10, int i11, int i12, ka1 ka1Var, ja1 ja1Var) {
        this.f13434a = i4;
        this.f13435b = i10;
        this.f13436c = i11;
        this.f13437d = i12;
        this.f13438e = ka1Var;
        this.f13439f = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f13438e != ka1.f13099e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1Var = (la1) obj;
        return la1Var.f13434a == this.f13434a && la1Var.f13435b == this.f13435b && la1Var.f13436c == this.f13436c && la1Var.f13437d == this.f13437d && la1Var.f13438e == this.f13438e && la1Var.f13439f == this.f13439f;
    }

    public final int hashCode() {
        return Objects.hash(la1.class, Integer.valueOf(this.f13434a), Integer.valueOf(this.f13435b), Integer.valueOf(this.f13436c), Integer.valueOf(this.f13437d), this.f13438e, this.f13439f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13438e);
        String strValueOf2 = String.valueOf(this.f13439f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i4 = this.f13436c;
        int length3 = String.valueOf(i4).length();
        int i10 = this.f13437d;
        int length4 = String.valueOf(i10).length();
        int i11 = this.f13434a;
        int length5 = String.valueOf(i11).length();
        int i12 = this.f13435b;
        StringBuilder sb2 = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i12).length() + 15);
        je.u.B(sb2, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        r5.c.q(i4, i10, ", ", "-byte IV, and ", sb2);
        r5.c.q(i11, i12, "-byte tags, and ", "-byte AES key, and ", sb2);
        sb2.append("-byte HMAC key)");
        return sb2.toString();
    }
}
