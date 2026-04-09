package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ck1 extends xe1 {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f10149e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f10150a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f10151b;

    /* renamed from: c, reason: collision with root package name */
    public final bk1 f10152c;

    /* renamed from: d, reason: collision with root package name */
    public final ak1 f10153d;

    public ck1(int i4, BigInteger bigInteger, bk1 bk1Var, ak1 ak1Var) {
        this.f10150a = i4;
        this.f10151b = bigInteger;
        this.f10152c = bk1Var;
        this.f10153d = ak1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f10152c != bk1.f9707e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ck1)) {
            return false;
        }
        ck1 ck1Var = (ck1) obj;
        return ck1Var.f10150a == this.f10150a && Objects.equals(ck1Var.f10151b, this.f10151b) && ck1Var.f10152c == this.f10152c && ck1Var.f10153d == this.f10153d;
    }

    public final int hashCode() {
        return Objects.hash(ck1.class, Integer.valueOf(this.f10150a), this.f10151b, this.f10152c, this.f10153d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10152c);
        String strValueOf2 = String.valueOf(this.f10153d);
        String strValueOf3 = String.valueOf(this.f10151b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i4 = this.f10150a;
        StringBuilder sb2 = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i4).length() + 13);
        je.u.B(sb2, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb2.append(", publicExponent: ");
        sb2.append(strValueOf3);
        sb2.append(", and ");
        sb2.append(i4);
        sb2.append("-bit modulus)");
        return sb2.toString();
    }
}
