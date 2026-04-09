package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class cz0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dz0 f10278a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10279b;

    public /* synthetic */ cz0(dz0 dz0Var, int i4) {
        this.f10278a = dz0Var;
        this.f10279b = i4;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i4 = this.f10279b - 1;
        dz0 dz0Var = this.f10278a;
        if (i4 == 1) {
            return (az0) dz0Var.f10617a.a();
        }
        if (i4 == 2) {
            return (az0) dz0Var.f10618b.a();
        }
        if (i4 == 3) {
            return (az0) dz0Var.f10619c.a();
        }
        dz0Var.getClass();
        throw new IllegalArgumentException();
    }
}
