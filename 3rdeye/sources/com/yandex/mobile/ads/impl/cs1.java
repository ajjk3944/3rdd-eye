package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class cs1 {

    /* renamed from: a, reason: collision with root package name */
    private final nm1 f25766a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f25767b;

    public /* synthetic */ cs1(Context context, gd0 gd0Var) {
        this(context, new nm1(gd0Var));
    }

    public final bs1 a(vr1 contentController) {
        kotlin.jvm.internal.l.f(contentController, "contentController");
        Context appContext = this.f25767b;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        return new bs1(appContext, contentController, this.f25766a, new zs0(appContext), new vs0());
    }

    public cs1(Context context, nm1 proxyRewardedAdShowListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(proxyRewardedAdShowListener, "proxyRewardedAdShowListener");
        this.f25766a = proxyRewardedAdShowListener;
        this.f25767b = context.getApplicationContext();
    }
}
