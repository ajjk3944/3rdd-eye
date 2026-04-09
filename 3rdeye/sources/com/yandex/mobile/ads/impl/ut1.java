package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ut1 implements yi {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f34216a;

    public ut1(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f34216a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.yi
    public final xi a(ti loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        vu1 vu1Var = this.f34216a;
        C4072a3 c4072a3F = loadController.f();
        vi viVar = new vi();
        wt1 wt1Var = new wt1(vu1Var, c4072a3F, loadController);
        return new tt1(loadController, vu1Var, c4072a3F, viVar, wt1Var, new dv1(c4072a3F, viVar, wt1Var), new rt1(c4072a3F));
    }
}
