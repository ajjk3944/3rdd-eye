package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class zl1 {
    public String a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final bm1 c() {
        if (this instanceof bm1) {
            return (bm1) this;
        }
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final dm1 d() {
        if (this instanceof dm1) {
            return (dm1) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            pm1 pm1Var = new pm1(new b5.e1(1, sb2));
            pm1Var.f15053h = 1;
            nm1.f14334a.getClass();
            mm1.J(pm1Var, this);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
