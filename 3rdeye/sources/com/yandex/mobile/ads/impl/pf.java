package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.rf;

/* loaded from: classes3.dex */
public final class pf {
    public static of a(Context context, rm2 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext);
        du1 du1VarA = ew1.a.a().a(applicationContext);
        return (du1VarA == null || !du1VarA.c0()) ? new bk(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new qf(sdkEnvironmentModule)) : new cn(applicationContext, sdkEnvironmentModule, new zs0(applicationContext), new vs0(), new qf(sdkEnvironmentModule), rf.a.a(), new qk1());
    }
}
