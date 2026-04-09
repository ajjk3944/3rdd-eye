package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class EE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final int f7931a;

    /* renamed from: b, reason: collision with root package name */
    public final YD f7932b;

    public EE(int i, YD yd) {
        this.f7931a = i;
        this.f7932b = yd;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f7932b != YD.f12611h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof EE)) {
            return false;
        }
        EE ee = (EE) obj;
        return ee.f7931a == this.f7931a && ee.f7932b == this.f7932b;
    }

    public final int hashCode() {
        return Objects.hash(EE.class, Integer.valueOf(this.f7931a), 12, 16, this.f7932b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f7932b);
        int length = strValueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i = this.f7931a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", 12-byte IV, 16-byte tag, and ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
