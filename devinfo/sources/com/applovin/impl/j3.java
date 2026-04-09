package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4328a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdFormat f4329b;

    public j3(String str, MaxAdFormat maxAdFormat) {
        this.f4328a = str;
        this.f4329b = maxAdFormat;
    }

    public boolean a(Object obj) {
        return obj instanceof j3;
    }

    public String b() {
        return this.f4328a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        if (!j3Var.a(this)) {
            return false;
        }
        String strB = b();
        String strB2 = j3Var.b();
        if (strB != null ? !strB.equals(strB2) : strB2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatA = a();
        MaxAdFormat maxAdFormatA2 = j3Var.a();
        return maxAdFormatA != null ? maxAdFormatA.equals(maxAdFormatA2) : maxAdFormatA2 == null;
    }

    public int hashCode() {
        String strB = b();
        int iHashCode = strB == null ? 43 : strB.hashCode();
        MaxAdFormat maxAdFormatA = a();
        return ((iHashCode + 59) * 59) + (maxAdFormatA != null ? maxAdFormatA.hashCode() : 43);
    }

    public String toString() {
        return this.f4328a + "-" + this.f4329b.getLabel();
    }

    public MaxAdFormat a() {
        return this.f4329b;
    }

    public static j3 a(String str) {
        String[] strArrSplit = str.split("-");
        return new j3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }
}
