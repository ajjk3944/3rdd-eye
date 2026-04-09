package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class j7 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36562a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36563b;

    j7(C4833d7 c4833d7, t7 t7Var) {
        this.f36562a = t7Var;
        this.f36563b = c4833d7;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        if (!this.f36563b.a0((String) AbstractC7901p.l(this.f36562a.f36748a)).x() || !C4839e4.p(this.f36562a.f36768u).x()) {
            this.f36563b.zzj().G().a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        C4864h2 c4864h2F = this.f36563b.f(this.f36562a);
        if (c4864h2F != null) {
            return c4864h2F.m();
        }
        this.f36563b.zzj().H().a("App info was null when attempting to get app instance id");
        return null;
    }
}
