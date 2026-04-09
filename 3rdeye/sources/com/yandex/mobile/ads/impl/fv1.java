package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class fv1 implements xc0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f27465a;

    public fv1(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f27465a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<hp0> a(dd0<hp0> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new zu1(loadController, this.f27465a);
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<vr1> b(dd0<vr1> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new zu1(loadController, this.f27465a);
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<lf> c(dd0<lf> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new zu1(loadController, this.f27465a);
    }
}
