package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.xJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2119xJ extends KG {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f17569g = BigInteger.valueOf(65537);

    /* renamed from: a, reason: collision with root package name */
    public final int f17570a;

    /* renamed from: b, reason: collision with root package name */
    public final BigInteger f17571b;

    /* renamed from: c, reason: collision with root package name */
    public final C2065wJ f17572c;

    /* renamed from: d, reason: collision with root package name */
    public final C2011vJ f17573d;

    /* renamed from: e, reason: collision with root package name */
    public final C2011vJ f17574e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17575f;

    public C2119xJ(int i, BigInteger bigInteger, C2065wJ c2065wJ, C2011vJ c2011vJ, C2011vJ c2011vJ2, int i3) {
        this.f17570a = i;
        this.f17571b = bigInteger;
        this.f17572c = c2065wJ;
        this.f17573d = c2011vJ;
        this.f17574e = c2011vJ2;
        this.f17575f = i3;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f17572c != C2065wJ.f17421e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2119xJ)) {
            return false;
        }
        C2119xJ c2119xJ = (C2119xJ) obj;
        return c2119xJ.f17570a == this.f17570a && Objects.equals(c2119xJ.f17571b, this.f17571b) && Objects.equals(c2119xJ.f17572c, this.f17572c) && Objects.equals(c2119xJ.f17573d, this.f17573d) && Objects.equals(c2119xJ.f17574e, this.f17574e) && c2119xJ.f17575f == this.f17575f;
    }

    public final int hashCode() {
        return Objects.hash(C2119xJ.class, Integer.valueOf(this.f17570a), this.f17571b, this.f17572c, this.f17573d, this.f17574e, Integer.valueOf(this.f17575f));
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17572c);
        String strValueOf2 = String.valueOf(this.f17573d);
        String strValueOf3 = String.valueOf(this.f17574e);
        String strValueOf4 = String.valueOf(this.f17571b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        int i = this.f17575f;
        int length4 = String.valueOf(i).length();
        int length5 = strValueOf4.length();
        int i3 = this.f17570a;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 17 + length3 + 19 + length4 + 18 + length5 + 6 + String.valueOf(i3).length() + 13);
        A.f.w(sb, "RSA SSA PSS Parameters (variant: ", strValueOf, ", signature hashType: ", strValueOf2);
        sb.append(", mgf1 hashType: ");
        sb.append(strValueOf3);
        sb.append(", saltLengthBytes: ");
        sb.append(i);
        sb.append(", publicExponent: ");
        sb.append(strValueOf4);
        sb.append(", and ");
        sb.append(i3);
        sb.append("-bit modulus)");
        return sb.toString();
    }
}
