package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class tf {

    /* renamed from: a, reason: collision with root package name */
    private final gd0 f33568a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f33569b;

    public tf(Context context, gd0 gd0Var) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f33568a = gd0Var;
        this.f33569b = context.getApplicationContext();
    }

    public final sf a(lf appOpenAdContentController) {
        kotlin.jvm.internal.l.f(appOpenAdContentController, "appOpenAdContentController");
        Context appContext = this.f33569b;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        return new sf(appContext, appOpenAdContentController, new jm1(this.f33568a), new zs0(appContext), new vs0());
    }
}
