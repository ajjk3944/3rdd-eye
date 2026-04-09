package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ay0 implements xc0 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<String> f25021a;

    /* renamed from: b, reason: collision with root package name */
    private final vy0 f25022b;

    public ay0(a8<String> adResponse, vy0 mediationData) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        this.f25021a = adResponse;
        this.f25022b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<hp0> a(dd0<hp0> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new com.monetization.ads.mediation.interstitial.c(loadController, this.f25021a, this.f25022b);
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<vr1> b(dd0<vr1> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new ny0(loadController, this.f25021a, this.f25022b);
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<lf> c(dd0<lf> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        a8<String> adResponse = this.f25021a;
        vy0 mediationData = this.f25022b;
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        C4072a3 c4072a3F = loadController.f();
        zx0 zx0Var = new zx0(c4072a3F);
        ux0 ux0Var = new ux0(c4072a3F, adResponse);
        vx0 vx0Var = new vx0(new nx0(mediationData.c(), zx0Var, ux0Var));
        C4198s4 c4198s4I = loadController.i();
        cg1 cg1Var = new cg1(loadController, mediationData, c4198s4I, new ia());
        com.monetization.ads.mediation.appopenad.c cVar = new com.monetization.ads.mediation.appopenad.c();
        fx0 fx0Var = new fx0(c4072a3F, c4198s4I, cVar, ux0Var, vx0Var, cg1Var, new rx0());
        return new com.monetization.ads.mediation.appopenad.b(fx0Var, cVar, new com.monetization.ads.mediation.appopenad.a(loadController, fx0Var), ux0Var);
    }
}
