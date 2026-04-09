package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ui {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f34067a;

    public ui(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f34067a = sdkEnvironmentModule;
    }

    public final yi a(a8<String> adResponse) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        vy0 vy0VarD = adResponse.D();
        return vy0VarD != null ? new xx0(adResponse, vy0VarD) : cs.f25764c == adResponse.v() ? new xv1(this.f34067a) : new ut1(this.f34067a);
    }
}
