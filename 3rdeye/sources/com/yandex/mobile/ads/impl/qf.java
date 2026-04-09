package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qf {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f32168a;

    public qf(rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f32168a = sdkEnvironmentModule;
    }

    public final nf a(Context context, InterfaceC4164n4<nf> finishListener, h7 adRequestData, gd0 gd0Var) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(finishListener, "finishListener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        vu1 vu1Var = this.f32168a;
        C4198s4 c4198s4 = new C4198s4();
        dg0 dg0Var = new dg0();
        mf mfVar = new mf(context);
        C4072a3 c4072a3 = new C4072a3(ns.i, vu1Var);
        return new nf(context, vu1Var, finishListener, adRequestData, c4198s4, dg0Var, mfVar, c4072a3, new im1(context, c4072a3, c4198s4, gd0Var));
    }
}
