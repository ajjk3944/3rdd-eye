package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class cb1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10073a;

    /* renamed from: b, reason: collision with root package name */
    public final ja1 f10074b;

    public cb1(String str, ja1 ja1Var) {
        this.f10073a = str;
        this.f10074b = ja1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f10074b != ja1.f12700l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1Var = (cb1) obj;
        return cb1Var.f10073a.equals(this.f10073a) && cb1Var.f10074b.equals(this.f10074b);
    }

    public final int hashCode() {
        return Objects.hash(cb1.class, this.f10073a, this.f10074b);
    }

    public final String toString() {
        String str = this.f10074b.f12707b;
        String str2 = this.f10073a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        je.u.B(sb2, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb2.append(")");
        return sb2.toString();
    }
}
