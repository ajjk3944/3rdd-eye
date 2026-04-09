package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class cg1 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f25635c = {fa.a(cg1.class, "loadController", "getLoadController()Lcom/monetization/ads/base/BaseAdLoadController;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final dg1 f25636a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f25637b;

    public /* synthetic */ cg1(vj vjVar, vy0 vy0Var, C4198s4 c4198s4) {
        this(vjVar, vy0Var, c4198s4, new ia());
    }

    public final void a() {
        vj vjVar = (vj) this.f25637b.getValue(this, f25635c[0]);
        if (vjVar == null || vjVar.h()) {
            return;
        }
        vjVar.a(this.f25636a);
    }

    public cg1(vj<?> loadController, vy0 mediationData, C4198s4 adLoadingPhasesManager, ia adapterLoadingDurationProvider) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(mediationData, "mediationData");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(adapterLoadingDurationProvider, "adapterLoadingDurationProvider");
        this.f25637b = bo1.a(loadController);
        this.f25636a = new dg1(new eg1(ia.a(adLoadingPhasesManager.b()), mediationData));
    }
}
