package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4231x2 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4105f1 f35150a;

    public C4231x2(C4188r1 adActivityListener) {
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        this.f35150a = adActivityListener;
    }

    public final InterfaceC4209u1 a(a8<?> adResponse, es1 closeVerificationController) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(closeVerificationController, "closeVerificationController");
        if (adResponse.n() != ns.f30990f) {
            return new gp0();
        }
        InterfaceC4105f1 interfaceC4105f1 = this.f35150a;
        return new mr1(interfaceC4105f1, closeVerificationController, new nr1(interfaceC4105f1));
    }
}
