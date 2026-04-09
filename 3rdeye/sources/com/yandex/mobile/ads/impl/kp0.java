package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kp0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f29752a;

    public kp0(rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f29752a = sdkEnvironmentModule;
    }

    public final jp0 a(Context context, InterfaceC4164n4<jp0> itemsLoadFinishListener, h7 adRequestData, gd0 gd0Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(itemsLoadFinishListener, "itemsLoadFinishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        vu1 vu1Var = this.f29752a;
        C4198s4 c4198s4 = new C4198s4();
        dg0 dg0Var = new dg0();
        ip0 ip0Var = new ip0(context);
        op0 op0Var = new op0(context, gd0Var);
        C4072a3 c4072a3 = new C4072a3(ns.f30989e, vu1Var);
        return new jp0(context, vu1Var, itemsLoadFinishListener, adRequestData, c4198s4, dg0Var, ip0Var, op0Var, c4072a3, new km1(context, c4072a3, c4198s4, op0Var));
    }
}
