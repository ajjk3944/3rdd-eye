package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ft0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f27457a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27458b;

    /* renamed from: c, reason: collision with root package name */
    private final C4148l2 f27459c;

    public ft0(Context context, rm2 sdkEnvironmentModule, xs instreamVideoAd) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(instreamVideoAd, "instreamVideoAd");
        this.f27457a = sdkEnvironmentModule;
        this.f27458b = context.getApplicationContext();
        this.f27459c = new C4148l2(instreamVideoAd.a());
    }

    public final et0 a(zs coreInstreamAdBreak) {
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        Context context = this.f27458b;
        kotlin.jvm.internal.l.e(context, "context");
        vu1 vu1Var = this.f27457a;
        C4148l2 c4148l2 = this.f27459c;
        nl0 nl0Var = new nl0();
        zl0 zl0Var = new zl0();
        lt0 lt0Var = new lt0();
        return new et0(context, vu1Var, coreInstreamAdBreak, c4148l2, nl0Var, zl0Var, lt0Var, new ab2(), new ht0(context, vu1Var, coreInstreamAdBreak, c4148l2, lt0Var, nl0Var));
    }
}
