package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kk1 extends xe1 {
    public static final BigInteger g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f13183a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f13184b;

    /* renamed from: c, reason: collision with root package name */
    public final jk1 f13185c;

    /* renamed from: d, reason: collision with root package name */
    public final ik1 f13186d;

    /* renamed from: e, reason: collision with root package name */
    public final ik1 f13187e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13188f;

    public kk1(int i4, BigInteger bigInteger, jk1 jk1Var, ik1 ik1Var, ik1 ik1Var2, int i10) {
        this.f13183a = i4;
        this.f13184b = bigInteger;
        this.f13185c = jk1Var;
        this.f13186d = ik1Var;
        this.f13187e = ik1Var2;
        this.f13188f = i10;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f13185c != jk1.f12773e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kk1)) {
            return false;
        }
        kk1 kk1Var = (kk1) obj;
        return kk1Var.f13183a == this.f13183a && Objects.equals(kk1Var.f13184b, this.f13184b) && Objects.equals(kk1Var.f13185c, this.f13185c) && Objects.equals(kk1Var.f13186d, this.f13186d) && Objects.equals(kk1Var.f13187e, this.f13187e) && kk1Var.f13188f == this.f13188f;
    }

    public final int hashCode() {
        return Objects.hash(kk1.class, Integer.valueOf(this.f13183a), this.f13184b, this.f13185c, this.f13186d, this.f13187e, Integer.valueOf(this.f13188f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13185c);
        String strValueOf2 = String.valueOf(this.f13186d);
        String strValueOf3 = String.valueOf(this.f13187e);
        String strValueOf4 = String.valueOf(this.f13184b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i4 = this.f13188f;
        int length4 = String.valueOf(i4).length();
        int length5 = strValueOf4.length();
        int i10 = this.f13183a;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i10).length() + 13);
        je.u.B(sb2, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb2.append(", mgf1 hashType: ");
        sb2.append(strValueOf3);
        sb2.append(", saltLengthBytes: ");
        sb2.append(i4);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf4);
        sb2.append(", and ");
        sb2.append(i10);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
