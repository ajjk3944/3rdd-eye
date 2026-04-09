package com.applovin.impl.mediation;

import com.applovin.impl.c3;
import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.t2;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class b implements a.InterfaceC0077a, c.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6694a;

    /* renamed from: b, reason: collision with root package name */
    private final a f6695b;

    /* renamed from: c, reason: collision with root package name */
    private final c f6696c;

    public b(com.applovin.impl.sdk.k kVar) {
        this.f6694a = kVar;
        this.f6695b = new a(kVar);
        this.f6696c = new c(kVar, this);
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

    @Override // com.applovin.impl.mediation.a.InterfaceC0077a
    public void b(final c3 c3Var) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f6944a.c(c3Var);
            }
        }, c3Var.m0());
    }

    public void e(c3 c3Var) {
        long jN0 = c3Var.n0();
        if (jN0 >= 0) {
            this.f6696c.a(c3Var, jN0);
        }
        if (c3Var.x0() || c3Var.y0()) {
            this.f6695b.a(c3Var, this);
        }
    }

    public void a() {
        this.f6696c.a();
        this.f6695b.a();
    }

    @Override // com.applovin.impl.mediation.c.a
    public void a(c3 c3Var) {
        c(c3Var);
    }
}
