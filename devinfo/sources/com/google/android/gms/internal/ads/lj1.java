package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lj1 extends xe1 {

    /* renamed from: a, reason: collision with root package name */
    public final ka1 f13507a;

    /* renamed from: b, reason: collision with root package name */
    public final kj1 f13508b;

    /* renamed from: c, reason: collision with root package name */
    public final ja1 f13509c;

    /* renamed from: d, reason: collision with root package name */
    public final m91 f13510d;

    public lj1(ka1 ka1Var, kj1 kj1Var, ja1 ja1Var, m91 m91Var) {
        this.f13507a = ka1Var;
        this.f13508b = kj1Var;
        this.f13509c = ja1Var;
        this.f13510d = m91Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f13510d != m91.f13823u;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lj1)) {
            return false;
        }
        lj1 lj1Var = (lj1) obj;
        return lj1Var.f13507a == this.f13507a && lj1Var.f13508b == this.f13508b && lj1Var.f13509c == this.f13509c && lj1Var.f13510d == this.f13510d;
    }

    public final int hashCode() {
        return Objects.hash(lj1.class, this.f13507a, this.f13508b, this.f13509c, this.f13510d);
    }

    public final String toString() {
        String str = this.f13510d.f13825b;
        int length = str.length();
        String str2 = this.f13509c.f12707b;
        int length2 = str2.length();
        String str3 = this.f13507a.f13113b;
        int length3 = str3.length();
        String str4 = this.f13508b.f13175a;
        StringBuilder sb2 = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + str4.length() + 1);
        je.u.B(sb2, "ECDSA Parameters (variant: ", str, ", hashType: ", str2);
        je.u.B(sb2, ", encoding: ", str3, ", curve: ", str4);
        sb2.append(")");
        return sb2.toString();
    }
}
