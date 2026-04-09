package com.applovin.impl.mediation;

import com.applovin.impl.l2;
import com.applovin.impl.mediation.C2133a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements C2133a.InterfaceC0311a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f20315a;

    /* renamed from: b, reason: collision with root package name */
    private final C2133a f20316b;

    /* renamed from: c, reason: collision with root package name */
    private final c f20317c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f20315a = kVar;
        this.f20316b = new C2133a(kVar);
        this.f20317c = new c(kVar, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void c(t2 t2Var) {
        h hVarA;
        if (t2Var == null || (hVarA = t2Var.A()) == null || !t2Var.w().compareAndSet(false, true)) {
            return;
        }
        l2.e(hVarA.c(), t2Var);
    }

    @Override // com.applovin.impl.mediation.c.a
    public void b(t2 t2Var) {
        c(t2Var);
    }

    public void e(t2 t2Var) {
        long jG0 = t2Var.g0();
        if (jG0 >= 0) {
            this.f20317c.a(t2Var, jG0);
        }
        if (t2Var.o0() || t2Var.p0()) {
            this.f20316b.a(t2Var, this);
        }
    }

    public void a() {
        this.f20317c.a();
        this.f20316b.a();
    }

    @Override // com.applovin.impl.mediation.C2133a.InterfaceC0311a
    public void a(t2 t2Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new s(1, this, t2Var), t2Var.f0());
    }
}
