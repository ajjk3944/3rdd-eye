package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class b1 {
    protected int zza;

    public final byte[] a() {
        try {
            p1 p1Var = (p1) this;
            int iE = p1Var.e();
            byte[] bArr = new byte[iE];
            h1 h1Var = new h1(bArr, iE);
            l2 l2VarA = i2.f20149c.a(p1Var.getClass());
            a2 a2Var = h1Var.f20138b;
            if (a2Var == null) {
                a2Var = new a2(h1Var);
            }
            l2VarA.f(p1Var, a2Var);
            if (iE - h1Var.f20141e == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            throw new RuntimeException(d.h.t("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
        }
    }

    public abstract int b(l2 l2Var);
}
