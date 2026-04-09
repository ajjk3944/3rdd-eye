package com.google.android.gms.internal.ads;

import j$.util.Objects;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class HG extends KG {

    /* renamed from: a, reason: collision with root package name */
    public final int f8882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8883b;

    /* renamed from: c, reason: collision with root package name */
    public final GG f8884c;

    /* renamed from: d, reason: collision with root package name */
    public final FG f8885d;

    public HG(int i, int i3, GG gg, FG fg) {
        this.f8882a = i;
        this.f8883b = i3;
        this.f8884c = gg;
        this.f8885d = fg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f8884c != GG.f8346e;
    }

    public final int b() {
        GG gg = GG.f8346e;
        int i = this.f8883b;
        GG gg2 = this.f8884c;
        if (gg2 == gg) {
            return i;
        }
        if (gg2 == GG.f8343b || gg2 == GG.f8344c || gg2 == GG.f8345d) {
            return i + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HG)) {
            return false;
        }
        HG hg = (HG) obj;
        return hg.f8882a == this.f8882a && hg.b() == b() && hg.f8884c == this.f8884c && hg.f8885d == this.f8885d;
    }

    public final int hashCode() {
        return Objects.hash(HG.class, Integer.valueOf(this.f8882a), Integer.valueOf(this.f8883b), this.f8884c, this.f8885d);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8884c);
        String strValueOf2 = String.valueOf(this.f8885d);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int i = this.f8883b;
        int length3 = String.valueOf(i).length();
        int i3 = this.f8882a;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i3).length() + 10);
        A.f.w(sb, "HMAC Parameters (variant: ", strValueOf, ", hashType: ", strValueOf2);
        AbstractC2763b.h(sb, ", ", i, "-byte tags, and ", i3);
        sb.append("-byte key)");
        return sb.toString();
    }
}
