package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.vy1;

/* loaded from: classes3.dex */
public final class r90 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f32558a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f32559b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f32560c;

    public r90(Context context, rm2 sdkEnvironmentModule, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f32558a = context;
        this.f32559b = sdkEnvironmentModule;
        this.f32560c = adConfiguration;
    }

    public final q90 a(u90 listener, h7 adRequestData, fa0 fa0Var) {
        kotlin.jvm.internal.l.f(listener, "listener");
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        Context context = this.f32558a;
        vu1 vu1Var = this.f32559b;
        C4072a3 c4072a3 = this.f32560c;
        q90 q90Var = new q90(context, vu1Var, c4072a3, listener, adRequestData, fa0Var, new rt1(c4072a3), new k71(c4072a3), new o91(context, vu1Var, c4072a3, new C4198s4()), new dg0());
        q90Var.a(adRequestData.a());
        q90Var.a((vy1) new lb0(-1, 0, vy1.a.f34739d));
        return q90Var;
    }
}
