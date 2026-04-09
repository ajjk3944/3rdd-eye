package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y3 implements c8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18619e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18620f;

    public y3(String str, boolean z3, int i4, String str2, int i10, String str3) {
        boolean z10 = true;
        if (i10 != -1 && i10 <= 0) {
            z10 = false;
        }
        mq0.m(z10);
        this.f18615a = i4;
        this.f18616b = str;
        this.f18617c = str2;
        this.f18618d = str3;
        this.f18619e = z3;
        this.f18620f = i10;
    }

    @Override // com.google.android.gms.internal.ads.c8
    public final void a(o6 o6Var) {
        String str = this.f18617c;
        if (str != null) {
            o6Var.f14587x = str;
        }
        String str2 = this.f18616b;
        if (str2 != null) {
            o6Var.f14586w = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y3.class == obj.getClass()) {
            y3 y3Var = (y3) obj;
            if (this.f18615a == y3Var.f18615a && Objects.equals(this.f18616b, y3Var.f18616b) && Objects.equals(this.f18617c, y3Var.f18617c) && Objects.equals(this.f18618d, y3Var.f18618d) && this.f18619e == y3Var.f18619e && this.f18620f == y3Var.f18620f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18616b;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f18617c;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        int i4 = ((this.f18615a + 527) * 31) + iHashCode;
        String str3 = this.f18618d;
        return (((((((i4 * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f18619e ? 1 : 0)) * 31) + this.f18620f;
    }

    public final String toString() {
        String str = this.f18617c;
        int length = String.valueOf(str).length();
        String str2 = this.f18616b;
        int length2 = String.valueOf(str2).length();
        int i4 = this.f18615a;
        int length3 = String.valueOf(i4).length();
        int i10 = this.f18620f;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i10).length());
        je.u.B(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return je.u.q(i4, i10, "\", bitrate=", ", metadataInterval=", sb2);
    }
}
