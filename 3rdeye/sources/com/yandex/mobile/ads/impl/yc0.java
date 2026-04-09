package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class yc0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f35707a;

    public yc0(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f35707a = sdkEnvironmentModule;
    }

    public final xc0 a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        vy0 vy0VarD = adResponse.D();
        return vy0VarD != null ? new ay0(adResponse, vy0VarD) : cs.f25764c == adResponse.v() ? new aw1(this.f35707a) : new fv1(this.f35707a);
    }
}
