package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class BE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final int f7319a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7320b;

    /* renamed from: c, reason: collision with root package name */
    public final AE f7321c;

    public BE(int i, int i3, AE ae) {
        this.f7319a = i;
        this.f7320b = i3;
        this.f7321c = ae;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f7321c != AE.f6958e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BE)) {
            return false;
        }
        BE be = (BE) obj;
        return be.f7319a == this.f7319a && be.f7320b == this.f7320b && be.f7321c == this.f7321c;
    }

    public final int hashCode() {
        return Objects.hash(BE.class, Integer.valueOf(this.f7319a), Integer.valueOf(this.f7320b), 16, this.f7321c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7321c);
        int length = strValueOf.length();
        int i = this.f7320b;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i3 = this.f7319a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i3).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        return A.f.n(sb, "-byte IV, 16-byte tag, and ", i3, "-byte key)");
    }
}
