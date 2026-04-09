package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class r61 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f32542a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f32543b;

    public r61(vu1 sdkEnvironmentModule, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f32542a = sdkEnvironmentModule;
        this.f32543b = adConfiguration;
    }

    public final c81 a(a8<p61> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        vy0 vy0VarD = adResponse.D();
        return vy0VarD != null ? new ky0(adResponse, vy0VarD) : new zv1(this.f32542a, this.f32543b);
    }
}
