package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ez0 implements my0 {

    /* renamed from: a, reason: collision with root package name */
    public final sx0 f10926a;

    /* renamed from: b, reason: collision with root package name */
    public final dz0 f10927b;

    /* renamed from: c, reason: collision with root package name */
    public final bz0 f10928c;

    /* renamed from: d, reason: collision with root package name */
    public final ExecutorService f10929d;

    /* renamed from: e, reason: collision with root package name */
    public final g21 f10930e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10931f = new AtomicReference();

    public ez0(sx0 sx0Var, dz0 dz0Var, bz0 bz0Var, ExecutorService executorService, g21 g21Var) {
        this.f10926a = sx0Var;
        this.f10927b = dz0Var;
        this.f10928c = bz0Var;
        this.f10929d = executorService;
        this.f10930e = g21Var;
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final vd.b b() {
        sx0 sx0Var = this.f10926a;
        int iD = sx0Var.D();
        boolean zF = sx0Var.F();
        dz0 dz0Var = this.f10927b;
        dz0Var.getClass();
        n81 n81VarS = n81.s(yo0.z(dz0Var.f10620d, new cz0(dz0Var, iD)));
        k20 k20Var = k20.f12999n;
        k81 k81Var = k81.f13081a;
        w71 w71VarF = yo0.F(n81VarS, k20Var, k81Var);
        if (zF && iD != 2) {
            w71VarF = yo0.F(yo0.C(n81.s(w71VarF), Throwable.class, o5.f14558u, k81Var), new fp(dz0Var), k81Var);
        }
        x71 x71VarG = yo0.G(n81.s(w71VarF), new hu(9, this), k81Var);
        x71VarG.a(new q81(0, x71VarG, new ne0(19, this)), this.f10929d);
        return x71VarG;
    }
}
