package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10313b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10314c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10315d;

    public d4(String str, String str2, String str3) {
        super("COMM");
        this.f10313b = str;
        this.f10314c = str2;
        this.f10315d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d4.class == obj.getClass()) {
            d4 d4Var = (d4) obj;
            if (Objects.equals(this.f10314c, d4Var.f10314c) && Objects.equals(this.f10313b, d4Var.f10313b) && Objects.equals(this.f10315d, d4Var.f10315d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f10314c.hashCode() + ((this.f10313b.hashCode() + 527) * 31);
        String str = this.f10315d;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.g4
    public final String toString() {
        String str = this.f11366a;
        int length = String.valueOf(str).length();
        String str2 = this.f10315d;
        int length2 = String.valueOf(str2).length();
        String str3 = this.f10313b;
        int length3 = str3.length() + length + 11 + 14;
        String str4 = this.f10314c;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3 + 7 + length2);
        je.u.B(sb2, str, ": language=", str3, ", description=");
        return r5.c.m(sb2, str4, ", text=", str2);
    }
}
