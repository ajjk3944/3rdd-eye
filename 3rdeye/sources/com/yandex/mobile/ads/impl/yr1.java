package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class yr1 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f35968a;

    public yr1(rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f35968a = sdkEnvironmentModule;
    }

    public final xr1 a(Context context, InterfaceC4164n4<xr1> itemsLoadFinishListener, h7 adRequestData, gd0 gd0Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(itemsLoadFinishListener, "itemsLoadFinishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        vu1 vu1Var = this.f35968a;
        C4198s4 c4198s4 = new C4198s4();
        dg0 dg0Var = new dg0();
        wr1 wr1Var = new wr1(context);
        cs1 cs1Var = new cs1(context, gd0Var);
        C4072a3 c4072a3 = new C4072a3(ns.f30990f, vu1Var);
        return new xr1(context, vu1Var, itemsLoadFinishListener, adRequestData, c4198s4, dg0Var, wr1Var, cs1Var, c4072a3, new mm1(context, c4072a3, c4198s4, cs1Var), new rr1());
    }
}
