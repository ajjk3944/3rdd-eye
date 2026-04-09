package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class di2 implements xp1<xh2> {

    /* renamed from: a, reason: collision with root package name */
    private final C4198s4 f26190a;

    /* renamed from: b, reason: collision with root package name */
    private final xp1<xh2> f26191b;

    public di2(C4198s4 adLoadingPhasesManager, xp1<xh2> requestListener) {
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        this.f26190a = adLoadingPhasesManager;
        this.f26191b = requestListener;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(fb2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f26190a.a(EnumC4191r4.f32474x);
        this.f26191b.a(error);
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(xh2 xh2Var) {
        xh2 vmap = xh2Var;
        kotlin.jvm.internal.l.f(vmap, "vmap");
        this.f26190a.a(EnumC4191r4.f32474x);
        this.f26191b.a((xp1<xh2>) vmap);
    }
}
