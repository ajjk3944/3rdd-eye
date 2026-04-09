package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n31 implements l31 {

    /* renamed from: a, reason: collision with root package name */
    public final q31 f14142a = new q31();

    /* renamed from: b, reason: collision with root package name */
    public volatile l31 f14143b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14144c;

    public n31(l31 l31Var) {
        this.f14143b = l31Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final Object b() {
        l31 l31Var = this.f14143b;
        tk0 tk0Var = tk0.f16850p;
        if (l31Var != tk0Var) {
            synchronized (this.f14142a) {
                try {
                    if (this.f14143b != tk0Var) {
                        Object objB = this.f14143b.b();
                        this.f14144c = objB;
                        this.f14143b = tk0Var;
                        return objB;
                    }
                } finally {
                }
            }
        }
        return this.f14144c;
    }

    public final String toString() {
        Object objM = this.f14143b;
        if (objM == tk0.f16850p) {
            String strValueOf = String.valueOf(this.f14144c);
            objM = r5.c.m(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objM);
        return r5.c.m(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }
}
