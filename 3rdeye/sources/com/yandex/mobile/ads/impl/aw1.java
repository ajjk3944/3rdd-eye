package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class aw1 implements xc0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f25006a;

    public aw1(vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f25006a = sdkEnvironmentModule;
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<hp0> a(dd0<hp0> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new bw1(loadController, this.f25006a);
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<vr1> b(dd0<vr1> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new cw1(loadController, this.f25006a, new u51());
    }

    @Override // com.yandex.mobile.ads.impl.xc0
    public final wc0<lf> c(dd0<lf> loadController) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        return new bw1(loadController, this.f25006a);
    }
}
