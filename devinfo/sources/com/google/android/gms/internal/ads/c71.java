package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c71 extends e71 {
    @Override // com.google.android.gms.internal.ads.e71
    public final /* synthetic */ void t(Object obj) {
        n((vd.b) obj);
    }

    @Override // com.google.android.gms.internal.ads.e71
    public final Object u(Object obj, Throwable th2) {
        e81 e81Var = (e81) obj;
        vd.b bVarC = e81Var.c(th2);
        if (bVarC != null) {
            return bVarC;
        }
        throw new NullPointerException(al0.H("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", e81Var));
    }
}
