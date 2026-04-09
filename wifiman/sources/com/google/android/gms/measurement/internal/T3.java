package com.google.android.gms.measurement.internal;

import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36213a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ A3 f36214b;

    T3(A3 a32, t7 t7Var) {
        this.f36213a = t7Var;
        this.f36214b = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36214b.f35772a.K0();
        C4833d7 c4833d7 = this.f36214b.f35772a;
        t7 t7Var = this.f36213a;
        c4833d7.zzl().j();
        c4833d7.L0();
        AbstractC7901p.f(t7Var.f36748a);
        c4833d7.y0(t7Var);
        c4833d7.w0(t7Var);
    }
}
