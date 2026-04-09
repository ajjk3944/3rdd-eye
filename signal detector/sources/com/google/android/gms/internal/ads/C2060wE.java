package com.google.android.gms.internal.ads;

import j$.util.Objects;
import o4.AbstractC2763b;

/* renamed from: com.google.android.gms.internal.ads.wE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2060wE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final int f17409a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17412d;

    /* renamed from: e, reason: collision with root package name */
    public final C2006vE f17413e;

    /* renamed from: f, reason: collision with root package name */
    public final C1952uE f17414f;

    public C2060wE(int i, int i3, int i6, int i7, C2006vE c2006vE, C1952uE c1952uE) {
        this.f17409a = i;
        this.f17410b = i3;
        this.f17411c = i6;
        this.f17412d = i7;
        this.f17413e = c2006vE;
        this.f17414f = c1952uE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f17413e != C2006vE.f17239e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2060wE)) {
            return false;
        }
        C2060wE c2060wE = (C2060wE) obj;
        return c2060wE.f17409a == this.f17409a && c2060wE.f17410b == this.f17410b && c2060wE.f17411c == this.f17411c && c2060wE.f17412d == this.f17412d && c2060wE.f17413e == this.f17413e && c2060wE.f17414f == this.f17414f;
    }

    public final int hashCode() {
        return Objects.hash(C2060wE.class, Integer.valueOf(this.f17409a), Integer.valueOf(this.f17410b), Integer.valueOf(this.f17411c), Integer.valueOf(this.f17412d), this.f17413e, this.f17414f);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17413e);
        String strValueOf2 = String.valueOf(this.f17414f);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.f17411c;
        int length3 = String.valueOf(i).length();
        int i3 = this.f17412d;
        int length4 = String.valueOf(i3).length();
        int i6 = this.f17409a;
        int length5 = String.valueOf(i6).length();
        int i7 = this.f17410b;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i7).length() + 15);
        A.f.w(sb, "AesCtrHmacAead Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        AbstractC2763b.h(sb, ", ", i, "-byte IV, and ", i3);
        AbstractC2763b.h(sb, "-byte tags, and ", i6, "-byte AES key, and ", i7);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
