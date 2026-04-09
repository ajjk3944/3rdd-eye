package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class wt1 implements cv1<vt1> {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f35057a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f35058b;

    /* renamed from: c, reason: collision with root package name */
    private final ti f35059c;

    /* renamed from: d, reason: collision with root package name */
    private vt1 f35060d;

    public wt1(vu1 sdkEnvironmentModule, C4072a3 adConfiguration, ti adLoadController) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadController, "adLoadController");
        this.f35057a = sdkEnvironmentModule;
        this.f35058b = adConfiguration;
        this.f35059c = adLoadController;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a() {
        vt1 vt1Var = this.f35060d;
        if (vt1Var != null) {
            vt1Var.a();
        }
        this.f35060d = null;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a(a8<String> adResponse, vy1 sizeInfo, String htmlResponse, ev1<vt1> creationListener) throws gj2 {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(sizeInfo, "sizeInfo");
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        kotlin.jvm.internal.l.f(creationListener, "creationListener");
        Context contextL = this.f35059c.l();
        ap0 ap0VarC = this.f35059c.C();
        de2 de2VarD = this.f35059c.D();
        vu1 vu1Var = this.f35057a;
        C4072a3 c4072a3 = this.f35058b;
        vt1 vt1Var = new vt1(contextL, vu1Var, c4072a3, adResponse, ap0VarC, this.f35059c, new vi(), new b21(), new kg0(), new kj(contextL, c4072a3), new ri());
        this.f35060d = vt1Var;
        vt1Var.a(sizeInfo, htmlResponse, de2VarD, creationListener);
    }
}
