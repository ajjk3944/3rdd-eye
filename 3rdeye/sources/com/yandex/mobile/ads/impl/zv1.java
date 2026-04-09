package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class zv1 implements c81 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f36763a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f36764b;

    public zv1(vu1 sdkEnvironmentModule, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f36763a = sdkEnvironmentModule;
        this.f36764b = adConfiguration;
    }

    @Override // com.yandex.mobile.ads.impl.c81
    public final b81 a(x51 nativeAdLoadManager) {
        kotlin.jvm.internal.l.f(nativeAdLoadManager, "nativeAdLoadManager");
        vu1 vu1Var = this.f36763a;
        return new yv1(vu1Var, nativeAdLoadManager, this.f36764b, new vv1(vu1Var));
    }
}
