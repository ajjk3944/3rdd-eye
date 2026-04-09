package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f13331a;

    /* renamed from: b, reason: collision with root package name */
    public final n2 f13332b;

    public l2(n2 n2Var, n2 n2Var2) {
        this.f13331a = n2Var;
        this.f13332b = n2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2.class == obj.getClass()) {
            l2 l2Var = (l2) obj;
            if (this.f13331a.equals(l2Var.f13331a) && this.f13332b.equals(l2Var.f13332b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13332b.hashCode() + (this.f13331a.hashCode() * 31);
    }

    public final String toString() {
        n2 n2Var = this.f13331a;
        String string = n2Var.toString();
        n2 n2Var2 = this.f13332b;
        String strConcat = n2Var.equals(n2Var2) ? "" : ", ".concat(n2Var2.toString());
        return a0.g.p(new StringBuilder(r5.c.f(string.length() + 1, 1, strConcat)), "[", string, strConcat, "]");
    }
}
