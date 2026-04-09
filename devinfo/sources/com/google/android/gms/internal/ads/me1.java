package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class me1 extends xe1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13881a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13882b;

    /* renamed from: c, reason: collision with root package name */
    public final m91 f13883c;

    public me1(int i4, int i10, m91 m91Var) {
        this.f13881a = i4;
        this.f13882b = i10;
        this.f13883c = m91Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f13883c != m91.f13819q;
    }

    public final int b() {
        m91 m91Var = m91.f13819q;
        int i4 = this.f13882b;
        m91 m91Var2 = this.f13883c;
        if (m91Var2 == m91Var) {
            return i4;
        }
        if (m91Var2 == m91.f13816n || m91Var2 == m91.f13817o || m91Var2 == m91.f13818p) {
            return i4 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof me1)) {
            return false;
        }
        me1 me1Var = (me1) obj;
        return me1Var.f13881a == this.f13881a && me1Var.b() == b() && me1Var.f13883c == this.f13883c;
    }

    public final int hashCode() {
        return Objects.hash(me1.class, Integer.valueOf(this.f13881a), Integer.valueOf(this.f13882b), this.f13883c);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13883c);
        int length = strValueOf.length();
        int i4 = this.f13882b;
        int length2 = String.valueOf(i4).length();
        int i10 = this.f13881a;
        StringBuilder sb2 = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i10).length() + 10);
        sb2.append("AES-CMAC Parameters (variant: ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(i4);
        return je.u.v(sb2, "-byte tags, and ", i10, "-byte key)");
    }
}
