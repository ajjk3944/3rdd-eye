package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ac {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<tn0> f24605a;

    /* renamed from: b, reason: collision with root package name */
    private final bc f24606b;

    public ac(mb2<tn0> videoAdInfo, bc advertiserPresentController) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(advertiserPresentController, "advertiserPresentController");
        this.f24605a = videoAdInfo;
        this.f24606b = advertiserPresentController;
    }

    public final zb a() {
        q12 q12VarA = new r12(this.f24606b).a(this.f24605a);
        w02 w02VarF = this.f24605a.f();
        return (q12.f31994c != q12VarA || w02VarF == null) ? q12.f31995d == q12VarA ? new x40() : new vy() : new v02(w02VarF);
    }
}
