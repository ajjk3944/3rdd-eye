package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.zG, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2224zG extends KG {

    /* renamed from: a, reason: collision with root package name */
    public final int f17850a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17851b;

    /* renamed from: c, reason: collision with root package name */
    public final YD f17852c;

    public C2224zG(int i, int i3, YD yd) {
        this.f17850a = i;
        this.f17851b = i3;
        this.f17852c = yd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f17852c != YD.f12605F;
    }

    public final int b() {
        YD yd = YD.f12605F;
        int i = this.f17851b;
        YD yd2 = this.f17852c;
        if (yd2 == yd) {
            return i;
        }
        if (yd2 == YD.f12602C || yd2 == YD.f12603D || yd2 == YD.f12604E) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2224zG)) {
            return false;
        }
        C2224zG c2224zG = (C2224zG) obj;
        return c2224zG.f17850a == this.f17850a && c2224zG.b() == b() && c2224zG.f17852c == this.f17852c;
    }

    public final int hashCode() {
        return Objects.hash(C2224zG.class, Integer.valueOf(this.f17850a), Integer.valueOf(this.f17851b), this.f17852c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f17852c);
        int length = strValueOf.length();
        int i = this.f17851b;
        int length2 = String.valueOf(i).length();
        int i3 = this.f17850a;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i3).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return A.f.n(sb, "-byte tags, and ", i3, "-byte key)");
    }
}
