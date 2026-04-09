package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class XI extends KG {

    /* renamed from: a, reason: collision with root package name */
    public final C2006vE f12408a;

    /* renamed from: b, reason: collision with root package name */
    public final WI f12409b;

    /* renamed from: c, reason: collision with root package name */
    public final C1952uE f12410c;

    /* renamed from: d, reason: collision with root package name */
    public final AE f12411d;

    public XI(C2006vE c2006vE, WI wi, C1952uE c1952uE, AE ae) {
        this.f12408a = c2006vE;
        this.f12409b = wi;
        this.f12410c = c1952uE;
        this.f12411d = ae;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f12411d != AE.f6966n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof XI)) {
            return false;
        }
        XI xi = (XI) obj;
        return xi.f12408a == this.f12408a && xi.f12409b == this.f12409b && xi.f12410c == this.f12410c && xi.f12411d == this.f12411d;
    }

    public final int hashCode() {
        return Objects.hash(XI.class, this.f12408a, this.f12409b, this.f12410c, this.f12411d);
    }

    public final String toString() {
        String str = this.f12411d.f6968b;
        int length = str.length();
        String str2 = this.f12410c.f17093b;
        int length2 = str2.length();
        String str3 = this.f12408a.f17247b;
        int length3 = str3.length();
        String str4 = this.f12409b.f12199a;
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        A.f.w(sb, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        A.f.w(sb, ", encoding: ", str3, ", curve: ", str4);
        sb.append(")");
        return sb.toString();
    }
}
