package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.pJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688pJ extends KG {

    /* renamed from: e, reason: collision with root package name */
    public static final BigInteger f16156e = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f16157a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f16158b;

    /* renamed from: c, reason: collision with root package name */
    public final C1634oJ f16159c;

    /* renamed from: d, reason: collision with root package name */
    public final C1580nJ f16160d;

    public C1688pJ(int i, BigInteger bigInteger, C1634oJ c1634oJ, C1580nJ c1580nJ) {
        this.f16157a = i;
        this.f16158b = bigInteger;
        this.f16159c = c1634oJ;
        this.f16160d = c1580nJ;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f16159c != C1634oJ.f15931e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1688pJ)) {
            return false;
        }
        C1688pJ c1688pJ = (C1688pJ) obj;
        return c1688pJ.f16157a == this.f16157a && Objects.equals(c1688pJ.f16158b, this.f16158b) && c1688pJ.f16159c == this.f16159c && c1688pJ.f16160d == this.f16160d;
    }

    public final int hashCode() {
        return Objects.hash(C1688pJ.class, Integer.valueOf(this.f16157a), this.f16158b, this.f16159c, this.f16160d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f16159c);
        String strValueOf2 = String.valueOf(this.f16160d);
        String strValueOf3 = String.valueOf(this.f16158b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f16157a;
        StringBuilder sb = new StringBuilder(length + 47 + length2 + 18 + length3 + 6 + String.valueOf(i).length() + 13);
        A.f.w(sb, "RSA SSA PKCS1 Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        sb.append(", publicExponent: ");
        sb.append(strValueOf3);
        sb.append(", and ");
        sb.append(i);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
