package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ky0 implements c81 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<p61> f29820a;

    /* renamed from: b, reason: collision with root package name */
    private final vy0 f29821b;

    public ky0(a8<p61> adResponse, vy0 mediationData) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        this.f29820a = adResponse;
        this.f29821b = mediationData;
    }

    @Override // com.yandex.mobile.ads.impl.c81
    public final b81 a(x51 nativeAdLoadManager) {
        kotlin.jvm.internal.l.f(nativeAdLoadManager, "nativeAdLoadManager");
        a8<p61> a8Var = this.f29820a;
        vy0 vy0Var = this.f29821b;
        C4072a3 c4072a3F = nativeAdLoadManager.f();
        zx0 zx0Var = new zx0(c4072a3F);
        ux0 ux0Var = new ux0(c4072a3F, a8Var);
        nx0 nx0Var = new nx0(vy0Var.c(), zx0Var, ux0Var);
        gy0 gy0Var = new gy0(nx0Var);
        C4198s4 c4198s4I = nativeAdLoadManager.i();
        cg1 cg1Var = new cg1(nativeAdLoadManager, vy0Var, c4198s4I, new ia());
        hy0 hy0Var = new hy0();
        fx0 fx0Var = new fx0(c4072a3F, c4198s4I, hy0Var, ux0Var, gy0Var, cg1Var, new rx0());
        return new jy0(nativeAdLoadManager, a8Var, vy0Var, c4072a3F, zx0Var, ux0Var, nx0Var, gy0Var, c4198s4I, cg1Var, hy0Var, fx0Var, new j71(a8Var, nativeAdLoadManager, fx0Var));
    }
}
