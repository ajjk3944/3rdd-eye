package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class b implements a.InterfaceC0013a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4653a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4654b;

    /* renamed from: c, reason: collision with root package name */
    private final c f4655c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f4653a = kVar;
        this.f4654b = new a(kVar);
        this.f4655c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(c3 c3Var) {
        h hVarA;
        if (c3Var == null || (hVarA = c3Var.A()) == null || !c3Var.w().compareAndSet(false, true)) {
            return;
        }
        t2.e(hVarA.c(), c3Var);
    }

    @Override // com.applovin.impl.mediation.a.InterfaceC0013a
    public void b(c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new r(2, this, c3Var), c3Var.m0());
    }

    public void e(c3 c3Var) {
        long jN0 = c3Var.n0();
        if (jN0 >= 0) {
            this.f4655c.a(c3Var, jN0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.f4654b.a(c3Var, this);
        }
    }

    public void a() {
        this.f4655c.a();
        this.f4654b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }
}
