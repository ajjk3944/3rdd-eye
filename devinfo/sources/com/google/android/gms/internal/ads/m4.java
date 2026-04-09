package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f13751b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13752c;

    public m4(String str, String str2, String str3) {
        super(str);
        this.f13751b = str2;
        this.f13752c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m4.class == obj.getClass()) {
            m4 m4Var = (m4) obj;
            if (this.f11366a.equals(m4Var.f11366a) && Objects.equals(this.f13751b, m4Var.f13751b) && Objects.equals(this.f13752c, m4Var.f13752c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f11366a.hashCode() + 527;
        String str = this.f13751b;
        return this.f13752c.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length() + 6;
        String str2 = this.f13752c;
        return r5.c.m(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
