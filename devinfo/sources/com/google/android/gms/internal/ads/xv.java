package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xv {

    /* renamed from: a, reason: collision with root package name */
    public final ya.c0 f18514a;

    public xv(ya.c0 c0Var) {
        this.f18514a = c0Var;
    }

    public final void a(int i4, long j) {
        long j8;
        pk pkVar = sk.R0;
        va.s sVar = va.s.f36163e;
        if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
            return;
        }
        ya.c0 c0Var = this.f18514a;
        c0Var.m();
        synchronized (c0Var.f37402a) {
            j8 = c0Var.D;
        }
        if (j - j8 < 0) {
            ya.a0.m("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) sVar.f36166c.a(sk.S0)).booleanValue()) {
            c0Var.c(i4);
            c0Var.d(j);
        } else {
            c0Var.c(-1);
            c0Var.d(j);
        }
    }
}
