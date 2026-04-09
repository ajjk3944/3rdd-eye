package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class HE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final int f8878a;

    /* renamed from: b, reason: collision with root package name */
    public final C1952uE f8879b;

    public HE(int i, C1952uE c1952uE) {
        this.f8878a = i;
        this.f8879b = c1952uE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f8879b != C1952uE.f17087j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HE)) {
            return false;
        }
        HE he = (HE) obj;
        return he.f8878a == this.f8878a && he.f8879b == this.f8879b;
    }

    public final int hashCode() {
        return Objects.hash(HE.class, Integer.valueOf(this.f8878a), this.f8879b);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f8879b);
        int length = strValueOf.length();
        int i = this.f8878a;
        StringBuilder sb = new StringBuilder(length + 33 + String.valueOf(i).length() + 10);
        sb.append("AesGcmSiv Parameters (variant: ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }
}
