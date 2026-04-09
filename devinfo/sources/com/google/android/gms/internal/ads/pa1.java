package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pa1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14951a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14952b;

    /* renamed from: c, reason: collision with root package name */
    public final m91 f14953c;

    public pa1(int i4, int i10, m91 m91Var) {
        this.f14951a = i4;
        this.f14952b = i10;
        this.f14953c = m91Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f14953c != m91.f13811h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa1)) {
            return false;
        }
        pa1 pa1Var = (pa1) obj;
        return pa1Var.f14951a == this.f14951a && pa1Var.f14952b == this.f14952b && pa1Var.f14953c == this.f14953c;
    }

    public final int hashCode() {
        return Objects.hash(pa1.class, Integer.valueOf(this.f14951a), Integer.valueOf(this.f14952b), 16, this.f14953c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f14953c);
        int length = strValueOf.length();
        int i4 = this.f14952b;
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(16).length();
        int i10 = this.f14951a;
        StringBuilder sb2 = new StringBuilder(je.u.l(length + 30 + length2 + 10 + length3, 15, String.valueOf(i10).length(), 10));
        sb2.append("AesEax Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i4);
        return je.u.v(sb2, "-byte IV, 16-byte tag, and ", i10, "-byte key)");
    }
}
