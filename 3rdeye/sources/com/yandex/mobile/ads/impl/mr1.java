package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class mr1 implements InterfaceC4209u1 {

    /* renamed from: a, reason: collision with root package name */
    private final es1 f30495a;

    /* renamed from: b, reason: collision with root package name */
    private final nr1 f30496b;

    public mr1(InterfaceC4105f1 adActivityListener, es1 closeVerificationController, nr1 rewardController) {
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        kotlin.jvm.internal.l.f(rewardController, "rewardController");
        this.f30495a = closeVerificationController;
        this.f30496b = rewardController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4209u1
    public final void b() {
        this.f30495a.a();
        this.f30496b.a();
    }
}
