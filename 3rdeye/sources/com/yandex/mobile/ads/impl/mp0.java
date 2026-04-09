package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.sp0;

/* loaded from: classes3.dex */
public final class mp0 {
    public static lp0 a(Context context, rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext);
        du1 du1VarA = ew1.a.a().a(applicationContext);
        return (du1VarA == null || !du1VarA.n0()) ? new ik(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new kp0(sdkEnvironmentModule)) : new fn(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new kp0(sdkEnvironmentModule), sp0.a.a(), new qk1());
    }
}
