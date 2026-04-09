package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class F3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f35868a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f35869b;

    F3(A3 a32, t7 t7Var) {
        this.f35868a = t7Var;
        this.f35869b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35869b.f35772a.K0();
        C4833d7 c4833d7 = this.f35869b.f35772a;
        t7 t7Var = this.f35868a;
        c4833d7.zzl().j();
        c4833d7.L0();
        AbstractC7901p.f(t7Var.f36748a);
        c4833d7.f(t7Var);
    }
}
