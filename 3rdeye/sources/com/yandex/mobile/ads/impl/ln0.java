package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ln0 {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f30055a;

    /* renamed from: b, reason: collision with root package name */
    private final zs f30056b;

    /* renamed from: c, reason: collision with root package name */
    private final mb2<tn0> f30057c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f30058d;

    public ln0(Context context, vu1 sdkEnvironmentModule, zs coreInstreamAdBreak, mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coreInstreamAdBreak, "coreInstreamAdBreak");
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f30055a = sdkEnvironmentModule;
        this.f30056b = coreInstreamAdBreak;
        this.f30057c = videoAdInfo;
        this.f30058d = context.getApplicationContext();
    }

    public final ze1 a() {
        this.f30056b.c();
        nu nuVarB = this.f30057c.b();
        Context context = this.f30058d;
        kotlin.jvm.internal.l.e(context, "context");
        vu1 vu1Var = this.f30055a;
        in0 in0Var = new in0(context, vu1Var, nuVarB, new C4072a3(ns.f30992h, vu1Var));
        Context context2 = this.f30058d;
        kotlin.jvm.internal.l.e(context2, "context");
        return new bn0(context2, in0Var, new l82(new k82()));
    }
}
