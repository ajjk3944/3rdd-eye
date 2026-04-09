package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gc0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final km.n f11485a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f11486b;

    /* renamed from: c, reason: collision with root package name */
    public final qd0 f11487c;

    /* renamed from: d, reason: collision with root package name */
    public final lh0 f11488d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f11489e;

    /* renamed from: f, reason: collision with root package name */
    public final oe f11490f;
    public final za.a g;

    /* renamed from: h, reason: collision with root package name */
    public final ct0 f11491h;

    /* renamed from: i, reason: collision with root package name */
    public final qh0 f11492i;
    public final jq0 j;

    public gc0(Context context, Executor executor, oe oeVar, za.a aVar, km.n nVar, lh0 lh0Var, ct0 ct0Var, qd0 qd0Var, qh0 qh0Var, jq0 jq0Var) {
        this.f11486b = context;
        this.f11489e = executor;
        this.f11490f = oeVar;
        this.g = aVar;
        this.f11485a = nVar;
        this.f11488d = lh0Var;
        this.f11491h = ct0Var;
        this.f11487c = qd0Var;
        this.f11492i = qh0Var;
        this.j = jq0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        hc0 hc0Var = new hc0(this);
        synchronized (hc0Var) {
            String str = (String) va.s.f36163e.f36166c.a(sk.f16365v4);
            oe oeVar = hc0Var.f11832f;
            km.n nVar = hc0Var.f11828b;
            qh0 qh0Var = hc0Var.f11835k;
            x71 x71VarG = yo0.G(yo0.B(new xz(hc0Var.f11829c, oeVar, hc0Var.g, nVar, qh0Var, hc0Var.f11836l, hc0Var.f11830d, str), fx.f11279f), new hu(1, hc0Var), hc0Var.f11831e);
            hc0Var.f11837m = x71VarG;
            nn1.e(x71VarG, "NativeJavascriptExecutor.initializeEngine");
        }
        return hc0Var;
    }
}
