package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.ls1;

/* loaded from: classes3.dex */
public final class as1 {
    public static zr1 a(Context context, rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext);
        du1 du1VarA = ew1.a.a().a(applicationContext);
        return (du1VarA == null || !du1VarA.B0()) ? new nk(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new yr1(sdkEnvironmentModule)) : new gn(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new yr1(sdkEnvironmentModule), ls1.a.a(), new qk1());
    }
}
